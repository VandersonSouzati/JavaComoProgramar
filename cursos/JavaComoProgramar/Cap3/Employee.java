public class Employee {
	private String nome; 
	private String sobreNome;
	private double salarioMensal;

	public Employee(String nome, String sobreNome, double salarioMensal){
       this.nome = nome;
       this.sobreNome = sobreNome;
       //Poderia ter usado o operador ternário: (salarioMensal >=0)?salarioMensal: 0.0;
       if(salarioMensal >= 0){ 
          this.salarioMensal = salarioMensal;
	   }
	}

	public String getNome(){
	   return this.nome;
	}
	public void setNome(String nome){
	   this.nome = nome;
	}
    public 	String getSobreNome(){
       return this.sobreNome;
    }
    public void setSobreNome(String sobreNome){
       this.sobreNome = sobreNome;
    }
    public double getSalarioMensal(){
       return this.salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal){
       this.salarioMensal = salarioMensal;
    }
}