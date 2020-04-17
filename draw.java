/* Based on the VUW ecs100 template
 * copy of mr Ny's lollipop code
 *
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * draws pictures of lollipops on the graphics pane
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class draw{
   

    /**
     * Constructor for objects of class draw 
     */
    public draw(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /**
     * Draw a lollipop at (300, 180), asking the user for the size
     */
    public void doDrawLollipop(){
        double diam = UI.askDouble("Diameter of lollipop: ");
        double stickHeight = UI.askDouble("Length of stick: ");
        drawLollipop(300, 180, diam, stickHeight);
        drawLollipop(50, 60, diam/2, stickHeight/2);
        drawLollipop(400, 100, diam*1.5, stickHeight*1.5);
        
    }
    
    /**
     * blah
     */
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0; //left of lollipop
        double top = y-size/2.0; //top of lollipop
        double bottom = y+stick; //bottom of stick
        
        //set colour of stick
        UI.setColor(Color.black);
        // set line width to 10
        UI.setLineWidth(size/8.0);
        // draw line (300, 200) to (300, 400)
        UI.drawLine(x, y, x, bottom);
        // set line width to 1
        UI.setLineWidth(1);
        // set colour to red
        UI.setColor(Color.red);
        //fill oval  (260, 160) 80 x 80
        UI.fillOval(left, top, size, size);
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        draw obj = new draw();
        obj.doDrawLollipop();
    }

}

