package com.binbin.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("猪八戒");
		c.add(8);
		System.out.println("c集合中元素的个数为: "+c.size());
		c.remove(8);
		System.out.println("c集合中元素的个数为: "+c.size());
		System.out.println("c集合中是否包含\"孙悟空\"字符串："+c.contains("孙悟空"));
		c.add("疯狂Java讲义");
		System.out.println("c集合的元素："+c);
		
		Collection books = new HashSet();
		books.add("人机交互");
		books.add("计算机网络");
		books.add("疯狂Java讲义");
		System.out.println("c集合是否完全包含books集合的元素？"+c.containsAll(books));
		
		// 用c集合减去books集合里的元素
		c.removeAll(books);
		System.out.println("c集合的元素："+c);
		c.clear();
		System.out.println("c集合的元素："+c);
		books.retainAll(c);
		System.out.println("books集合里的元素："+books);
	}

}
