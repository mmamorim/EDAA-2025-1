//package Aula03_11Mar.projeto;

public class Prog {
    public static void main(String[] args) {
        Queue fila = new Queue(5);
        
        fila.add(2);
        fila.add(5);
        fila.add(7);
        fila.add(12);

        fila.show();
        int elem = fila.remove();
        System.out.println("saiu: "+elem);
        fila.show();
        fila.add(77);
        fila.add(78);
        fila.add(79);
        fila.show();

    }
}
