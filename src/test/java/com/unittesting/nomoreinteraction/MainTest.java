package com.unittesting.nomoreinteraction;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Test;

public class MainTest {
@Test
public void test_root() {
	SquareRoot squareRoot = mock(SquareRoot.class);
	Main main = new Main(squareRoot);
	main.Root(5);
	verify(squareRoot).findRoot(5);
	verifyNoMoreInteractions(squareRoot);
}
}
