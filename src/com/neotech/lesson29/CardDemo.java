package com.neotech.lesson29;

import java.util.Iterator;
import java.util.LinkedList;


public class CardDemo {

	public static void main(String[] args) {
		
		LinkedList<Card>Cards=new LinkedList<>();
		
		Cards.add(new Visa("T card", 3000));
		Cards.add(new Swiss("S card",9000));
		Cards.add(new Master("M card",6000));
		
		for(Card bank:Cards)
		{
			bank.limit();
			bank.shopping();
			bank.debit();
			System.out.println("=======================");
		}
		
		System.out.println("with iterator");
		Iterator <Card> c=Cards.iterator();
		
		while(c.hasNext()) {
			Card bank=c.next();
			bank.limit();
			bank.shopping();
			bank.debit();
			System.out.println("=======================");
		}
		
		
		System.out.println("with for loop");
		
		for(int i=0;i<Cards.size();i++)
		{
			Cards.get(i).limit();
			Cards.get(i).shopping();
			Cards.get(i).debit();
			System.out.println("=======================");
		}
		
		
		
		
		
		
		
	}

}
