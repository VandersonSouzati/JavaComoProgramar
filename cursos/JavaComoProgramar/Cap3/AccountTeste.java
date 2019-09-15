import java.util.Scanner; 
public class AccountTeste{
  public static void main(String args[]){

      Account account1 = new Account("Jean Green", 50.00);
  	  Account account2 = new Account("John Blue", -7.53);
	
	    //Exibe o saldo incial de cada objeto
	    displayAccount(account1);
      displayAccount(account2);
      
      //Cria um Scanner para obter uma entrada a partie da janela de comando
      Scanner  input = new Scanner(System.in);
      System.out.print("Enter deposit amount for account1: "); //prompt
      double depositAmount = input.nextDouble(); // Obtem a entrada do prompt
      System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
      account1.deposit(depositAmount);
    
      //Exibe os saldos 
      displayAccount(account1);
      displayAccount(account2);
      
      System.out.print("Enter deposit amount for account2: ");
  	  depositAmount = input.nextDouble(); //Obtem a entrada do usuário
	    System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
	    account2.deposit(depositAmount);
	
	    //Exibe o saldo 
	   displayAccount(account1);
      displayAccount(account2);    
      //  Sacando um valor
      System.out.print("Enter com o valor de saque para account1: ");
      double withdrawAmount = input.nextDouble();
      account1.withdraw(withdrawAmount);

      //Exibindo os saldos
      displayAccount(account1);
      displayAccount(account2);

  }

  public static void displayAccount(Account accountToDisplay){
     System.out.printf("%s balance $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
  }
}