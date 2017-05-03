/*
 * Name: Donovan Taitt
   Character Class
   Class: CSC220 PA 5
   Description: This class will set the parameters and details for the character
   that will be added to the "StageFrame" in the other packages of this Programming 
   Assignment.
   Date: 5/2/2017- As of now, the game must be won by selecting the points in the order 
   they go.
   Date Turned In: 5/2/2017
 */
package csc220.program5.taittdr2020;
    
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

    
/**
 *
 * @author taittdr2020
 */
public class Character extends csc220.program5.GameCharacter {
    
    private int horizontalStepSize;
    private Color charColor;
    
    
    public Character (int x, int y, int diameter, int moveInterval) {
        super(x, y, diameter, diameter, 1000, new csc220.program5.taittdr2020.List<Point>());
        animationPath.add(new Point(x, y));
        animationPath.add(new Point(x + 100, y));
        animationPath.add(new Point(x, y + 100));
        animationPath.add(new Point(x + 100, y + 100));
     } // constructor)
     
    
    public void draw(Graphics g) {
        int over = getOver();
        int down = getDown();
        int width = getWidth();
        g.setColor(Color.BLUE);
        g.fillOval(over, down, width, width);//Head of character

      


        
        
//        g.setColor(Color.BLACK);
//        g.fillRect(over+20 , down , over+40, down);
//        g.setColor(Color.RED);
//        g.fillRect(over + 110, down+5  , over, down-10);
//        g.setColor(Color.WHITE);
//        g.fillRect(over+123, down+10, over -15 , down-40);
//        g.fillOval(over+20, down+70, down-35, down-35);
//        g.fillOval(over+70, down+70, down-35, down-35);

        g.setColor(Color.BLACK);
        g.fillRect(over+20 , down , width+40, width+40);
        g.setColor(Color.RED);
        g.fillRect(over + 110, down+5  , width + 30, width+30);
        g.setColor(Color.WHITE);
        g.fillRect(over+123, down+10, width+15 , width);
        g.fillOval(over+20, down+70, width, width);
        g.fillOval(over+70, down+70, width, width);
        
//        g.setColor(Color.BLACK);
//        g.drawOval(over, down, width, width);
//        g.fillOval(over + width / 5, down + 3 * width / 10, width / 5, width / 5);
//        g.fillOval(over + 3 * width / 5, down + 3 * width / 10, width / 5, width / 5);
//        g.drawArc(over + 3 * width / 10, down + width / 2, 2 * width / 5, 3 * width / 10, 190, 160);//end of drawing facial features
//        
//        g.drawLine(over + 15, down + 30, over + 15, down + 50);// Abdomen of Character
//        g.drawLine(over + 15, down + 40, over + 30, down + 43);// Right Arm
//        g.drawLine(over + 15, down + 40, over, down + 43);//Left Arm
//        g.drawLine(over + 15, down + 50, over + 30, down + 65);//Right Leg
//        g.drawLine(over + 15, down + 50, over, down + 65);//Left Leg
    }
    
    
    
    

    
    
}
