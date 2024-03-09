package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<>();
		
		//start at 2 and increment a loop control 
		//parameter by 2 each iteration
		
		for(int i=2; i<50; i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		//creating an iterator for an ArrayList of integers
		Iterator<Integer>it=numbers.iterator();
		
		//hasNext()--> checks if there's a next element
		//next()--> it moves the cursor ton the next element
		//remove()--> removes the element currently pointed to
		
		while(it.hasNext())
		{
			Integer num= it.next();
			if(num%5==0)
			{
				it.remove();//it will remove the last returned element
			}
			
		}

		System.out.println(numbers);
	}

}
