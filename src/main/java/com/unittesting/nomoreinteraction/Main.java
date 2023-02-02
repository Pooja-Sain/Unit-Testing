package com.unittesting.nomoreinteraction;

public class Main {
	SquareRoot squareRoot;

	public Main(SquareRoot squareRoot) {
		super();
		this.squareRoot = squareRoot;
	}
	public  void Root(int x) {
		squareRoot.findRoot( x);
	}
}
