package com.corejavainreviewspgrms;

public class CheckNumericOrNot {
	public static boolean isEmpty(CharSequence cs) {
		return cs==null||cs.length()==0;
		
	}
	public static boolean isNumeric(CharSequence cs) {
		if(isEmpty(cs)) {
			return false;
		}
		
		int len=cs.length();
		for(int i=0;i<len;i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		
       System.out.println(isNumeric(null));
       System.out.println(isNumeric(" "));
       System.out.println(isNumeric("123"));
       System.out.println(isNumeric("java"));
       System.out.println(isNumeric("java123"));
       System.out.println(isNumeric("+123"));
       System.out.println(isNumeric("0"));
       
	}

}
