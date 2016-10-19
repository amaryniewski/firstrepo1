package com.sda;

import com.sda.functionalinterfaces.MyOwnInterface;
import com.sda.functionalinterfaces.TriFunction;
import org.junit.Test;

public class SimpleNFunctionTest {

    @Test
    public void triFunction() {
        TriFunction<Integer, Integer, Integer, Integer> average = 
                        (Integer first, Integer second, Integer third) -> (first
                        + second + third) / 3;

        System.out.println(average.tri(2, 6, 7));
        
        MyOwnInterface<String, String, String, String, Integer> superLength = (s1, s2, s3, s4) -> {
        	StringBuilder sb = new StringBuilder();
        	sb.append(s1)
        	.append(s2)
        	.append(s3)
        	.append(s4);
        	return sb.length();
        };
        int value = superLength.apply("Hello", "we", "are learning", "cool java");
    }
    

    /*
     * Twoim zadaniem teraz jest napisac QuadraFunction, bioraca 4 argumenty i
     * zwracajaca jedna wartosc.
     */

}
