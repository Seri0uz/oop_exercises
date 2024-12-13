package ch.hslu.sw13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class MotorView extends JFrame{
    private final JFrame frame = new JFrame("Engine");
    private final JPanel panelEngine = new JPanel();
    private final JPanel panelRpm = new JPanel();
    private final JLabel labelState = new JLabel("The engine is OFF.");
    private final JButton buttonOn = new JButton("On");
    private final JButton buttonOff = new JButton("Off");

    private final JLabel labelRPM = new JLabel("RPM is 0");
    private final JButton buttonRpmPlus = new JButton("RPM increase");
    private final JButton buttonRpmMinus = new JButton("RPM decrease");



    public MotorView() {

        frame.setPreferredSize(new Dimension(400, 200));
        frame.setLayout(new BorderLayout());

        frame.add(panelEngine, BorderLayout.NORTH);
        frame.add(panelRpm, BorderLayout.SOUTH);

        panelEngine.add(buttonOn, BorderLayout.WEST);
        panelEngine.add(labelState, BorderLayout.CENTER);
        this.labelState.setOpaque(true);
        labelState.setBackground(Color.RED);
        panelEngine.add(buttonOff, BorderLayout.EAST);
        buttonOff.setEnabled(false);

        panelRpm.add(buttonRpmPlus, BorderLayout.WEST);
        buttonRpmPlus.setEnabled(false);
        panelRpm.add(labelRPM, BorderLayout.CENTER);
        panelRpm.add(buttonRpmMinus, BorderLayout.EAST);
        buttonRpmMinus.setEnabled(false);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void addEngineButtonActionListener(ActionListener listener) {
        buttonOn.addActionListener(listener);
        buttonOff.addActionListener(listener);
    }

    public void addRPMButtonActionListener(ActionListener listener) {
        buttonRpmPlus.addActionListener(listener);
        buttonRpmMinus.addActionListener(listener);
    }

    public JButton getButtonOn() {
        return buttonOn;
    }

    public JButton getButtonOff() {
        return buttonOff;
    }

    public JButton getButtonRpmPlus() {
        return buttonRpmPlus;
    }

    public JButton getButtonRpmMinus() {
        return buttonRpmMinus;
    }

    public void setLabelState(final JLabel label) {
        this.labelState.setText(label.getText());
        this.labelState.setBackground(label.getBackground());
    }

    public void setLabelRPM(final JLabel label) {
        this.labelRPM.setText(label.getText());
    }

    public void closeFrame() {
        frame.dispose();
    }

}

