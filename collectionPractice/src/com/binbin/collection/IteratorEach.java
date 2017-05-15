package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("平凡的世界");
		books.add("计算机网络");
		
		Iterator it = books.iterator();
		it.forEachRemaining(obj -> System.out.println("迭代集合元素："+ obj));
	}

}
