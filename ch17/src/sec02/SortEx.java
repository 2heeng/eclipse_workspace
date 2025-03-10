package sec02;

import java.util.ArrayList;
import java.util.List;

public class SortEx {

	public static void main(String[] args) {
		List<Student> arrList = new ArrayList<>();
		arrList.add(new Student("홍일동", 30));
		arrList.add(new Student("홍이동", 80));
		arrList.add(new Student("홍삼동", 70));

//		arrList.stream().sorted(
//
//				(obj, obj2) -> {
//					return Integer.compare(obj.getScore(), obj2.getScore());
//				}).forEach((x) -> {
//					System.out.println(x.getScore());
//				});

		arrList.stream().sorted(

				(obj, obj2) -> {
					return Integer.compare(obj.getScore(), obj2.getScore());
				}).forEach((x) -> {
					System.out.println(x.getScore());
					System.out.println(x.getName());
				});
	}

}
