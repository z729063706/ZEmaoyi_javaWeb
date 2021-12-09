package com.haikang.util;

public class nameShorter {
    public static String getShortString(String longString, Integer shortNumber) {
		if(longString==null) {
			return  "";
		}
		if(longString.length()<shortNumber) {
			return longString;
		}
		else {
			return longString.substring(0,shortNumber)+"...";
		}
    }
}
