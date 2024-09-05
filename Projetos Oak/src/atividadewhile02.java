import java.util.Scanner;

public class atividadewhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String senha = "senha123";
        String senhavazio = "";

        while (!senha.equals(senhavazio)){
            System.out.println("Digite a senha: ");
            senhavazio = sc.nextInt();

            if (senha.equals(senhavazio)){
                System.out.println("Senha correta!");
            }
            else{
                System.out.println("Senha incorreta!");
            }
            sc.close();
        }

        
    }

}
