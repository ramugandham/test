package com.ramu.java18features;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimetest {

	public static void main(String[] args) {
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);                     
		
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getYear());
		/* outputs:2019-12-06
			6
			340
			2019*/
		System.out.println("******--****--******");
		ZoneId id=ZoneId.of("Asia/Dubai");
		LocalDate localDate1=LocalDate.now(id);
		System.out.println(localDate1);
		Clock clock=Clock.systemDefaultZone();
		LocalDate localDate2=LocalDate.now(clock);
		System.out.println(localDate2);
		LocalTime time=LocalTime.now();
		System.out.println(time.getSecond());   
		System.out.println(time.getMinute());   
		System.out.println(time.getHour()); 
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime.of(1993, 1, 30, 1, 2));
		
	}
	

}
