package sets.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main0 {
    public static void main(String[] args) {
        Set<Integer> a = new LinkedHashSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,13,17));
        Set<Integer> b = new LinkedHashSet<>(Arrays.asList(0,2,4,6,8,10,18,21));
        Set<Integer> c = new LinkedHashSet<>(a);

//<=====================OPERAÇÕES COM CONJUNTO=========================>

        //Removendo algo do conjunto
        a.remove(1);
        //Vendo se um determindado obj está no conjunto
        System.out.println(b.contains(5));
        //tamanho do conjunto
        System.out.println(c.size());
        //Removendo itens do conjunto que atendam a determinda condição
        a.removeIf(x -> x > 10);

        //unindo dois conjuntos
        c.addAll(b);
        System.out.print("União de conjuntos: { ");
        for (Integer e : c) {
            System.out.print(e + " ");
        }
        System.out.println("}\n");

        c = new LinkedHashSet<>(a);

        //interseção de conjuntos
        c.retainAll(b);
        System.out.print("Interseção de conjuntos: { ");
        for (Integer e : c) {
            System.out.print(e + " ");
        }
        System.out.println("}\n");

        c = new LinkedHashSet<>(a);

        //diferença de conjuntos
        c.removeAll(b);
        System.out.print("Diferença de conjuntos: { ");
        for (Integer e : c) {
            System.out.print(e + " ");
        }
        System.out.println("}\n");
    }
}
