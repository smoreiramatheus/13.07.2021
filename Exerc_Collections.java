package Familia28_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		System.out.println("\n\t\tOl� seja bem vinde a MATHEW STORY!");
		
		do {
			
			System.out.println("\n\t\t[1] Insira os produtos estocados\n"+ "\t\t[2] Baixar produtos do estoque \n\t\t[3] Atualize seus produtos\n \t\t[4] Apresentar estoque dispon�vel ");
			System.out.println("\n\t\t---------------------------------");
			System.out.println("\n\t\t\tDigite sua op��o: ");
			System.out.println("\n\t\t---------------------------------");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1: 
				leia.nextLine();
				System.out.println("\nInforme o produto para alimentar o estoque: ");
				String produto = leia.nextLine(); 
				estoque.add(produto);  
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto que ser� removido do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)) 
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto n�o cadastrado no estoque!");
				}
				System.out.println(estoque); 
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto a ser atualizado: ");
				String verifica = leia.nextLine();
				System.out.println("\nInforme o produto a ser substitu�do "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existente!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos do estoque s�o: "); 
				System.out.println(estoque);
				break;
				
				default:
					System.out.println("\nEncerramos por aqui, agradecemos sua prefer�ncia...!");
				
			}
		}
		while(op!=0);

	}

}