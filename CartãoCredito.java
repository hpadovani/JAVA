import java.util.Scanner;

public class CartaoCredito {
	String nome;
	int cartao;
	String validade;
	int saldo;
	
	public CartaoCredito (String a, int b, String c, int d){
		nome = a;
		cartao = b;
		validade = c;
		saldo = d;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int senha, menu, menu1;
		
		CartaoCredito cc1 = new CartaoCredito("José Fernandes", 20189911, "10/2016", 6000);
		CartaoCredito cc2 = new CartaoCredito("Henrique Padovani", 20222541, "12/2014", 2200);
		CartaoCredito cc3 = new CartaoCredito("Andreia Bazilio", 36451409, "09/2013", 5500);
		CartaoCredito cc4 = new CartaoCredito("Victor Hayabusa", 20256391, "10/2013", 750);
		CartaoCredito cc5 = new CartaoCredito("Jeff Gordon", 20237473, "03/2013", 150);
		
		System.out.print("Digite a senha: ");
		senha = in.nextInt();		
		
		while(senha != 1234 && senha != 4321 && senha != 5673 && senha != 1258 && senha != 0000){
			System.out.print("Digite a senha: ");
			senha = in.nextInt();
		}
		
		if(senha == 1234){
			do{
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(             BANCO DO BRASIL             )");
				System.out.println("(_________________________________________)");
				System.out.println("(                 BEM VINDO               )");
				System.out.println("(                                         )");
				System.out.println("( { 1 } Nome do titular da conta.         )");
				System.out.println("( { 2 } Numero do Cartao.                 )");
				System.out.println("( { 3 } Validade da conta.                )");
				System.out.println("( { 4 } Saldo.                            )");
				System.out.println("(_________________________________________)");
				System.out.println("");
				System.out.println("DIGITE A OPCAO DESEJADA");
				menu = in.nextInt();
				
				if(menu == 1){
					System.out.println("O titular da conta eh "+ cc1.nome);
				}
				if(menu == 2){
					System.out.println("O numero do cartao eh "+ cc1.cartao);
				}
				if(menu == 3){
					System.out.println("A validade do seu cartao eh ate "+ cc1.validade);
				}
				if(menu == 4){
					System.out.println("O seu saldo eh de R$ "+ cc1.saldo +",00");
				}					
					
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(               OPCOES:	       	          )");
				System.out.println("( { 1 } Escolher outra operação.          )");
				System.out.println("( { 2 } Sair.                             )");
				System.out.println("(_________________________________________)");	
				
				menu1 = in.nextInt();
				if(menu1 == 2){
					System.out.println("SISTEMA ENCERRADO");
				}
				}while(menu1 == 1);
			}
		}
		if(senha == 4321){
			do{
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(             BANCO DO BRASIL             )");
				System.out.println("(_________________________________________)");
				System.out.println("(                 BEM VINDO               )");
				System.out.println("(                                         )");
				System.out.println("( { 1 } Nome do titular da conta.         )");
				System.out.println("( { 2 } Numero do Cartao.                 )");
				System.out.println("( { 3 } Validade da conta.                )");
				System.out.println("( { 4 } Saldo.                            )");
				System.out.println("(_________________________________________)");
				System.out.println("");
				System.out.println("DIGITE A OPCAO DESEJADA");
				menu = in.nextInt();
				
				if(menu == 1){
					System.out.println("O titular da conta eh "+ cc2.nome);
				}
				if(menu == 2){
					System.out.println("O numero do cartao eh "+ cc2.cartao);
				}
				if(menu == 3){
					System.out.println("A validade do seu cartao eh ate "+ cc2.validade);
				}
				if(menu == 4){
					System.out.println("O seu saldo eh de R$ "+ cc2.saldo +",00");
				}				
					
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(               OPCOES:	       	          )");
				System.out.println("( { 1 } Escolher outra operação.          )");
				System.out.println("( { 2 } Sair.                             )");
				System.out.println("(_________________________________________)");	
				
				menu1 = in.nextInt();
				if(menu1 == 2){
					System.out.println("SISTEMA ENCERRADO");
				}
				}while(menu1 == 1);
			}
		}
		if(senha == 5673){
			do{
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(             BANCO DO BRASIL             )");
				System.out.println("(_________________________________________)");
				System.out.println("(                 BEM VINDO               )");
				System.out.println("(                                         )");
				System.out.println("( { 1 } Nome do titular da conta.         )");
				System.out.println("( { 2 } Numero do Cartao.                 )");
				System.out.println("( { 3 } Validade da conta.                )");
				System.out.println("( { 4 } Saldo.                            )");
				System.out.println("(_________________________________________)");
				System.out.println("");
				System.out.println("DIGITE A OPCAO DESEJADA");
				menu = in.nextInt();
				
				if(menu == 1){
					System.out.println("O titular da conta eh "+ cc3.nome);
				}
				if(menu == 2){
					System.out.println("O numero do cartao eh "+ cc3.cartao);
				}
				if(menu == 3){
					System.out.println("A validade do seu cartao eh ate "+ cc3.validade);
				}
				if(menu == 4){
					System.out.println("O seu saldo eh de R$ "+ cc3.saldo +",00");
				}					
					
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(               OPCOES:	       	          )");
				System.out.println("( { 1 } Escolher outra operação.          )");
				System.out.println("( { 2 } Sair.                             )");
				System.out.println("(_________________________________________)");	
				
				menu1 = in.nextInt();
				if(menu1 == 2){
					System.out.println("SISTEMA ENCERRADO");
				}
				}while(menu1 == 1);
			}
		}
		if(senha == 1258){
			do{
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(             BANCO DO BRASIL             )");
				System.out.println("(_________________________________________)");
				System.out.println("(                 BEM VINDO               )");
				System.out.println("(                                         )");
				System.out.println("( { 1 } Nome do titular da conta.         )");
				System.out.println("( { 2 } Numero do Cartao.                 )");
				System.out.println("( { 3 } Validade da conta.                )");
				System.out.println("( { 4 } Saldo.                            )");
				System.out.println("(_________________________________________)");
				System.out.println("");
				System.out.println("DIGITE A OPCAO DESEJADA");
				menu = in.nextInt();
				
				if(menu == 1){
					System.out.println("O titular da conta eh "+ cc4.nome);
				}
				if(menu == 2){
					System.out.println("O numero do cartao eh "+ cc4.cartao);
				}
				if(menu == 3){
					System.out.println("A validade do seu cartao eh ate "+ cc4.validade);
				}
				if(menu == 4){
					System.out.println("O seu saldo eh de R$ "+ cc4.saldo +",00");
				}				
					
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(               OPCOES:	       	          )");
				System.out.println("( { 1 } Escolher outra operação.          )");
				System.out.println("( { 2 } Sair.                             )");
				System.out.println("(_________________________________________)");	
				
				menu1 = in.nextInt();
				if(menu1 == 2){
					System.out.println("SISTEMA ENCERRADO");
				}
				}while(menu1 == 1);
			}
		}
		if(senha == 0000){
			do{
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(             BANCO DO JOSE               )");
				System.out.println("(_________________________________________)");
				System.out.println("(                 BEM VINDO               )");
				System.out.println("(                                         )");
				System.out.println("( { 1 } Nome do titular da conta.         )");
				System.out.println("( { 2 } Numero do Cartao.                 )");
				System.out.println("( { 3 } Validade da conta.                )");
				System.out.println("( { 4 } Saldo.                            )");
				System.out.println("(_________________________________________)");
				System.out.println("");
				System.out.println("DIGITE A OPCAO DESEJADA");
				menu = in.nextInt();
				
				if(menu == 1){
					System.out.println("O titular da conta eh "+ cc4.nome);
				}
				if(menu == 2){
					System.out.println("O numero do cartao eh "+ cc4.cartao);
				}
				if(menu == 3){
					System.out.println("A validade do seu cartao eh ate "+ cc4.validade);
				}
				if(menu == 4){
					System.out.println("O seu saldo eh de R$ "+ cc4.saldo +",00");
				}				
					
				System.out.println(" _________________________________________");
				System.out.println("(                                         )");
				System.out.println("(               OPCOES:	       	          )");
				System.out.println("( { 1 } Escolher outra operação.          )");
				System.out.println("( { 2 } Sair.                             )");
				System.out.println("(_________________________________________)");	
				
				menu1 = in.nextInt();
				if(menu1 == 2){
					System.out.println("SISTEMA ENCERRADO");
				}
				}while(menu1 == 1);
			}
		}
}
