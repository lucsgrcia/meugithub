package aula8.application;
import java.util.Scanner;
import aula8.entities.Employee;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos salarios serao registrados: ");
        int n = sc.nextInt();
        
        Employee[] employee = new Employee[n];
        int[] ids = new int [n];
        
        int id;
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("\nSalario #"+(i+1));
            sc.nextLine();
            System.out.print("Id: ");
            id = sc.nextInt();
            ids[i] = id;
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            
            employee[i] = new Employee(id,nome,salario);
        }
        
        System.out.print("\nDigite o id do funcionario que receberá o aumento: ");
        id = sc.nextInt();

        int cont=0;

        for (int j = 0; j < n; j++) {

            if(id==ids[j]){

                System.out.print("Digite a porcentagem: ");
                double percentage = sc.nextDouble();
                employee[j].setSalary(percentage);
                cont++;
            }                
        }

        if(cont==0){
            System.out.println("Este id nao existe!");
        }
        
        System.out.println("Lista de salarios:");
        for (int i = 0; i < n; i++) {
            
            System.out.println(employee[i]);
        }
    }    
}