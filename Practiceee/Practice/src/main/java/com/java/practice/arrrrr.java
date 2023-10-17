package com.java.practice;

import java.util.Iterator;
import java.util.ArrayList;
public class arrrrr {

	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ariz");//Adding object in arraylist  
		list.add("Khan ");  
		list.add("subu");  
		list.add("anirudh");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		
	
}
