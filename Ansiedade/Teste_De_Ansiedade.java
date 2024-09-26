//Desenvolvido por:Mari_Camila - Data:26/09/2024
//Exercicio
//CRIE UM PROGRAMA CHAMADO TESTE DE ANSIEDADE ONDE O USTUÁRIO RESPONDERA 10 PERGUNTAS ESPECÍFICAS PARA O RESULTADO FINAL O USUÁRIO PODE RESPONDER APENAS SIM OU NÃO PARA CADA PERGUNTA
//AS PERGUNTAS ESPECÍFICAS SÃO:
//Você se sente com dificuldade de concentração?
//Você se sente cansado facilmente?
//Tem dificuldades em adormecer ou permanecer a dormir?
//Você se preocupa muito com o futuro?
//Tem dificuldade em relaxar?
//Sentiu-se tão preocupado que foi dificil ficar parado?
//Sentiu-se facilmente irritável ou chateado?
//Sentiu medo como se algo muito ruim fosse acontecer?
//Você se preocupa com a opinião dos outros?
//Você está com dificuldades em lembrar os detalhes?

import java.util.Scanner;
public class Teste_De_Ansiedade {
public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);
	        
	        String[] respostas = new String[10];
	        String[] perguntas = {
	            "Você se sente com dificuldade de concentração?",
	            "Você se sente cansado facilmente?",
	            "Tem dificuldade em adormecer ou permanecer a dormir?",
	            "Você se preocupa muito com o futuro?",
	            "Tem dificuldade em relaxar?",
	            "Sentiu-se tão preocupado que foi difícil ficar parado?",
	            "Sentiu-se facilmente irritável ou chateado?",
	            "Sentiu medo como se algo muito ruim fosse acontecer?",
	            "Você se preocupa com a opinião dos outros?",
	            "Você está com dificuldade em lembrar os detalhes?"
	        };
	        
	        System.out.println("Abaixo você irá responder 10 perguntas para testar seu grau de ansiedade.");
	        System.out.println("Digite 'sim' ou 'não' para as perguntas abaixo.");

	        for (int i = 0; i < perguntas.length; i++) {
	            System.out.println((i + 1) + ". " + perguntas[i]);
	            respostas[i] = scanner.nextLine().trim().toLowerCase();
	        }

	        int contagemSim = 0;
	        for (String resposta : respostas) {
	            if (resposta.equals("sim")) {
	                contagemSim++;
	            }
	        }

	        String classificacao;
	        if (contagemSim >= 7) {
	            classificacao = "Você possui fortes indícios de ansiedade. Por favor, procure terapia.";
	        } else if (contagemSim >= 5) {
	            classificacao = "Você precisa cuidar do corpo e da mente.";
	        } else {
	            classificacao = "Você está aparentemente bem e sem riscos de ansiedade.";
	        }

	        System.out.println(classificacao);
	        scanner.close();
	    }
	}
