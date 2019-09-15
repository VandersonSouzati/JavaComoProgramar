public class EmployeeTeste{
	public static void main(String args[]){
	   Employee employee1 = new Employee("Vanderson", "Souza", 5000.00);
	   Employee employee2 = new Employee("Vanessa", "Souza", 4000.00);
       
	   System.out.println("Salario anual do Employee1: "+ (employee1.getSalarioMensal() * 12 ));
	   System.out.println("Salario anual do Employee2: "+ (employee2.getSalarioMensal() * 12 ));
       
	   System.out.println("\n............Aplicando aumento de 10%..............\n");
	   
	   employee1.setSalarioMensal( employee1.getSalarioMensal() * 1.10 );
	   employee2.setSalarioMensal( employee2.getSalarioMensal() * 1.10 );
        
       System.out.printf("Novo salario anual do employee1: %.2f%n", employee1.getSalarioMensal() * 12 );
       System.out.printf("Novo salario anual do employee2: %.2f%n", employee2.getSalarioMensal() * 12 );
	}
}