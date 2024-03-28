package jungsuk11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Exercise11_2 {

	public static void main(String[] args) {
		ArrayList   list   =   new   ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		System.out.println(list);
		HashSet   set   =   new   HashSet(list); //set 순서없고 중복저장 없음
		System.out.println(set);
		TreeSet   tset   =   new   TreeSet(set); 
		//트리구조 크면 오른쪽 작은면 왼쪽에 들어가는거
		Stack   stack   =   new   Stack(); 
		stack.addAll(tset);
		while(!stack.empty())
		{System.out.println(stack.pop());}

	}

}
