package Exercicio_Condicional;

import java.util.Scanner;
//Importação da classe scanner para receber informações do usuario pelo console.//

public class Exercicio_03 {

	public static void main(String[] args)

	{
		Scanner ler = new Scanner(System.in);
		// CRIAÇÃO DO OBJETO DE LEITURA DO TIPO SCANNER.//

		double ac01, ac02, ag, af, valor;
		// DECLARAÇÃO DE VARIAVEIS DO TIPO "DOUBLE" QUE REPRESENTAM NUMEROS DE PONTO
		// FLUTUANTE DE PRECISÃO DUPLA. //

		System.out.printf("Digite a nota tirada pelo aluno na avaliacao Ac1: ");
		ac01 = ler.nextDouble();
		// AQUI VARIAVEL "ac01" ESTÁ RECEBENDO "LER" COM O MÉTODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao Ac2: ");
		ac02 = ler.nextDouble();
		// AQUI VARIAVEL "ac02" ESTÁ RECEBENDO "LER" COM O MÉTODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao AG: ");
		ag = ler.nextDouble();
		// AQUI VARIAVEL "ag" ESTÁ RECEBENDO "LER" COM O MÉTODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao AF: ");
		af = ler.nextDouble();
		// AQUI VARIAVEL "af" ESTÁ RECEBENDO "LER" COM O MÉTODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		valor = (ac01 * 0.15) + (ac02 * 0.30) + (ag * 0.10) + (af * 0.45);
		// AQUI A VARIAVEL "VALOR" ESTÁ RECEBENDO OS VALORES QUE FORAM INSERIDOS PELO
		// USUÁRIO EM CADA VARIAVEL E MULTIPLICANDO PELO VALOR DETERMINADO A CADA UM. //

		if (valor >= 5)
		// AQUI UTILIZAMOS DA CONDICIONAL "IF" E COLOCAMOS UMA CONDIÇÃO PARA EXECUTAR O
		// QUE ESTIVER DENTRO DA CHAVE ONDE A CONDIÇÃO É QUE-
		// SE A VARIAVEL "VALOR" FOR MAIOR OU IGUAL A 5 É VERDADIRO. //

		{
			System.out.println("\nA Nota Final do Aluno e (" + valor + ") Ele foi Aprovado.");

		} else
		// UTILIZAMOS O ELSE POR QUE CASO A VARIAVEL "VALOR" NÃO CUMPRA A CONDIÇÃO
		// DECLARADA PELO "IF" ELA SERA CONSIDERADA FALSA E EXECUTARA A CHAVE DENTRO DO
		// ELSE. //

		{
			System.out.printf("\nA Nota Final do Aluno e (" + valor + ") Ele foi Reprovado.");

		}

		ler.close();
		// UTILIZAMOS O MÉTODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

	}
}
