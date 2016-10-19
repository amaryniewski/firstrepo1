package com.sda.functionalinterfaces;

import java.util.function.Predicate;

public class OwnClassWithPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		return i % 2 == 0;
	}

}
