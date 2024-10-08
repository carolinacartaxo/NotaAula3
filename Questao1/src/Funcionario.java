public class Funcionario {
    protected String nome;
    protected double salario;
    protected int diaNasc, mesNasc, anoNasc, idade;
    protected int diaAtual = 1;
    protected int mesAtual = 10;
    protected int anoAtual = 2024;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void informarSalario(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }

    public void calcularIdade(){
        idade = anoAtual - anoNasc;

        if (mesAtual < mesNasc || (mesAtual == mesNasc && diaAtual < diaNasc)) {
            idade--;
        }

        System.out.println("Idade: " + idade);
    }
}
