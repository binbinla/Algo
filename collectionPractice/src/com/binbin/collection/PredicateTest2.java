package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("平凡的世界");
		books.add("计算机网络");
		books.add("疯狂IOS");
		books.add("疯狂Android");
		books.add("算法设计与分析基础第3版");
		
		System.out.println(calAll(books,ele -> ((String)ele).contains("疯狂")));
		System.out.println(calAll(books,ele -> ((String)ele).contains("算法")));
		System.out.println(calAll(books,ele -> ((String)ele).length() > 10));
		
	}

	private static int calAll(Collection books, Predicate p) {
		// TODO Auto-generated method stub
		int total = 0;
		for(Object obj : books){
			if(p.test(obj)){
				total++;
			}
		}
		return total;
	}

}
