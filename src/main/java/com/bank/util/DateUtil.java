package com.bank.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil{
	
	private DateUtil() {};
	
	public static final String SIMPLE_DATE_TIME_FORMAT 
	  = "dd/MM/yyyy hh:mm a";
	
	public static String getDateAsString(Date date , String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}
	
}