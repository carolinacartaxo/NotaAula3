import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Animal a = new Animal();
        String repetir = "s";

        do{
            System.out.println("== Cadastro de animais==");
            System.out.println("Digite o nome do animal: ");
            String nome = sc.next();
            System.out.println("Digite a raça do animal:");
            String raca = sc.next();
            if (raca.equalsIgnoreCase("cachorro")){
                c.late();
                c.caminha();
            } else if (raca.equalsIgnoreCase("gato")){
                g.mia();
                g.caminha();
            } else {
                System.out.println("O animal caminha ou sabe caminhar? [true/false]");
                a.setConsegueCaminhar(sc.nextBoolean());
                a.caminha();
            }
            System.out.println("Deseja cadastrar outro animal? Digite 's'");
            repetir = sc.next();
        } while (repetir.equalsIgnoreCase("S"));
    }
}