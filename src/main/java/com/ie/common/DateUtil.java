package com.ie.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

	public static String getCurrentTime(String format){
		if(null == format || "".equalsIgnoreCase(format))
			format = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar cal = Calendar.getInstance();
		return sdf.format(cal.getTime());
	}
	
	public static String getCurrentTime(){
		return getCurrentTime(null);
	}
	
}
