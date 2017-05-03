package com.binbin.algo;

import java.util.HashMap;
import java.util.Scanner;

public class countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a String: ");
		String in = input.nextLine();
		input.close();
		HashMap<String,Integer> map = new HashMap<String,Integer>();	
		String[] stringArray = in.split(" ");
		
		String word = null;
		for(String x : stringArray){
			word = x.trim();
			if(word.equals(" ")) continue;
			if(map.containsKey(word)){
				map.put(word, map.get(word)+1);
			}else{
				map.put(word, 1);
			}
		}
		for(String res : map.keySet()){
			System.out.printf("The inpput string contains word %s %s times\n",res,map.get(res));
		}
	}

}
