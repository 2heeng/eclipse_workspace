package jungsuk09;

public class Excercise09_3 {

	public static void main(String[] args) {
		String   fullPath   =    "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String   path   =    "";
		String   fileName   =    "";
		
		int lastIndex=fullPath.lastIndexOf("\\");
		fileName=fullPath.substring(lastIndex+1);
		
		int firstIndex=fullPath.indexOf("\\");
		path = fullPath.substring(firstIndex, lastIndex);
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);

	}

}
