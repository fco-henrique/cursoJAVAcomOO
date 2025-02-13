package generics.application;

import generics.entities.Circulo;
import generics.entities.Retangulo;
import generics.entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Circulo(3.0));
        list.add(new Retangulo(2.0,5.0));

        List<Circulo> c = new ArrayList<>();
        c.add(new Circulo(2.0));
        c.add(new Circulo(3.0));

        System.out.println("Área total: " + areaTotal(c));

        //COVARIÂNCIA
//        List<Integer> intlist = new ArrayList<Integer>();
//        intlist.add(10);
//        intlist.add(45);
//
//        List<? extends Number> listNum = intlist;
//
//        Number x = listNum.get(0);
//        listNum.add(55); //não pode ser, pois não se sabe qual o subtipo de number pode ser
//        get: Ok, put: No

        //CONTRAVARIÂNCIA
//        List<Object> objs = new ArrayList<Object>();
//        objs.add("Maria");
//        objs.add("kauã");
//
//        List<? super Number> listObj = objs;
//
//        listObj.add(0);
//        listObj.add(55);
//        Number x = listObj.get(0); //não pode ser, pois pode ser um super tipo de Number
//        get: No, put: Ok

        List<Integer> inteiros = Arrays.asList(1,5,7,8,2);
        List<Double> reais = Arrays.asList(1.0,5.5,7.8,8.9,2.3);
        List<Object> objeto = new ArrayList<>();

        copia(inteiros, objeto);
        copia(reais, objeto);

        for (Object ob : objeto) {
            System.out.println(ob);
        }
    }

    public static double areaTotal(List<? extends Shape> list) { // isso quer dizer que ele aceita apenas uma lista do tipo shape, ou qualquer uma que tenha um tipo que seja subtipo de shape
        double soma = 0;
        for (Shape s: list) {
            soma += s.area();
        }

        return soma;
    }

    public static void copia(List<? extends Number> saida, List<? super Number> destino) {
        for (Number num : saida) {
            destino.add(num);
        }
    }
}
