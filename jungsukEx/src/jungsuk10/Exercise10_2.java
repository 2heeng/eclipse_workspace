package jungsuk10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_2 {

	static int paycheckCount(Calendar from, Calendar to) {
		//System.out.println("to의 월은: " +to.MONTH);
		//System.out.println("from의 월은: " +from.MONTH);
		//System.out.println("from.DAY_OF_MONTH: " +from.DAY_OF_MONTH);
		//System.out.println("from.DATE: " +from.DATE);
		int monDiff=to.MONTH-from.MONTH;
		//System.out.println(monDiff);
		if(from == null || to == null) {
			return 0;
		} else if(from == to && from.DATE == 21) {
			return 1;
		} else {
		int fromDay=from.DAY_OF_MONTH;
		int toDay = to.DAY_OF_MONTH;
		if(monDiff<0) {
			return 0;
		}else if((fromDay==21 || fromDay<21)&&(toDay==21||toDay>21)) {
			monDiff++;
		} else if(fromDay<21 && toDay<21) {
			monDiff--;
		}
		} return monDiff;
		
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate) + "   ~   " + sdf.format(toDate) + ":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 0, 1);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 23);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
		fromCal.set(2011, 0, 22);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);

	}

}
