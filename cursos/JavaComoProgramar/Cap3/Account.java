public class Account {
     private String name; //Variável de instância 
     private double balance; //Variável de instância
   
     //Construtor de Account que recebe dois parâmetros
     public Account(String name, double balance){
        this.name = name; // Atribui name a variável de instância name
	      //Valida se o parâmetro balance é maior que 0.0, se não for 
	      // mantem o valor padrão 0.0 na variável de instância balance
	      if(balance > 0.0){ // Se o saldo for valido
	        this.balance = balance; // o atribui a variável de instância balance
	      }
     }
   
     //Método que deposita(adiciona) apenas uma quantia valida no saldo
     public void deposit(double depositAmount){
       if(depositAmount > 0.0 ){// Se depositAmount for valido
	       this.balance = this.balance + depositAmount; // o adiciona no saldo  
	     }
     }
   
     //Método que retorna o saldo da conta
     public double getBalance(){
       return this.balance;
     }
   
     //Método que define o nome
     public void setName(String name){
       this.name = name;
     }  
   
     //Método que retorna o nome
     public String getName(){
       return this.name;
     }

     public void withdraw(double withdrawAmount){
        if(withdrawAmount <= this.balance){
            this.balance = this.balance - withdrawAmount;
        }else{
            System.out.println("Withdrawall amount exceeded account balance");
        }
     }
}