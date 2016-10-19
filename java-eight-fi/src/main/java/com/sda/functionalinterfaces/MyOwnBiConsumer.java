package com.sda.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;


public class MyOwnBiConsumer implements BiConsumer<List<String>, String> {
	
	@Override
	public void accept(List<String> l, String s) {
		l.add(s);
	}
	
}
