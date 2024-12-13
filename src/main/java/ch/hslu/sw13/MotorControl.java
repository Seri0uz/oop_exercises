package ch.hslu.sw13;

import ch.hslu.sw10.State;
import ch.hslu.sw10.Switchable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MotorControl implements Switchable {
    Motor motor;
    MotorView view;

    private static final Logger LOG =
            LoggerFactory.getLogger(MotorControl.class);

    public MotorControl(MotorView view, Motor motor) {
        this.motor = motor;
        this.view = view;
        this.view.addEngineButtonActionListener(this::handleEngineButtonAction);
        this.view.addRPMButtonActionListener(this::handleRpmButtonAction);
    }

    public void handleEngineButtonAction(ActionEvent event) {
        if (event.getSource() == view.getButtonOn())
            handleButtonOn();
        if (event.getSource() == view.getButtonOff())
            handleButtonOff();
    }

    public void handleButtonOn() {
        JLabel label = new JLabel("The engine is ON.");
        label.setBackground(Color.GREEN);
        view.setLabelState(label);
        switchOn();
        JLabel labelRpm = new JLabel("RPM is" + motor.getRpm());
        view.setLabelRPM(labelRpm);
        view.getButtonOn().setEnabled(false);
        view.getButtonOff().setEnabled(true);
        view.getButtonRpmPlus().setEnabled(true);
        view.getButtonRpmMinus().setEnabled(true);
        LOG.info("The engine is ON.");

   }

    public void handleButtonOff() {
        JLabel label = new JLabel("The engine is OFF.");
        label.setBackground(Color.RED);
        view.setLabelState(label);
        switchOff();
        JLabel labelRpm = new JLabel("RPM is" + motor.getRpm());
        view.setLabelRPM(labelRpm);
        view.getButtonOn().setEnabled(true);
        view.getButtonOff().setEnabled(false);
        view.getButtonRpmMinus().setEnabled(false);
        view.getButtonRpmPlus().setEnabled(false);
        LOG.info("The engine is OFF.");

    }

   public void handleRpmButtonAction(final ActionEvent event) {
        if (event.getSource() == view.getButtonRpmPlus()) {
            if (motor.getRpm() == 0)
                view.getButtonRpmPlus().setEnabled(false);
            else {
                try {
                    view.getButtonRpmPlus().setEnabled(true);
                    motor.setRpm(motor.getRpm() + 100);
                    JLabel label = new JLabel("RPM is" + motor.getRpm());
                    view.setLabelRPM(label);
                }
                catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null,"RPM is to high","RPM Error",JOptionPane.ERROR_MESSAGE);
                    view.closeFrame();
                    LOG.error("RPM is higher than 5000");
                }
            }
        }
        if (event.getSource() == view.getButtonRpmMinus()) {
            motor.setRpm(motor.getRpm() - 100);
            JLabel label = new JLabel("RPM is" + motor.getRpm());
            view.setLabelRPM(label);
            if (motor.getRpm() == 0)
                handleButtonOff();
        }
   }

    @Override
    public void switchOn() {
        if (isSwitchedOff()){
            motor.setState(State.ON);
            motor.setRpm(1200);
            LOG.info("Motor Switched on");
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn()){
            motor.setState(State.OFF);
            motor.setRpm(0);
            LOG.info("Motor Switched off");
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return motor.getState() == State.ON;
    }

    @Override
    public boolean isSwitchedOff() {
        return motor.getState() == State.OFF;
    }



    public static void main(final String[] args) {
        Motor motor = new Motor();
        MotorView motorView = new MotorView();
        new MotorControl(motorView, motor);
    }
}


