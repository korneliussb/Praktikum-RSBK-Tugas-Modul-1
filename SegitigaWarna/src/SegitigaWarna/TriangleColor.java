package SegitigaWarna;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/* @author Knight-Son*/
public class TriangleColor extends Canvas implements Serializable{
 private Color color;
 private boolean rect;
    public TriangleColor(){
        rect=false; setSize(200,100);
        change();}
    public boolean getRect(){
        return rect;}
    public void setRect(boolean flag){
        this.rect=flag; repaint();}
    public void change(){
        color = randomColor();
        repaint();}
    private Color randomColor(){
        int r=(int)(255*Math.random());
        int g =(int)(255*Math.random());
        int b=(int)(255*Math.random());
        return new Color(r,g,b);}
    public void paint(Graphics g){
        Dimension d = getSize();
        int h=d.height;
        int w=d.width;
        g.setColor(color);
        if(rect){
            g.fillPolygon(new int[] {0,45,45}, new int[]{50,99,1}, 3); //sudut 0,90,90
        }
//            g.fillRect(0,0,w-1,h-1);}
        else{
            g.fillPolygon(new int[] {0,45,45}, new int[]{50,99,1}, 3);
            //    g.fillOval(0,0,w-1,h-1);
        }
    }
}