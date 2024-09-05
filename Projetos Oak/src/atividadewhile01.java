import java.util.Scanner;
public class atividadewhile01{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            

        int senha;
        
        System.out.print("Digite sua senha: ");
        senha = sc.nextInt();
        
        
        while (senha != 12345){
            System.out.print("Senha Incorreta, digite novamente: ");
            senha = sc.nextInt();
        }
        System.out.print("Acesso Permitido");

        sc.close();
    
    }


}
