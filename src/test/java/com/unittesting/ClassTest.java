package com.unittesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ClassTest {
	
	@Mock
	AreaImpl mockedServiceAreaImpl;
	@InjectMocks
	Class classUnderTest;
	@Test
	public  void test_Area() {
		when(mockedServiceAreaImpl.findArea(5, 4)).thenReturn(20);
		try {
			assertEquals(20, classUnderTest.findArea(5,4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(mockedServiceAreaImpl,atLeastOnce()).findArea(5, 4);
		
	}
	@Test
	public void test_Area2() {
		when(mockedServiceAreaImpl.findArea(6, 4)).thenReturn(24);
		try {
			assertEquals(24, classUnderTest.findArea(6,4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(mockedServiceAreaImpl,atLeast(1)).findArea(6, 4);
	}
	@Test
	public void test_circle() {
		when(mockedServiceAreaImpl.circle(10)).thenReturn(314.0);
		try {
			assertEquals(314, classUnderTest.Circle(10));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(mockedServiceAreaImpl,times(1)).circle(10);
		
	}
	
	@Test
	public void test_circle2() {
		when(mockedServiceAreaImpl.circle(5)).thenReturn(78.5);
		try {
			assertEquals(78,classUnderTest.Circle(5));
		}catch (Exception e) {
			// TODO: handle exception
		}
		verify(mockedServiceAreaImpl,times(1)).circle(5);
		}
	
	@Test
	public void test_circle3() {
		Class circleSpy =Mockito.spy(Class.class);
		try {
			assertEquals(78,circleSpy.Circle(5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
