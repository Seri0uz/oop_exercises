package ch.hslu.sw13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotorControl {
    Motor motor;
    MotorView view;

    private static final Logger LOG =
            LoggerFactory.getLogger(MotorControl.class);

    public MotorControl(MotorView view, Motor motor) {
        this.motor = motor;
        this.view = view;
        this.view.addButtonActionListener(this::handleButtonAction);
    }

public void handleButtonAction(final ActionEvent event) {
        if (event.getSource() == view.getButtonOn()) {
            JLabel label = new JLabel("The engine is ON.");
            label.setBackground(Color.GREEN);
            view.setLabelState(label);
            motor.switchOn();
            LOG.info("The engine is ON.");
        }
        if (event.getSource() == view.getButtonOff()) {
            JLabel label = new JLabel("The engine is OFF.");
            label.setBackground(Color.RED);
            view.setLabelState(label);
            motor.switchOff();
            LOG.info("The engine is OFF.");
        }
   }


    public static void main(final String[] args) {
        Motor motor = new Motor();
        MotorView motorView = new MotorView();
        new MotorControl(motorView, motor);
    }
}


