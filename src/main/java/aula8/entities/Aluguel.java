package aula8.entities;

public class Aluguel {
    
    private String nome,email;
    private int quarto;
    
    public Aluguel(){
        super();
    }
    
    public Aluguel(String nome, String email, int quarto){
        
        this.nome = nome;
        this.email = email;
        this.quarto = quarto+1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
    
    @Override
    
    public String toString(){
        
        return quarto + ": " + nome + ", " + email;
    }    
}