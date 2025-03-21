public class Personagem {
    private String nome;
    private String nomeVidaReal;
    private Superpoder poderes[];
    private int qtde;

    public Personagem(String nome, String nomeVidaReal) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        poderes = new Superpoder[10];
        qtde = 0;
    }

    public String getNome() {
        return nome;
    }
    
    public void addSuperpoder(Superpoder sp) {
        if(qtde<10) {
            poderes[qtde] = sp;
            qtde++;    
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public Superpoder getPoderAleatorio() {
        int num = (int) (Math.random()*10);
        num = num % qtde;
        return poderes[num];
    }

    public void imprime() {
        System.out.println("Personagem: "+nome+" ["+nomeVidaReal+"]");
        System.out.println("Superpoderes:");
        for(int i=0; i<qtde; i++) {
            poderes[i].imprime();
        }
    }
}
