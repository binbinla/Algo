package com.binbin.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List books = new ArrayList();
		books.add(new String("���ģʽ"));
		books.add(new String("���������"));
		books.add(new String("�������"));
		System.out.println(books);
		
		books.add(1, new String("���Java����"));
		for(int i = 0;i < books.size();i++){
			System.out.println(books.get(i));
		}
		
		books.remove(2);
		*/
		String[] books = {"���ģʽ","��Ŀ����","�㷨","�������"};
		List bookList = new ArrayList();
		for(int i = 0;i < books.length;i++){
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
			lit.add("------------�ָ���-------------");
		}
		System.out.println("==========���濪ʼ�������=============");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
