package jungsuk10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		
		Calendar cld = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date ddd=cld.getTime();
		System.out.println(sdf.format(ddd));
		
	}

}
