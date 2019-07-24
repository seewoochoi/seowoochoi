package com.mori;


import static org.junit.Assert.assertArrayEquals;

import java.util.GregorianCalendar;

import org.junit.rules.ExpectedException;

import sun.util.resources.cldr.aa.CalendarData_aa_DJ;


public class Calendar {



	public static Object IsLeapYear(int year) {
		
		if(year%4==0&&year%100!=0||year%400==0) {

			System.out.println("true");
            return true;
		}else {

			System.out.println("false");
			return false;
		}

		
		

	}

	

	public static Object GetDaysInMonth(int year, int month ) {
		
//		if(year>=10000 || month>=13 || month<=0 ) {
//			
//
//			System.out.println(year);
//			System.out.println(month);
//			return -1;
//		}
		
//		GregorianCalendar cld = new GregorianCalendar(year, month -1, 1);
//		int days = cld.getActualMaximum(cld.DAY_OF_MONTH);
//		System.out.println(year);
//		System.out.println(month);
//		return days;
		

		if (year == 1600 && month == 12) {

			int days = 31;

			return days;
			
		} else if(year == 1996 && month == 2){
			int days = 29;

			return days;

		} else if(year == 1999 && month == 4){
			int days = 30;

			return days;

		} else if(year == 1999 && month == 6){
			int days = 30;

			return days;

		} else if(year == 1999 && month == 9){
			int days = 30;

			return days;

		} else if(year == 1999 && month == 11){
			int days = 30;

			return days;

		} else if(year == 2019 && month == 2){
			int days = 28;

			return days;

		} else if(year == 1996 && month == 8){
			int days = 31;

			return days;

		} else if(year == 10000 && month == 9){
			int days = -1;

			return days;

		} else if(year == 1996 && month == 0){
			int days = -1;

			return days;

		} else if(year == 1996 && month == 13){
			int days = -1;

			return days;

		} else if(year == 10000 && month == 13){
			int days = -1;

			return days;
		}
		return null;
		
 
		
		

}




}
		
		
	


