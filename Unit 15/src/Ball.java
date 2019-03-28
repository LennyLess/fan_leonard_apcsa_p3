//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width) {
		super(x,y,width);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed) {
		super(x,y,width,height);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed, int ySpeed) {
		super(x,y,width,height);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		xSpeed = 3;
		ySpeed = 1;
	}	
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
   //add the set methods
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	
	public void setYSpeed(int y) {
		ySpeed = y;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball a = (Ball) obj;
		if(equals(obj) && xSpeed == a.getXSpeed() && ySpeed == a.getYSpeed()) {
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		String output = getX() + "," + getY() + "," + getWidth() + "," + getHeight() + "," + getColor().toString() + "," + xSpeed + "," + ySpeed;
		return output;
	}
}