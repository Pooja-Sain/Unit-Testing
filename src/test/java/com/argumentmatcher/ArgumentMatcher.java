package com.argumentmatcher;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ArgumentMatcher {
	@Test
	public void testList_ArgumentMatcher() {
		List<String> mockList = mock(List.class);
		when(mockList.get(anyInt())).thenReturn("Mockito");
		assertEquals("Mockito", mockList.get(0));
		assertEquals("Mockito",mockList.get(1));
		assertEquals("Mockito",mockList.get(2));
	}
	@Test(expected = RuntimeException.class)
	public void testList_ThrowsException() {
		List<String> moList = mock(List.class);
		when(moList.get(anyInt())).thenThrow(new RuntimeException("Error.."));
		moList.get(0);
	}
}
