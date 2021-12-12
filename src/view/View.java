package view;

import controller.*;
import netscape.javascript.JSObject;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.BlockingQueue;

public class View extends JFrame {
    BlockingQueue<Message> queue;
    JLabel labelRed;
    JLabel labelGreen;
    JLabel labelBlue;
    JTextField textFieldRed;
    JTextField textFieldGreen;
    JTextField textFieldBlue;
    JButton buttonUpdate;
    JButton buttonRest;
    BarGraph barGraph;

    public View(BlockingQueue<Message> queue) {
        this.queue = queue;

        this.labelRed = new JLabel("Red");
        this.labelGreen = new JLabel("Green");
        this.labelBlue = new JLabel("Blue");
        this.textFieldGreen = new JTextField(5);
        this.textFieldRed = new JTextField(5);
        this.textFieldBlue = new JTextField(5);
        this.buttonUpdate = new JButton("Update");
        this.buttonRest = new JButton("Reset");
        this.barGraph = new BarGraph();

        buttonUpdate.addActionListener(e -> {
            int valRed = Integer.parseInt(textFieldRed.getText());
            int valGreen = Integer.parseInt(textFieldGreen.getText());
            int valBlue = Integer.parseInt(textFieldBlue.getText());
            try {
                Message msg = new UpdatedMessage(valRed, valGreen, valBlue);
                queue.put(msg);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        });

        buttonRest.addActionListener(e -> {
            int valRed = 0;
            int valGreen = 0;
            int valBlue = 0;
            try {
                Message msg = new ResetMessage(valRed,valGreen,valBlue);
                queue.put(msg);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        this.add(labelRed);
        this.add(labelGreen);
        this.add(labelBlue);
        this.add(textFieldRed);
        this.add(textFieldGreen);
        this.add(textFieldBlue);
        this.add(buttonUpdate);
        this.add(buttonRest);
        this.add(barGraph);

        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateView(int valR, int valG, int valB ){
        this.textFieldRed.setText(Integer.toString(valR));
        this.textFieldGreen.setText(Integer.toString(valG));
        this.textFieldBlue.setText(Integer.toString(valB));
        barGraph.updateValues(valR, valG, valB);
        barGraph.repaint();
    }

}
