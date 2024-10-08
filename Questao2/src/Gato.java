public class Gato extends Animal {

    public Gato() {
        this.consegueCaminhar = true;
    }

    public Gato(String nome) {
        super(nome);
        this.consegueCaminhar = true;
    }

    public void mia(){
        System.out.println("O gato está miando.");
    }
}