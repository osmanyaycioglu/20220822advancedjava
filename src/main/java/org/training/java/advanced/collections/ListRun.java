package org.training.java.advanced.collections;


import org.training.java.advanced.composition.usage.*;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("osman");
        stringList.add("ali");

        String s = stringList.get(1);
        int size = stringList.size();
        stringList.add("veli");
        stringList.add("veli");
        stringList.add("veli");
        stringList.add("osman");
        stringList.remove(1);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("---------------");
        for (String str : stringList) {
            System.out.println(str);
        }
        System.out.println("---------------");
        stringList.forEach(rt -> System.out.println(rt));

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(new CarType(ECarType.DIZEL,
                                        120),
                            new TransType(ETransType.MANUEL,
                                          180)));
        Car car = carList.get(0);

        List<Object> objectList = new ArrayList<>();
        List objectList2 = new ArrayList<>();
        objectList2.add("osman");
        objectList2.add(100);

    }
}
