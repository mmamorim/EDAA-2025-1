//package Aula03_11Mar.projeto;

public class Prog2 {
    public static void main(String[] args) {
        List lista = new List(5);

        lista.add(2, 0);
        lista.show();
        lista.add(5, 0);
        lista.show();
        lista.add(7, 1);
        lista.show();
        lista.add(12, 2);
        lista.show();

        int elem = lista.remove(3);
        System.out.println("saiu: " + elem);
        lista.show();
        lista.add(77, 3);
        lista.add(78, 4);
        lista.add(100, 1);
        lista.show();

    }
}
