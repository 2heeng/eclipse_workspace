package jungsuk11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise11_6 {

	static int getGroupCount(TreeSet tset, int from, int to) { 
			Student   s1   =   new   Student("",0,0,from,from,from); 
			Student   s2   =   new   Student("",0,0,to,to,to);
			return   tset.subSet(s1,s2).size(); 
			
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Student2 && o2 instanceof Student2) {
					Student2 stu1 = (Student2) o1;
					Student2 stu2 = (Student2) o2;
					
					int stu1avg=(int)stu1.getAverage();
					int stu2avg=(int)stu2.getAverage();
					return (stu1avg-stu2avg);
				} else {
					return -1;
				}
			}
		});

		set.add(new Student2("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student2("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student2("김자바", 1, 3, 80, 80, 90));
		set.add(new Student2("이자바", 1, 4, 70, 90, 70));
		set.add(new Student2("안자바", 1, 5, 60, 100, 80));
		//System.out.println(set);
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("[60~69]   :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79]   :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89]   :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100]   :" + getGroupCount(set, 90, 101));

	}
}
