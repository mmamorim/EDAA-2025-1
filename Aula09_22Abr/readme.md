# Aula 09 (22/04) - Ordenação

## Bolha

~~~java
public static void bolha(int[] vetor) {
    int aux;
    for(int i=0; i< vetor.length; i++) {
        boolean trocou = false;
        for(int k=0; k < vetor.length-i-1; k++) {
            if(vetor[k] > vetor[k+1]) {
                aux = vetor[k];
                vetor[k] = vetor[k+1];
                vetor[k+1] = aux;
                trocou = true;
            }
        }
        if(!trocou) {
            break;
        }
    }
}
~~~

## Seleção

~~~java
public static void selecao(int[] vetor) {
    int posMaior, aux;
    for(int i=0; i< vetor.length-1; i++) {
        posMaior = 0;
        for(int k=1; k < vetor.length-i; k++) {
            if(vetor[k] > vetor[posMaior]) {
                posMaior = k;
            }
        }
        //System.out.println("trocando maior "+vetor[posMaior]+" com a posição "+(vetor.length-i-1));
        aux = vetor[vetor.length-i-1];
        vetor[vetor.length-i-1] = vetor[posMaior];
        vetor[posMaior] = aux;
    }
}
~~~

## Inserção

~~~java
public static void insercao(int[] vetor) {
    int k, aux;
    for(int i=1; i< vetor.length; i++) {
        //System.out.println("onde encaixar o elemento posição "+i);
        aux = vetor[i];
        for(k=i; k > 0; k--) {
            if(aux < vetor[k-1]) {
                vetor[k] = vetor[k-1];
            } else {
                break;
            }
        }
        //System.out.println("posicionando elemento em "+k);
        vetor[k] = aux;
    }
}
~~~