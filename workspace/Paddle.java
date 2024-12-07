import java.awt.*;

/**
 * Represents the paddle used in the Brick Break game. The paddle can move horizontally
 * within the game boundary based on user input and is used to deflect the ball.
 */
public class Paddle {
	
	
	private int width;
	private int height;
	private int x;
	private int y;
	private int Velocity;


	public Paddle (int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.Velocity = 0;

	}
	//your code here!
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

		public int getVelocity() {
		return Velocity;
	}

	public void setVelocity(int Velocity){
		this.Velocity = Velocity;
	}

	
	//methods:


	  /**
     * Precondition: A valid Graphics object `g` is provided.
     * Postcondition: Draws the paddle on the screen with the specified dimensions and position.
     */
	public void draw(Graphics g) { 
		g.setColor(Color.red); // call first to set the desired color
		g.fillRect(x , y, width,  height); // draws a rectangle
	}


	  /**
     * Precondition: A valid integer `Velocity` is provided.
     * Postcondition: Sets the paddle's velocity to the given value.
     */
	public void addVelocity(int Velocity){
		this.Velocity = Velocity ;
	}

 /**
     * Precondition: The game loop calls this method during the game's active state.
     * Postcondition: Moves the paddle horizontally based on its velocity. Ensures the paddle
     * stays within the screen boundaries.
     */
	public void move(){
		x += Velocity;
		if (x < 0) {
            x = 0; // Left boundary
        } else if (x + width > 692) { // screen width is 692
            x = 692 - width;
	}
  }
}
