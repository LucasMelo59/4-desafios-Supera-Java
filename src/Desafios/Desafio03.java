package Desafios;

import java.util.*;

public class Desafio03 {

    public void Desafio03(){
        int k = 2;
        List<Integer> arr = Arrays.asList(1, 5, 3, 4, 2);

        List<String> values = new ArrayList<>();

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {

            for (int j = 0; j < arr.size(); j++) {

                if(arr.get(i) - arr.get(j) == k) {
                    values.add(arr.get(i) + " - " + arr.get(j));
                }

            }

        }

        System.out.println("total de pares - " + values.size());
        values.forEach(System.out::println);
    }
}
