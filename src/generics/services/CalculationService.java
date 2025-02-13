package generics.services;

import generics.entities.Produto;

import java.util.List;

public class CalculationService<T> {
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if(list.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }

        T max = list.get(0);
        for (T i : list) {
            if(i.compareTo(max) > 0) max = i;
        }

        return max;
    }
}
