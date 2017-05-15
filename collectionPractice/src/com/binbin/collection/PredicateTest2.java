package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("ƽ��������");
		books.add("���������");
		books.add("���IOS");
		books.add("���Android");
		books.add("�㷨��������������3��");
		
		System.out.println(calAll(books,ele -> ((String)ele).contains("���")));
		System.out.println(calAll(books,ele -> ((String)ele).contains("�㷨")));
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
