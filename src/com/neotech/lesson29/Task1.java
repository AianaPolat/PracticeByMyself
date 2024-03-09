package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		//Create an arrayList with 6 names. 
				//Have at least 2 duplicates. 
				//How can you remove the duplicates from the ArrayList?
		
		List<String> names=new ArrayList<>();
		names.add("Scott");
		names.add("Emre");
		names.add("Scott");
		names.add("Asli");
		names.add("Asli");
		names.add("Ulku");
		
		System.out.println(names);
		
		//LinkedHashSet--> no duplicates, keeps the insertion order
		Set<String > names1=new LinkedHashSet<>();
		names1.addAll(names);
		System.out.println(names1);
		
		Set<String> ts=new TreeSet<>();
		ts.addAll(names);
		System.out.println(ts);//alphabetical order/no duplicates
		
		//HashSet--> no duplicates/no order
		Set<String> hs=new HashSet<>();
		hs.addAll(names);
		System.out.println(hs);

		
		//how to check whether the elemnet exists ?
		if(names1.contains("Scott"))
		{
			System.out.println("Conatins Scott");
		}
		
		
		//to access to a specific element 
		//we can convert the set back to a list
		List<String>list=new ArrayList<>(ts);
		list.add(1,"Moe");
		System.out.println(list);
		
		//get an element at a certain index
		System.out.println(list.get(3));
		
		
		//can we convert the set to an array?--> yes
		Object[]array=names1.toArray();//(String[]names1.toArray();
		Arrays.sort(array);
		System.out.println(names1);
		
		
		System.out.println("==============");
		System.out.println(Arrays.toString(array));
		
		
		//utility for collection
		Collections.sort(list);
		System.out.println(list);
	}

}
