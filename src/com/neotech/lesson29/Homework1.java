package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {

	public static void main(String[] args) {
		
		ArrayList<String>drinks=new ArrayList<>();
		
		drinks.add("coffee");
		drinks.add("soda");
		drinks.add("milk");
		drinks.add("tea");
		drinks.add(1,"water");
		
		for(String drink:drinks)
		{
			//check if it contains the letter a or e
			if(drink.contains("a")|| drink.contains("e"))
			{
				drink=drink.replace(drink,"water");
			}
			System.out.println(drink+" ");
		}
		System.out.println();
		
		
		//with indexed for loop
		for(int i=0; i<drinks.size();i++)
		{
			if(drinks.get(i).contains("a")||drinks.get(i).contains("e"))
			{
				//we are updating the list elements 
				drinks.set(i, "water");
			}
		}
		
		System.out.println(drinks);
		
		
		
		
		
		
		
		
		
		
	}

}

