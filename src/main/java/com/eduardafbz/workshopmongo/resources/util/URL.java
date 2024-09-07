package com.eduardafbz.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static Date convertDate(String textDate, Date defaultValue) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return fmt.parse(textDate);
		} catch (ParseException e) {
			return defaultValue;
		}
	}
	
}
