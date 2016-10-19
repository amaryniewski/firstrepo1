package com.sda.functionalinterfaces;

@FunctionalInterface
public interface MyOwnInterface<A, B, C, D, R> {
	
	R apply(A a, B b, C c, D d);

}
