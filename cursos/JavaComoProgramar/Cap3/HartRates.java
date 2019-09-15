public class HartRates{
	private String nome; 
	private String sobreNome; 
	private int mes;
	private int dia; 
	private int ano;

	public HartRates(String nome, String sobreNome, int mes, int dia, int ano){
         this.nome = nome; 
         this.sobreNome = sobreNome; 
         this.mes = mes; 
         this.dia = dia; 
         this.ano = ano;
	}

	public String getNome(){
	   return this.nome;
	}
	public void setNome(String nome){
	   this.nome = nome;
	}
	public String getSobreNome(){
	   return this.sobreNome;
	}
	public void setSobreNome(String sobreNome){
	   this.sobreNome = sobreNome;
	}
	public int getMes(){
	   return this.mes;
	}
	public void setMes(int mes){
	   this.mes = mes;
	}
	public int getDia(){
	   return this.dia;
	}
	public void setDia(int dia){
	   this.dia = dia;
	}
	public int getAno(){
	   return this.ano;
	}
	public void setAno(int ano){
	   this.ano = ano;
	}

	public int totalAnos(){
	   int ano = (2019-this.ano); 
	   return ano;
	}

	public int frequenciaMaxima(){
	   return 220 - totalAnos();
	}

	public int frequenciaAlvo(){
	   double vl = (double) frequenciaMaxima();
	   int res = (int)(vl * 0.68);
	   return res;
	}

}