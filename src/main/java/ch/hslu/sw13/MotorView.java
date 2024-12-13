package ch.hslu.sw13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class MotorView extends JFrame{
    private final JLabel labelState = new JLabel("The engine is OFF.");
    private final JButton buttonOn = new JButton("On");
    private final JButton buttonOff = new JButton("Off");


    public MotorView() {
        super("Switch");

        this.labelState.setHorizontalAlignment(JLabel.CENTER);
        this.labelState.setOpaque(true);

        this.setLayout(new BorderLayout());
        this.add(buttonOn, BorderLayout.NORTH);
        this.add(labelState, BorderLayout.CENTER);
        this.add(buttonOff, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addButtonActionListener(ActionListener listener) {
        buttonOn.addActionListener(listener);
        buttonOff.addActionListener(listener);
    }

    public JButton getButtonOn() {
        return buttonOn;
    }

    public JButton getButtonOff() {
        return buttonOff;
    }

    public void setLabelState(final JLabel label) {
        this.labelState.setText(label.getText());
        this.labelState.setBackground(label.getBackground());
    }

}

