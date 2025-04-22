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