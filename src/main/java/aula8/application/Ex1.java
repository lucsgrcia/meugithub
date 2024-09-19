package aula8.application;
import java.util.Scanner;
import aula8.entities.Aluguel;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos quartos serao alugados: ");
        int n = sc.nextInt();
        
        Aluguel[] aluguel = new Aluguel[10];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Aluguel #"+(i+1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt()-1;           
            
            aluguel[quarto] = new Aluguel(nome,email,quarto);
        }
        
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            
            if(aluguel[i]!=null){
                System.out.println(aluguel[i]);
            }
        }
    }    
}