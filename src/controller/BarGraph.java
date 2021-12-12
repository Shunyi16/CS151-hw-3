package controller;

import javax.swing.*;
import java.awt.*;

public class BarGraph extends JComponent {

    int red, green, blue;

    public  void updateValues(int valR, int valG, int valB){
        this.red = valR;
        this.green = valG;
        this.blue = valB;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.setColor(Color.GREEN);
        g.setColor(Color.BLUE);

    }

    public Dimension gerPreferredSize(){
        return new Dimension(500, 500);
    }

}
