/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
import TerminalIO.KeyboardReader;
import TurtleGraphics.*;
import java.awt.Color;

public class ShapeMaker {
    
    public static void main(String[] args) {
        /*
        Shape s;
        Pen p = new StandardPen();
        s = new Circle(10,10,5);
        System.out.println(s);
        s.move(0, 0);
        s.stretchBy(2);
        System.out.println(s);
        s = new Rect(0,0,50,25);
         System.out.println(s);
         s.draw(p);
                */
        
        Pen p = new StandardPen(new SketchPadWindow(400,400));
        Shape s1 = null;
        double r, x, y;
        double w, h;
        int choice;
        KeyboardReader k = new KeyboardReader();
        //pick circle or rect
        while(true)
        {
            choice = k.readInt("Enter 1 for rectangle, 2 for circle: ");
            if(choice==1 || choice ==2)break;
        }
        if(choice==1)
        {
            w = k.readDouble("Enter width of rectangle: ");
            h = k.readDouble("Enter heigh of rectangle: ");
            s1 = new Rect(0,0,w,h);
        }
        else if(choice==2)
        {
            r = k.readDouble("Enter radius of circle: ");
            s1 = new Circle(0,0,r);
        }
        
        while(true)
        {
            s1.draw(p);
            x = k.readDouble("New x: ");
            y = k.readDouble("New y: ");
            //erase and move
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x,y);
            p.setColor(Color.blue);
            s1.draw(p);
    }
    
}
}
