package com.demoPrograms;

public class EnumDemo {

	public static enum GENDER_TYPE {
		M, F, O
	};
	
	
	public static void main(String[] args) {
		
		Boolean isValid = false;
        for (GENDER_TYPE gen: GENDER_TYPE.values()) {
        
			if(gen.toString().equals("M")) {
        		isValid = true;
        		System.out.println("DONE");
        		break;
        	}
        	if(!isValid) 
        		System.err.println("Error");
		}

	}

}
