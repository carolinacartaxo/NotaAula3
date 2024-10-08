public class Cachorro extends Animal {

    public Cachorro() {
        this.consegueCaminhar = true;
    }

    public Cachorro(String nome) {
        super(nome);
        this.consegueCaminhar = true;
    }

    public void late(){
        System.out.println("O cachorro está latindo.");
    }


}