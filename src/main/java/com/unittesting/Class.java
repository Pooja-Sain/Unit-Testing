package com.unittesting;

public class Class {
	
	AreaImpl areaImpl;
	public int findArea(int a, int b) throws Exception {
		try {
			return areaImpl.findArea(a, b);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
		
	}
	public int Circle(int r) throws Exception{
		try {
			return (int) areaImpl.circle(r);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
	}
}
