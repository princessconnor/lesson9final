/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
import TurtleGraphics.Pen;

public class Rect implements Shape{
    
      private double xPos, yPos, width, height;
    
    public Rect(){
        xPos=0;
        yPos=0;
        width=1;
        height=1;
    }
    
    public Rect(double x, double y, double w, double h){
        xPos=x;
        yPos=y;
        width=w;
        height=h;
    }
    
    public double area() {
      return width * height;
    }


    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(90);
        p.move(height);
        p.turn(90);
        p.move(width);
        p.turn(90);
        p.move(height);
      }

    public double getXPos() {
       return xPos;
    }

    public double getYPos() {
        return xPos;
    }

    public void move(double xLoc, double yLoc) {
       xPos=xLoc;
       yPos=yLoc;
    }

    public void stretchBy(double factor) {
        height*=factor;
        width*=factor;
    }
    
    public String toString(){
        String str="This is a RECTANGLE\n";
        str += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        str += "WIDTH: " + width + "\tHEIGHT: " + height + "\n";
        str += "AREA: " + area();
        return str;
    }
}