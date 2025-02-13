package generics.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,5,7,8);
        printList(ints);

        System.out.println("------------------------------------");

        List<Double> dbs = Arrays.asList(2.0,3.0,4.5);
        printList(dbs);

//        da erro
//        List<?> list = new ArrayList<>();
//        list.add(0);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
