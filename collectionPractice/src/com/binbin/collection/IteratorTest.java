package com.binbin.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Head First");
		books.add("ƽ��������");
		books.add("���������");
		
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String) it.next();
			if(book.equals("���������")){
				it.remove();
			}
			book = "��ͼ�޸ļ���Ԫ�ص�ֵ�������޷���������";
		}
		System.out.println(books);
	}

}
