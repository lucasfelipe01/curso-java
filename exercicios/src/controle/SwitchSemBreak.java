package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		
		
		String faixa= "branca";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai-dai...");
		case "marrom":
			System.out.println("Sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o Heian godan");
		case "verde":
			System.out.println("Sei heian yodan");
		case "laranja":
			System.out.println("Sei o heian sandan");
		case "vermelha":
			System.out.println("Sei o heian nidan");
		case "amarela":
			System.out.println("SEi o heian shodan");
		break;	
		default: 
			System.out.println("Não sei de nada");
		
		}
		System.out.println("Fim!");
		
		int idade = 3;
		switch (idade) {
		
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0: 	
			System.out.println("Sabe respirar");
		}
	}

}
