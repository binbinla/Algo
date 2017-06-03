package com.binbin.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List books = new ArrayList();
		books.add(new String("设计模式"));
		books.add(new String("计算机网络"));
		books.add(new String("软件测试"));
		System.out.println(books);
		
		books.add(1, new String("疯狂Java讲义"));
		for(int i = 0;i < books.size();i++){
			System.out.println(books.get(i));
		}
		
		books.remove(2);
		*/
		String[] books = {"设计模式","项目管理","算法","软件测试"};
		List bookList = new ArrayList();
		for(int i = 0;i < books.length;i++){
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
			lit.add("------------分隔符-------------");
		}
		System.out.println("==========下面开始反向迭代=============");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}

}
