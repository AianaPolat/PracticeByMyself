package com.neotech.lesson29;

public class Card {

	String type;
	int limit;
		
		//Create a Card class that will have implemented and unimplemented 
	    //methods and a constructor that will initializes credit card type.
	    //Create 3 subclasses of a Card card.
	    //Create 3 objects of different card and store them into LinkedList.
	    //Using for loop/advanced for loop/iterator access all methods of the class.

	Card (String type, int limit)
	{
		this.type=type;
		this.limit=limit;
	}
	public void shopping()
	{
		System.out.println(type+ " card enables paying at a bunch of shopping malls!");
	}
	public void debit()
	{
		System.out.println(type +" card has an option of a debit card");
	}
	public void limit()
	{
		System.out.println(type +" card has a limit of " +limit);
	}
		
	}

class Visa extends Card{

	public Visa(String type, int limit) {
		super(type, limit);
		
	}
public static void main(String[] args) {
	Visa v=new Visa("platinum", 3000);
	v.debit();
	v.shopping();
	
}
public void limit()
{
	System.out.println(type +" card has a limit of " +limit);
}
}



class Master extends Card{

	Master(String type, int limit) {
		super(type, limit);
		
	}
	public static void main(String[] args) {
	
		Master m=new Master("platinum gold", 7000);
		m.checkBalance();
		m.shopping();
		m.debit();
	}
	public void checkBalance()
		{
			System.out.println("It will take a minute to check the balance of your debit card...");
		}
	}


class Swiss extends Card{

	Swiss(String type, int limit) {
		super(type, limit);
		
	}
	public static void main(String[] args) {
		Swiss s=new Swiss("platinum black",8500);
		s.checkBalance();
		s.limit();
		
		
	}
	public void checkBalance()
	{
		System.out.println("It will take a minute to check the balance of your debit card...");
	}
}



