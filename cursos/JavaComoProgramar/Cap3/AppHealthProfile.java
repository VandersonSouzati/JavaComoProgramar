import java.util.Scanner;
public class AppHealthProfile{
	
	private static HealthProfile healthProfile;
    private static String nome,sobreNome; 
	private static char sexo; 
    private static double altura, peso;
    private static int mes, ano, dia;


	public static void main(String args[]){
	   
	   
	   Scanner teclado = new Scanner(System.in);

	   System.out.print("Digite o nome: ");
	   nome      = teclado.nextLine();
	   System.out.print("Digite o sobre nome: ");
       sobreNome = teclado.nextLine();
       System.out.print("Digite o sexo: ");
       sexo      = teclado.next().charAt(0);
       System.out.print("Digite a altura: "); 
       altura    = teclado.nextDouble();
       System.out.print("Digite o peso: "); 
       peso      = teclado.nextDouble();
       System.out.print("Digite o ano de nascimento: ");
       ano       = teclado.nextInt();
       System.out.print("Digite o mes: ");
       mes       = teclado.nextInt();
       System.out.print("Digite o dia: ");
       dia       = teclado.nextInt();
       
       healthProfile = new HealthProfile(nome, sobreNome, sexo, altura, peso, mes, dia, ano);
       mostraInfo(); 
    }

    public static void mostraInfo(){
    	System.out.println("+-------------------------+");
    	System.out.println("| Dados Pessoais          | ");
        System.out.println("+-------------------------+\n");
     	System.out.printf("Nome: %s%n", healthProfile.getNome());
    	System.out.printf("SobreNome: %s%n", healthProfile.getSobreNome());
    	System.out.println("Sexo: "+healthProfile.getSexo());
    	System.out.println("Altura: "+healthProfile.getAltura());
    	System.out.println("Peso: "+ healthProfile.getPeso());
    	System.out.println("Idade: "+healthProfile.retornaTotalAnos() + " anos ");
    	System.out.println("Frequencia maxima: "+healthProfile.retornaFrequenciaMaxima());
    	System.out.println("Frequencia alvo: "+ healthProfile.retornaFrequenciaAlvo());
    	System.out.printf("IMC: %.2f%n", healthProfile.retornaIMC());
    	System.out.println("DataNascimento: "+healthProfile.getDia()+"/"+healthProfile.getMes()+"/"+healthProfile.getAno());
    	System.out.println("\n+---------------------------------+");

    }
}