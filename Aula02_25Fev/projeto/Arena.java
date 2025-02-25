public class Arena {
    private String nome;
    private int qtdeConfrontos;

    public Arena(String nome) {
        this.nome = nome;
        qtdeConfrontos = 0;
    }

    public void realizaConfronto(Personagem p1, Personagem p2) {
        Superpoder sp1 = p1.getPoderAleatorio();
        Superpoder sp2 = p2.getPoderAleatorio();
        System.out.println("["+p1.getNome()+"] lançou poder ["+sp1.getNome()+"]");
        System.out.println("["+p2.getNome()+"] lançou poder ["+sp2.getNome()+"]");

        if(sp1.getForca() < sp2.getForca()) {
            System.out.println("["+p2.getNome()+"] venceu!");
        } else if(sp1.getForca() > sp2.getForca()) {
            System.out.println("["+p1.getNome()+"] venceu!");
        } else {
            System.out.println("Ninguém venceu!");
        }
        qtdeConfrontos++;
    }

    public void imprime() {
        System.out.println("Arena: "+nome+" com "+qtdeConfrontos+" confrontos");
    }
}
