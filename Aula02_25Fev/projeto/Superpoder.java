
public class Superpoder {
    private String nome;
    private int forca;
    
    public Superpoder(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    } 
 
    public int getForca() {
        return forca;
    } 

    public void imprime() {
        System.out.println("Superpoder: ["+nome+"] com força "+forca);
    }
}