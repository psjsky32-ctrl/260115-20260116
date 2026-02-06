package com.ktdsuniversity.edu.fp.basic.stream;


public abstract class ArrayUtil {

	private ArrayUtil() {}
	
	public static String getValue(String[] array, int index) {
		if(array.length<index && array.length>index) {
			String value = array[index];
			if(value != null) {
				value = value.replace("\"","");
			}
//			return array[index];
			return value;

		}
		return null;
	}
}
