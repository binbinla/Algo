package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("ƽ��������");
		books.add("���������");
		
		books.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}

}
