package com.unittesting.spy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

import org.junit.Test;

public class spyTest {
@Test
public void test_volumeR() {
	spy volume = spy(spy.class);
	assertEquals(250, volume.volumeR(5, 10, 5));
}
}
