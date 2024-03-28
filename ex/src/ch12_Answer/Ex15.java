package ch12_Answer;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex15 {

	public static void main(String[] args) {
		
		LocalDateTime startDateTime = LocalDateTime.now();
		 
		//System.out.println(startDateTime);
		
		//LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		
		 LocalDateTime endDateTime = LocalDateTime.of(
		 startDateTime.getYear(), 12, 31, 0, 0, 0);
		 
		 long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		 //until(Temporal endExclusive, TemporalUnit unit 단위))
		 //ChronoUnit : chrono는 '때'라는 뜻.A standard set of date periods units.
		 //TemporalUnit: A unit of date-time, such as Days or Hours.
		
		 System.out.println("남은 일자: " + remainDay);

	}

}
