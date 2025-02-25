

public class Prog {
    public static void main(String[] args) {
        
        Personagem flash = new Personagem("Flash","Barry Alen");
        flash.addSuperpoder(new Superpoder("velocidade", 5));
        flash.addSuperpoder(new Superpoder("raio", 2));
        flash.addSuperpoder(new Superpoder("salto mortal", 3));
        flash.imprime();

        Personagem heman = new Personagem("He-man","Principe Adam");
        heman.addSuperpoder(new Superpoder("Espada cruel", 5));
        heman.addSuperpoder(new Superpoder("Tigre Pacato", 3));
        heman.imprime();

        Arena itaquerao = new Arena("Itaquerão");
        itaquerao.realizaConfronto(flash, heman);
        itaquerao.imprime(); 
    }    
}
