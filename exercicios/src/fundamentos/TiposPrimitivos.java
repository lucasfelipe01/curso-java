package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionário
		
		
		//Tipos Numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos númericos reais
		
	    float salario = 11_445.44F;
	    double vendasAcumuladas = 2_991_797_103.01;
	    
	    //Tipo booleano
	    boolean estaDeFerias = false; //true
	    
	    //Tipo caractere
	    char status ='A'; //ativo
	    
	    //Dias de empresa
	    
	    System.out.println(anosDeEmpresa * 365);
	    
	    //Numeros de Viagens
	    
	   System.out.println(numeroDeVoos / 2);
	   
	   //Pontos por real
	   System.out.println(pontosAcumulados / vendasAcumuladas);
	   
	   //Usando o Id
	   
	   System.out.println(id + ":Ganha ->" + salario);
	   
	   //Usando férias
	   System.out.println("Férias? " + estaDeFerias);
	   
	   //Usando Stats
	   System.out.println("Status: " + status);
		
	}
}
