package br.com.edward.beloprojeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Integer tamanhoOvo, fritadas = 0, menu = 1;
		Scanner scanner = new Scanner(System.in);
		//		if (args.length == 1) {
		//			LocalDate nasc = LocalDate.parse(args[0], DateTimeFormatter.ISO_LOCAL_DATE);
		//			Pessoa p = new Pessoa(nasc);
		//			System.out.println(p.getIdade());
		//			
		//		} else {
		//			System.out.println("ta errado");
		//		}	
		
		
		System.out.print("Digite o tamanho do ovo que deseja fritar: ");
		tamanhoOvo = scanner.nextInt();
		
		Ovo ovo = new Ovo(tamanhoOvo);
		ovo.quebrar();
		
		while(menu == 1) {			
			System.out.print("\nDigite a quantidade de fritadas: ");
			fritadas += scanner.nextInt();
			
			for (int i = 0; i < fritadas; i++) {
				ovo.fritar();
			}
			System.out.println("Status do ovo: " + ovo.getStatus());
			
			System.out.println("\nDeseja fritar mais seu ovo?");
			System.out.println("1- Confirmar  2- Sair");
			menu = scanner.nextInt();
		}
		
		System.out.println("\nCozimento encerrado!\nSeu ovo ficou: " + ovo.getStatus());
	}
}
