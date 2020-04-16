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
     * blah
     */
    private void drawLollipop() {
        // set line width to 10
        UI.setLineWidth(10);
        // draw line (300, 200) to (300, 400)
        UI.drawLine(300, 200, 300, 400);
        // set line width to 1
        UI.setLineWidth(1);
        // set colour to purple
        UI.setColor(Color.red);
        //fill oval  (260, 160) 80 x 80
        UI.fillOval(260, 160, 80, 80);
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

