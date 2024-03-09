package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet <String> breakfast = new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("eggs");
		breakfast.add("cheese");
		breakfast.add("tea");
		breakfast.add("coffee");
		
		int size=breakfast.size();
		System.out.println("The Size of the set is: "+size);

		System.out.println(breakfast);
		//HashSet does not guarantee insertion order
		
		for(String item:breakfast)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		
		Iterator<String>iterator=breakfast.iterator();
		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
