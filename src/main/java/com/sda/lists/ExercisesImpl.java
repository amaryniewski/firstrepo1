package com.sda.lists;

import java.util.ArrayList;
import java.util.List;

public class ExercisesImpl {

    public static List<String> fill(String string, int size) {
    	List<String> listOne = new ArrayList<String>();
    	for (int i = 0 ; i < size ; i++) {
    		listOne.add(string);
    	}
        return listOne;
    }

    public static <T> List<T> fillGeneric(T value, int size) {
    	List<T> list = new ArrayList<T>();
    		for (int i = 0 ; i < size ; i++) {
    			list.add(value);
    		}
        return list;
    }

    public static void swap(List<String> listOne, int i, int j) {
    	
    	listOne.add(i, listOne.get(j));
    	listOne.add(j + 1, listOne.get(i + 1));
    	listOne.remove(i + 1);
    	listOne.remove(j + 1);
    	
    	/*
    	 * x = list.get(i);
    	 * y = list.get(j);
    	 * list.remove(i);
    	 * list.add(i, y);
    	 * list.remove(j);
    	 * list.add(j, x);
    	 * 
    	 * String valueAtI = listOne.get(i);
    	 * String valueAtJ = listOne.get(j);
    	 * listOne.remove(i);
    	 * listOne.add(i, valueAtJ);
    	 * listOne.remove(j);
    	 * listOne.add(j, valueAtI);
    	 * 
    	 * Collections.swap();
    	 * 
    	 * swapGeneric(listOne, i, j);
    	 */
    }

    public static <T> void swapGeneric(List<T> listOne, int i, int j) {
    	T valueAtI = listOne.get(i);
    	T valueAtJ = listOne.get(j);
    	listOne.remove(i);
    	listOne.add(i, valueAtJ);
    	listOne.remove(j);
    	listOne.add(j, valueAtI);
    }

    public static void reverse(List<String> list) {
    	for (int i = 0; i < list.size() / 2; i++) {
    		ExercisesImpl.swap(list, i, list.size()-i-1);
    	}
    	/*
    	 * List<String> temp = new ArrayList<String>();
    	 * for(int i = list.size() - 1; i >= 0; i--) {
    	 * temp.add(list.get(i));
    	 * }
    	 * list.clear();
    	 * list.addAll(temp);
    	 */
    }

    public static <T> void reverseGeneric(List<T> list) {
    }

    public static void rotate(List<Integer> numbers, int i) {
    	int rotator = i % numbers.size();
    	List<Integer> newList = new ArrayList<Integer>();
    	for (int j = 0 ; j < numbers.size() ; j++) {
    		
    	}
    	
    	
    	
    	
    }

    public static void bubbleSort(ArrayList<Integer> list) {
    }

}
