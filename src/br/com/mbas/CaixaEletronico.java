package br.com.mbas;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		ContaBnc c1 = new ContaBnc();
		
		c1.abrirConta("CP");
		c1.setNomeCliente("Mayara Alves");
		c1.status();
		
		ContaBnc c2 = new ContaBnc();
		
		c2.abrirConta("CC");
		c2.setNomeCliente("XPO");
		c2.status();
	}
}
