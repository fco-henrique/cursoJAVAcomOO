package generics.equalEhash.application;

public class Program {
    public static void main(String[] args) {

        Pessoa a = new Pessoa("pedro", 10);
        Pessoa b = new Pessoa("pedro", 10);

        String aa = "pedro";
        String bb = "pedro";

        //Usando ==, ele funciona em tipos primitivos, mas quando passamos para objetos personalizados, ele não funciona
//        if (a == b) System.out.println(true);
//        else System.out.println(false);
//        System.out.println(a == b);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a == b); //não funciona em objetos personalizados, e nem se você utilizar o new em tipos primitivos

    }
}
