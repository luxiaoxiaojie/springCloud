package com.example.demo;

import com.example.demo.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * jdk8新特性lamdba表达式
 */
public class Lambda {
    List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5,6,7,8,5);
        long count = a.stream().filter(c -> c > 4).count();
        testLambda(a);


     //   System.out.println(count);

        ArrayList<Integer> integers = new ArrayList<>();
    }

    public static void testLambda(List<Integer> list){
     //   list.forEach(e -> System.out.println(e));
        testMethod();
        Stream<Integer> distinct = list.stream().distinct();
        distinct.forEach(e -> System.out.println(e));

        //    list.forEach(System.out::println);
    }


    public static void testMethod(){
        ArrayList<Car> carList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setMoney(i+"qian");
            car.setName(i+"ming");
            carList.add(car);
        }
        carList.forEach(e -> System.out.println(e.getMoney()));
    }
}
