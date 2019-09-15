public class AppHartRates {

	private static HartRates hartRates = new HartRates("Vanderson", "Souza", 03, 31, 1986);

	public static void main(String args[]){	
	    infoIdade();
	    infoFrequenciaMaxima();
	    infoFrequenciaAlvo();


	}

	public static void infoIdade(){
        String informacao = String.valueOf(hartRates.totalAnos());
        String layout = "Retorna idade:";
        String resp = "Idade";
        layout(informacao, layout, resp);
	}

	public static void infoFrequenciaMaxima(){
        String informacao = String.valueOf(hartRates.frequenciaMaxima());
        String layout = "Retorna Frequencia maxima";
        String resp = "Frequencia maxima";
        layout(informacao, layout, resp);
	}
    
    public static void infoFrequenciaAlvo(){
        String informacao = String.valueOf(hartRates.frequenciaAlvo());
        String layout = "Retorna Frequencia alvo";
        String resp = "Frequencia alvo";
        layout(informacao, layout, resp);
    }

    public static void layout(String informacao, String layout, String resp){
        System.out.println("+------------------------------+");
        System.out.println("|"+layout+"            |");
        System.out.println("+------------------------------+");
        System.out.println("| "+resp+ ": "+informacao+"    |");
        System.out.println("|                              |");
        System.out.println("+------------------------------+");
        System.out.println("\n\n");
    }
}