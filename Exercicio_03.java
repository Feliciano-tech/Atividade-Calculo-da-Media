package Exercicio_Condicional;

import java.util.Scanner;
//Importa��o da classe scanner para receber informa��es do usuario pelo console.//

public class Exercicio_03 {

	public static void main(String[] args)

	{
		Scanner ler = new Scanner(System.in);
		// CRIA��O DO OBJETO DE LEITURA DO TIPO SCANNER.//

		double ac01, ac02, ag, af, valor;
		// DECLARA��O DE VARIAVEIS DO TIPO "DOUBLE" QUE REPRESENTAM NUMEROS DE PONTO
		// FLUTUANTE DE PRECIS�O DUPLA. //

		System.out.printf("Digite a nota tirada pelo aluno na avaliacao Ac1: ");
		ac01 = ler.nextDouble();
		// AQUI VARIAVEL "ac01" EST� RECEBENDO "LER" COM O M�TODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao Ac2: ");
		ac02 = ler.nextDouble();
		// AQUI VARIAVEL "ac02" EST� RECEBENDO "LER" COM O M�TODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao AG: ");
		ag = ler.nextDouble();
		// AQUI VARIAVEL "ag" EST� RECEBENDO "LER" COM O M�TODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		System.out.printf("\nDigite a nota tirada pelo aluno na avaliacao AF: ");
		af = ler.nextDouble();
		// AQUI VARIAVEL "af" EST� RECEBENDO "LER" COM O M�TODO "nextDouble" PARA O
		// ESCANEAMENTO DO TECLADO. //

		valor = (ac01 * 0.15) + (ac02 * 0.30) + (ag * 0.10) + (af * 0.45);
		// AQUI A VARIAVEL "VALOR" EST� RECEBENDO OS VALORES QUE FORAM INSERIDOS PELO
		// USU�RIO EM CADA VARIAVEL E MULTIPLICANDO PELO VALOR DETERMINADO A CADA UM. //

		if (valor >= 5)
		// AQUI UTILIZAMOS DA CONDICIONAL "IF" E COLOCAMOS UMA CONDI��O PARA EXECUTAR O
		// QUE ESTIVER DENTRO DA CHAVE ONDE A CONDI��O � QUE-
		// SE A VARIAVEL "VALOR" FOR MAIOR OU IGUAL A 5 � VERDADIRO. //

		{
			System.out.println("\nA Nota Final do Aluno e (" + valor + ") Ele foi Aprovado.");

		} else
		// UTILIZAMOS O ELSE POR QUE CASO A VARIAVEL "VALOR" N�O CUMPRA A CONDI��O
		// DECLARADA PELO "IF" ELA SERA CONSIDERADA FALSA E EXECUTARA A CHAVE DENTRO DO
		// ELSE. //

		{
			System.out.printf("\nA Nota Final do Aluno e (" + valor + ") Ele foi Reprovado.");

		}

		ler.close();
		// UTILIZAMOS O M�TODO CLOSE PARA FECHAR O ESCANEAMENTO DO TECLADO.//

	}
}
