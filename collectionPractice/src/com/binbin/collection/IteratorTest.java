package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("平凡的世界");
		books.add("计算机网络");
		
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String) it.next();
			if(book.equals("计算机网络")){
				it.remove();
			}
			book = "企图修改集合元素的值，但是无法这样操作";
		}
		System.out.println(books);
	}

}
