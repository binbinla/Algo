package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("平凡的世界");
		books.add("计算机网络");
		
		for(Object obj : books){
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("计算机网络")){
				//books.remove(book);
			}
		}
		System.out.println(books);
	}

}
