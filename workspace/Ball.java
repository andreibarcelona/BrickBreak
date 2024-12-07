import java.awt.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents the ball used in the Brick Break game. The ball moves across the screen
 * and interacts with the paddle, bricks, and boundaries.
 */
public class Ball {
	//your code here!
	private int Xpos;
	private int Ypos;
	private int size;
	private int XVelocity;
	private int YVelocity;
	private int Velocity;
	
	

	//constructor(s):
	public Ball (int Xpos, int Ypos, int size) {
		this.Xpos = Xpos;
		this.Xpos = Ypos; 
		this.Velocity = 1;
		this.XVelocity = 1;
		this.YVelocity = 1; 
		this.size = size;
	}
	//Getters & Setters:
	public int getXpos() {
		return Xpos;
	}

	public void setXpos (int Xpos) {
		this.Xpos = Xpos;
	}

	public int getYpos() {
		return Ypos;
	}

	public void setYpos(int Ypos) {
		this.Ypos = Ypos;
	}
	public int getX() {
		return Xpos;
	}

	public void setX (int Xpos) {
		this.Xpos = Xpos;
	}

	public int getY() {
		return Ypos;
	}

	public void setY(int Ypos) {
		this.Ypos = Ypos;
	}

	public int getVelocity() {
		return Velocity;
	}

	public void setXVelocity(int XVelocity){
		this.XVelocity = XVelocity;
	}

	public void setYVelocity(int YVelocity){
		this.YVelocity = YVelocity;
	}

	public int getSize() {
		return size;

	}


	//methods:


	 /**
     * Precondition: A valid Graphics object `g` is provided.
     * Postcondition: Draws the ball on the screen with the specified size and position.
     */
	public void draw(Graphics g) { 
		g.setColor(Color.red); // call first to set the desired color
		g.fillOval(Xpos, Ypos, size, size);
	}


	  /**
     * Precondition: The game loop is running and calls this method to update the ball's position.
     * Postcondition: Updates the ball's X and Y coordinates based on its velocity.
     */
	public void move(){
		Xpos += XVelocity;
		Ypos += YVelocity;
	}

    /**
     * Precondition: The ball hits a horizontal surface.
     * Postcondition: Reverses the ball's horizontal direction.
     */
	public void reverseX() {
		XVelocity *= -1;
	}

	  /**
     * Precondition: The ball hits a vertical surface.
     * Postcondition: Reverses the ball's vertical direction.
     */
	public void reverseY() {
	    YVelocity *= -1;
	}

}

