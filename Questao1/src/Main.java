import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();

        String repetir = "r";
        do {
            System.out.println("== Cadastro dos funcionário ==");
            System.out.println("Digite o número do que você deseja cadastrar: ");
            System.out.println("1 - Gerente");
            System.out.println("2 - Programador");
            System.out.println("3 - Outro tipo de funcionário");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("== Cadastro do Gerente ==");
                    System.out.println("Digite o nome:");
                    g.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    g.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    g.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    g.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    g.setAnoNasc(sc.nextInt());
                    System.out.println("Digite o projeto no qual ele trabalha:");
                    g.setProjeto(sc.next());
                    System.out.println("Informações do gerente: ");
                    g.informarSalario();
                    g.calcularIdade();
                    g.informarProjeto();
                    break;
                case 2:
                    System.out.println("== Cadastro do Programador ==");
                    System.out.println("Digite o nome:");
                    p.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    p.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    p.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    p.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    p.setAnoNasc(sc.nextInt());
                    System.out.println("Digite a linguagem com a qual ele trabalha:");
                    p.setLinguagem(sc.next());
                    System.out.println("Informações do programador: ");
                    p.informarSalario();
                    p.calcularIdade();
                    p.informarLinguagem();
                    break;
                case 3:
                    System.out.println("== Cadastro do Funcionário==");
                    System.out.println("Digite o nome:");
                    f.setNome(sc.next());
                    System.out.println("Digite o salário:");
                    f.setSalario(sc.nextDouble());
                    System.out.println("Digite a data de nascimento:");
                    System.out.println("Dia");
                    f.setDiaNasc(sc.nextInt());
                    System.out.println("Mês");
                    f.setMesNasc(sc.nextInt());
                    System.out.println("Ano");
                    f.setAnoNasc(sc.nextInt());
                    System.out.println("Informações do funcionário: ");
                    f.informarSalario();
                    f.calcularIdade();
                    break;
                default:
                    break;
            }
            System.out.println("Deseja realizar um novo cadastro? Digite 'r' caso sim");
            repetir = sc.next();
        } while (repetir.equals("r"));
    }
}