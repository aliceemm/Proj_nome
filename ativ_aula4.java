package projetos_LPA.aula04;

import java.util.Scanner;

public class ativ_aula4 {

	public static void main(String[] args) {
		// Variáveis
		double horatrab, valorhora, salbruto, salliquido, inss;
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Informe quantas horas foram trabalhadas");
		horatrab = ler.nextDouble();
				
		System.out.println("Informe quanto é ganhado por hora");
		valorhora = ler.nextDouble();
				
		// Processamento
		salbruto = horatrab * valorhora;
		inss = salbruto * 0.12;
		salliquido = salbruto - inss;
				
		// Saída
		System.out.println("O valor do salário bruto é: " + salbruto);
		System.out.println("O valor do salário líquido é: " + salliquido);
				
						

	}

}
