package controller;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BarGraph extends JComponent {

    int red, green, blue;

    public  void updateValues(int valR, int valG, int valB) {
        this.red = valR;
        this.green = valG;
        this.blue = valB;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawRect(500, 300 - 20 * red, 50, red *20);
        g.fillRect(500,300 - 20 * red, 50, red * 20);
        g.setColor(Color.GREEN);
        g.drawRect(200, 300 - 20 * green, 50, green *20);
        g.fillRect(200,300 - 20 *green, 50, green * 20);
        g.setColor(Color.BLUE);
        g.drawRect(350, 300 - 20 * blue, 50, blue *20);
        g.fillRect(350, 300 - 20 * blue, 50, blue * 20);

    }
/*
    @Override
    public Dimension gerPreferredSize(){
        return new Dimension(500, 500);
    }

 */

}
