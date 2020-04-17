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
    public static final double X = 300.0; // horizontal centre of the lollipop
    public static final double Y = 180.0; // vertical centre of the lollipop
    public static final double SIZE = 80.0; // diameter of lollipop
    public static final double STICK = 200.0; // length of stick

    /**
     * Constructor for objects of class draw 
     */
    public draw(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    /**
     * blah
     */
    private void drawLollipop() {
        // set line width to 10
        UI.setLineWidth(SIZE/8.0);
        // draw line (300, 200) to (300, 400)
        UI.drawLine(X, Y, X, Y+STICK);
        // set line width to 1
        UI.setLineWidth(1);
        // set colour to red
        UI.setColor(Color.red);
        //fill oval  (260, 160) 80 x 80
        UI.fillOval(X-SIZE/2.0, Y-SIZE/2.0, SIZE, SIZE);
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        draw obj = new draw();
        obj.drawLollipop();
    }

}

