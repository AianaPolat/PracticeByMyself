package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		
		Set<String>veggies=new HashSet<>();//no order
		veggies.add("onion");
		veggies.add("eggplant");
		veggies.add("cheese");
		veggies.add("tomatoes");
		veggies.add("onion");
		System.out.println(veggies);
		
		System.out.println();
		
		//LinkedHashSet--> no duplicates, insertion order
		Set<String>fruits=new LinkedHashSet<>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("apple");
		//fruits.add(null);
		System.out.println(fruits);

		
		//TreeSet--> no duplicates, insertion order
		//it will sort the set elements
		
		Set<String>food=new TreeSet<>();
		food.add("potatoes");
		food.add("eggs");
		food.addAll(fruits);
		food.addAll(veggies);
		System.out.println(food);
		
		
	}

}
