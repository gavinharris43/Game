package qa.com.game;

public abstract class Trap {
	private String trap;
	int positionX;
	int positionY;

	public String trapType() {
		return trap;
		
		
	}

	public String getTrap() {
		return trap;
	}

	public void setTrap(String trap) {
	this.trap=trap;}

	public int getPositionX() {
		return positionX;
	}
	public void setPosition() {
		this.positionX = (int) ((Math.random() * ((0 - 10) + 1)) + 0);
		this.positionY = (int) ((Math.random() * ((0 - 10) + 1)) + 0);
	}

	public int getPositionY() {
		return positionY;
	}


	
}
