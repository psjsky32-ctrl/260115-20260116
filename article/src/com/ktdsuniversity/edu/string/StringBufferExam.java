package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		sb.append("asdfqwe");
		
		
		String str = sb.toString();
		
		System.out.println(sb);
		System.out.println(str);
		
		StringBuffer longString = new StringBuffer();
//		for(int i = 0; i < 100; i++) {
//			longString.append("qweasfwqerasdf");
//			
			
//		}
		
		
		String resultString = longString.toString();
		System.out.println(resultString);
	}	
	
//	public static void appendString(StringBuffer buffer) {
//		buffer.append("q1wefasd2eqwsadsc");
//	}
	
}
