package com.zipcodewilmington.danny_do_better_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Created by leon on 2/5/18.
 */
public class ZipcodeRocks {
    private static void whatever() {
        System.out.println("Hello world");
    }

    private static Runnable runnable = () -> System.out.println("Hello world");
    private static Consumer<String> stringConsumer = (str) -> System.out.println(str);
    private static BiConsumer<String, Integer> biStringConsumer = (str, intt) -> System.out.println(str + intt);

    public static void main(String[] args) {
        test2();
    }

    public static  void test2() {
        Person person = new PersonBuilder()
                .setAge(15)
                .setLastName("Hunter")
                .setFirstName("Leon")
                .build();

        List<Person> filteredByT = Arrays
                .asList("The", "Quick", "Brown", "Fox")
                .stream()
                .filter(word -> {
                    System.out.println("Mannnn these foxes are quick AND BROWN");
                    return word.charAt(0) == 'T';
                })
                .map(word -> new Person(word, "", 10))
                .collect(Collectors.toList());

    }



    public static void test1() {
        whatever();
        runnable.run();
        runnable.run();
    }


}
