package com.mori;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalendarTest {
	/*
	*	author : choi seok cheol
	*/

	@Test
	public void testIsLeapYear() {
		
		/* =================================================
		 * �뼅亮닺쮫嶸쀣깇�궧�깉
		   =================================================*/
		// �뼅亮담겗�졃�릦�겘true
		assertEquals(Calendar.IsLeapYear(1600), true);
		assertEquals(Calendar.IsLeapYear(2000), true);
		assertEquals(Calendar.IsLeapYear(2400), true);
		assertEquals(Calendar.IsLeapYear(1988), true);
		assertEquals(Calendar.IsLeapYear(1996), true);
		assertEquals(Calendar.IsLeapYear(2020), true);
		
		// �뼅亮담겎�겘�겒�걦�겍�곩뭄亮담겗�졃�릦�겘false
		assertEquals(Calendar.IsLeapYear(2017), false);
		assertEquals(Calendar.IsLeapYear(2018), false);
		assertEquals(Calendar.IsLeapYear(2019), false);
		assertEquals(Calendar.IsLeapYear(1700), false);
		assertEquals(Calendar.IsLeapYear(2100), false);
		assertEquals(Calendar.IsLeapYear(2200), false);
		
		
		/* =================================================
		 * �뿥�빊鼇덄츞�깇�궧�깉 
		   =================================================*/
		// 亮닷벧�겏�쐢�굮�뀯�뒟�걲�굥�겏�걹�겗亮닸쐢�뚧뿥�띲겓野얇걲�굥�뿥�빊�걣�눣�굥
		// �넃 堊� 1600亮닷벧 12�쐢�겘 31�뿥�겲�겎�걗�굥�겏�걚�걝�꼷�뫑
		assertEquals(31, Calendar.GetDaysInMonth(1600, 12));
		 
		assertEquals(29, Calendar.GetDaysInMonth(1996, 2));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 4));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 6));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 9));
		assertEquals(30, Calendar.GetDaysInMonth(1999, 11));
		assertEquals(28, Calendar.GetDaysInMonth(2019, 2));
		assertEquals(31, Calendar.GetDaysInMonth(1996, 8));
 
		assertEquals(-1, Calendar.GetDaysInMonth(10000, 9));
		assertEquals(-1, Calendar.GetDaysInMonth(1996, 0));
		assertEquals(-1, Calendar.GetDaysInMonth(1996, 13));
		assertEquals(-1, Calendar.GetDaysInMonth(Integer.parseInt("10000"), 13));

	}

}
