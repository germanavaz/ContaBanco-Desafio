package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("Digite o número da sua conta:");
		usuario.numeroConta = entrada.nextInt();
		
		System.out.println("Digite o número da sua agência:");
		usuario.agencia = entrada.nextInt();
		
		System.out.println("Digite seu nome:");
		usuario.nome = entrada.next();
		
		System.out.println("Digite o valor para depósito:");
		usuario.saldo = entrada.nextDouble();
		
		System.out.println("Olá " + usuario.nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ usuario.agencia + ", conta " + usuario.numeroConta + " e seu saldo de R$" + usuario.saldo +
				" já está disponível para saque.");
		
		
		
		entrada.close();
	}

}
