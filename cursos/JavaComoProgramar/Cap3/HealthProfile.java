public class HealthProfile {
	private String nome; 
	private String sobreNome; 
	private  char sexo;
	private double altura; 
	private double peso; 
    private int mes; 
    private int dia; 
    private int ano;

	public HealthProfile(String nome, String sobreNome, char sexo, double altura, double peso, int mes, int dia, int ano){
        this.nome = nome; 
        this.sobreNome = sobreNome; 
        this.sexo = sexo; 
        this.altura = altura;
        this.peso = peso;
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
	public char getSexo(){
	   return this.sexo;
	}
	public void setSexo(char sexo){
	   this.sexo = sexo;
	}
	public double getAltura(){
	   return this.altura;
	}
	public void setAltura(double altura){
	   this.altura = altura;
	}
	public double getPeso(){
       return this.peso;
	}
	public void setPeso(double peso){
	   this.peso = peso;
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
    public int retornaTotalAnos(){
       return (2019 - this.ano); 
    }
    public int retornaFrequenciaMaxima(){
       int frequenciaMaxima = ( 220 - retornaTotalAnos() ); 
       return frequenciaMaxima ;
    }
    public int retornaFrequenciaAlvo(){
          int frequenciaAlvo = (int)(retornaFrequenciaMaxima() * 0.68);
          return frequenciaAlvo;  
    }
    public double retornaIMC(){
          double imc = (this.peso / (this.altura * this.altura) );
          return imc; 
    }

}