package qa.com.game;

import java.util.Scanner;

public class Game{
private int positionX;
private int positionY;
private int tresurePositionX;
private int tresurePositionY;
private String alergy; 
private String nuts = "nuts";
private String dary = "dary";
private String bees = "bees";
private String name;

Nuts nut = new Nuts();
Bees bee = new Bees();
Milk milk = new Milk();


public String intro(String name){
	this.name=name;
	return "Welcome to the text based game Alergy Tresure \n In this game you are required to set an alergy component to your charictor."
			+ "\n You will have a chance to move round the map and you will find tresure box.\n Unfortunatly if you find one with your alergy, Game Over"
			+ "\n Good luck on your adventure to find the tresure, mortal " + name
			+"";
}
public void start() {
	this.positionX= (int) ((Math.random() * ((0 - 10) + 1)) + 0);
	this.positionY= (int) ((Math.random() * ((0 - 10) + 1)) + 0);
}
public void tresure() {
	this.tresurePositionX= (int) ((Math.random() * ((0 - 10) + 1)) + 0);
	this.tresurePositionY= (int) ((Math.random() * ((0 - 10) + 1)) + 0);
	System.out.println(positionX+" "+positionY+" "+ tresurePositionX+" "+tresurePositionY);
}

public  void alergyInfo() {
	
		System.out.print("Defalt: nuts \n Defalt Movemrnt: North \n Time to chose your dealy alergy, You have a choise, " +nuts+", "+dary+", "+bees+"? " );
}
public void move(String input) {
	if (input.equals("north")|| input.equals("n")) {
		north();
	}
	else if (input.equals("south")|| input.equals("s")) {
		south();
	}else if (input.equals("east")|| input.equals("e")) {
		east();
	}
		else if (input.equals("west")|| input.equals("w")) {
			west();
		}else north();
	
}
public void north() {
	this.positionY = positionY+1;
	getyourPosition();
	trap();
	foundTresure();
}
public void south() {
	this.positionY = positionY-1;
	getyourPosition();
	trap();
	foundTresure();
}
public void east() {
	this.positionX = positionX+1;
	getyourPosition();
	trap();
	foundTresure();
}
public void west() {
	this.positionX = positionX-1;
	getyourPosition();
	trap();
	foundTresure();
}
public String alergySet(String input) {

	if (input.equals(nuts)) {
		this.alergy= nuts;
	return alergy;	
	}  
	if (input.equals(dary)) {
		this.alergy= dary;
	return alergy;	
	}  
	if (input.equals(bees)) {
		this.alergy= bees;
	return alergy;	
	}
	this.alergy= nuts;
	return alergy;
	
}
public void getyourPosition(){
	//System.out.print("Your position is "+positionX+" "+positionY+ "tresure is at "+ tresurePositionX+" "+tresurePositionY);
	System.out.print("You are "+(Math.abs((positionX-tresurePositionX))+Math.abs((positionY-tresurePositionY)))+" Meaters form the tresure");
	
}	
public void trap() {
	if(positionX==nut.getPositionX() && positionY==nut.getPositionY()) { 	
	if (nuts.equals(alergy)){
			System.out.println("You Found a tresure box and open it, "+ alergy +" explodes into your face, You swell up like a bollon and you pop! \n GAME OVER!");
			System.exit(0);
		}else {System.out.println("You Found a tresure box and open it, "+ nuts +" explodes into your face, Good fortune is on your side as your alergic to "+alergy);} 
	}
if(positionX==milk.getPositionX() && positionY==milk.getPositionY()) {	
	if (dary.equals(alergy)){
			System.out.println("You Found a tresure box and open it, "+ alergy +" explodes into your face, You swell up like a bollon and you pop! \n GAME OVER!");
			System.exit(0);
		}else {System.out.println("You Found a tresure box and open it, "+ dary +" explodes into your face, Good fortune is on your side as your alergic to "+alergy);} 
	}
if(positionX==bee.getPositionX() && positionY==bee.getPositionY()){	
	if (bees.equals(alergy)){
			System.out.println("You Found a tresure box and open it, "+ alergy +" explodes into your face, You swell up like a bollon and you pop! \n GAME OVER!");
			System.exit(0);
		}else {System.out.println("You Found a tresure box and open it, "+ bees +" explodes into your face, Good fortune is on your side as your alergic to "+alergy);
		} 
		}
	}
public boolean foundTresure() {
	if (positionX==tresurePositionX && positionY==tresurePositionY) {
		System.out.print("You have found the tresure, You Win "+ name+".");
		System.exit(0);
		return true;
	}else {
		System.out.print("You have not found the tresure yet "+ name+". Move Again:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		move(input);
		
		return false;
		
	}

}


}

