public class Animal {
    protected String nome, raca;
    protected boolean consegueCaminhar;

    public Animal(){

    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setConsegueCaminhar(boolean consegueCaminhar) {
        this.consegueCaminhar = consegueCaminhar;
    }

    public void caminha(){
        if (consegueCaminhar){
            System.out.println("O animal está caminhando.");
        } else {
            System.out.println("Esse animal não consegue caminhar.");
        }
    }

}