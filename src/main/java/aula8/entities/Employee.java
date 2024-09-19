package aula8.entities;

public class Employee {
    
    private int id;
    private double salary;
    private String nome;
    
    public Employee(){
        super();
    }
    
    public Employee(int id, String nome, double salary){
        
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary += (salary/100)*this.salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override    
    public String toString(){
        
        return id + ", " + nome + ", " + String.format("%.2f", salary);
    }
}
