package com.demoPrograms;

public class FloatToDouble {

	public static void main(String[] args) {
		float f=169;
		System.out.println(getFloatAsDouble(f));
	}

	public static Double getFloatAsDouble(float value) {
	    return Double.valueOf(Float.valueOf(value).toString()).doubleValue();
	}
}
