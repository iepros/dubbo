package com.xfma.utils;

public class StringUtils {

	public static String trim(String str) {
		if (str == null || "".equals(str)) {
			return "";
		}
		return str.trim();
	}
}
