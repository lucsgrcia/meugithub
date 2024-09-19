package aula8.application;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero de linhas e colunas, respectivamente: ");
        int l = sc.nextInt();
        int c = sc.nextInt();
        
        int [][] matriz = new int [l][c];
        
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {                
                
                matriz[i][j] = sc.nextInt();
            }            
        }
        
        System.out.println("Digite um numero da matriz: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                
                if(n==matriz[i][j]){
                    
                    System.out.println("Posicao: "+i+","+j);
                    
                    if(j>0){
                        System.out.println("Esquerda: "+matriz[i][j-1]);
                    }
                    
                    if(j<c-1){
                        System.out.println("Direita: "+matriz[i][j+1]);
                    }
                    
                    if(i>0){
                        System.out.println("Acima: "+matriz[i-1][j]);
                    }
                    
                    if(i<l-1){
                        System.out.println("Abaixo: "+matriz[i+1][j]);
                    }
                }
            }            
        }
    }
}