package com.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

import com.sda.eight.animals.ECat;
import com.sda.eight.animals.EDog;
import com.sda.eight.animals.ENosounder;
import com.sda.functionalinterfaces.DogSupplier;
import com.sda.functionalinterfaces.MyOwnBiConsumer;
import com.sda.functionalinterfaces.OwnClassWithPredicate;
import com.sda.functionalinterfaces.SayReversedStringConsumer;
import com.sda.functionalinterfaces.SquaringFunction;
import com.sda.functionalinterfaces.SumAndPrinterBiFunction;
import com.sda.seven.animals.SCat;
import com.sda.seven.animals.SDog;
import com.sda.seven.animals.SNosounder;

public class FunctionalInterfacesTest {

    @Test
    public void defaultMethod() {
        // Java 7
        SDog sdog = new SDog();
        SCat scat = new SCat();
        SNosounder snosounder = new SNosounder();
        sdog.makeSound();
        scat.makeSound();
        snosounder.makeSound();

        // java 8
        EDog edog = new EDog();
        ECat ecat = new ECat();
        ENosounder enosounder = new ENosounder();
        edog.makeSound();
        ecat.makeSound();
        enosounder.makeSound();
    }

    @Test
    public void Function() {
        int value = 10;

        this.square(value);
        Function<Integer, Integer> squaringFunction = new SquaringFunction();
        Function<Integer, Integer> squaringLambda = n -> n * n;
        Function<Integer, Integer> squaringAnonymousClass = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer i) {
                return i * i;
            }

        };

        System.out.println("Method value: " + this.square(value));
        System.out.println("Function value: " + squaringFunction.apply(value));
        System.out.println("Lambda value: " + squaringLambda.apply(value));
        System.out.println("Anonymous class value: "
                        + squaringAnonymousClass.apply(value));
    }
    
    @Test
    public void testFunction() {
    	int testValue = 5;
    	Function<Integer, Integer> letSeeMyLambda = n -> n * n;
    	System.out.println("My own test function: " + letSeeMyLambda.apply(testValue));
    }

    @Test
    public void BiFunction() {
        int a = 10;
        int b = 20;

        this.sumAndPrint(a, b);
        BiFunction<Integer, Integer, Integer> function = new SumAndPrinterBiFunction();
        BiFunction<Integer, Integer, Integer> lambda = (x, y) -> {
            int sum = x + y;
            System.out.println(String.format("Sum of %d and %d is equal to %d",
                            a, b, sum));
            return sum;
        };

        System.out.println("Method value: " + this.sumAndPrint(a, b));
        System.out.println("Function value: " + function.apply(a, b));
        System.out.println("Lambda value: " + lambda.apply(a, b));

    }

    @Test
    public void Consumer() {
        String value = "I am extremally worried.";

        this.sayReversedString(value);
        Consumer<String> reversedConsumer = new SayReversedStringConsumer();
        Consumer<String> consumerLambda = (String v) -> {
            String reversed = new StringBuilder(value).reverse().toString();
            System.out.println(reversed);
        };

        this.sayReversedString(value);
        reversedConsumer.accept(value);
        consumerLambda.accept(value);

    }

    @Test
    public void BiConsumer() {
        List<String> list = new ArrayList<String>();

        this.addToList(list, "I am from normal method");
        BiConsumer<List<String>, String> lambdaBiConsumer = (l, string) -> list
                        .add(string);
        /*
         * Dodaj BiConsumera stworzonego w postaci klasy w
         * paczcecom.sda.functionalinterfaces
         */
        lambdaBiConsumer.accept(list, "I am from lambda!");
        System.out.println(list);
        
        BiConsumer<List<String>, String> classBiConsumer = new MyOwnBiConsumer();
        classBiConsumer.accept(list, "I am from class implementing BiConsumer");
        System.out.println(list);

    }
    
    

    @Test
    public void Supplier() {
        EDog dog = this.createDog();
        Supplier<EDog> dogSupplier = new DogSupplier();
        /*
         * Dopisz lambdę będącą równoważną dla dogSupplier. Brak argumentow w
         * lambdzie oznacza sie ()
         */
        Supplier<EDog> dogLambda = () -> new EDog();
        
        dog.makeSound();
        dogLambda.get().makeSound();
        dogSupplier.get().makeSound();

    }

    @Test
    public void Predicate() {
    	this.isEven(10);
    	Predicate<Integer> lambdaPredicate = n -> n % 2 == 0;
    	Predicate<Integer> classPredicate = new OwnClassWithPredicate();
        /*
         * Predicate jest ostatnim z poznanych dzis domyslnych iterfaceow
         * domyslnych. Sluzy do sprawdzania warunkow. Jest sparametryzowany, np
         * sprawdzajac warunki dla Integerow jest typu Predicate<Integer>.
         * Napisz metode, klase implementujaca Predicate<Integer> oraz lambde,
         * ktora bedzie sprawdzala czy przekazana liczba jest parzysta.
         */
    }
    
    public boolean isEven(int i) {
    	return i % 2 == 0;
}
    
    

    private EDog createDog() {
        return new EDog();
    }

    private int square(int value) {
        return value * value;
    }

    private int sumAndPrint(int a, int b) {
        int sum = a + b;
        System.out.println(String.format("Sum of %d and %d is equal to %d", a,
                        b, sum));
        return sum;
    }

    private void sayReversedString(String value) {
        String reversed = new StringBuilder(value).reverse().toString();
        System.out.println(reversed);
    }

    private void addToList(List<String> list, String string) {
        list.add(string);
    }
}
