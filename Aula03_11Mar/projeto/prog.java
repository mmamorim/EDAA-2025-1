//package Aula03_11Mar.projeto;

public class prog {
    public static void main(String[] args) {
        Stack pilha = new Stack(5);
        
        pilha.push(2);
        pilha.push(5);
        pilha.push(7);
        pilha.push(12);

        pilha.show();
        int elem = pilha.pop();
        System.out.println("saiu: "+elem);
        pilha.show();
        pilha.push(77);
        pilha.push(127);
        pilha.push(78);
        pilha.push(120);
        pilha.show();

    }
}
