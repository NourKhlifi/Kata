package com.kata.formatters;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	
	public static Date date(String dateString) {
		
		Date date = null;
        

        try {

            date = formatter.parse(dateString);

        } catch (ParseException e) {
            e.printStackTrace();
        }

		return date;		
	}

public static String stringOfDate(Date date) {
		
		String stringOfDate ="";


        try {

            stringOfDate = formatter.format(date);

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

		return stringOfDate;		
	}
}
