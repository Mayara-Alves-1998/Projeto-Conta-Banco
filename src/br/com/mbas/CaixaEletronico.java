package br.com.mbas;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		ContaBnc c1 = new ContaBnc();
		
		c1.abrirConta("CP");
		c1.setNomeCliente("Mayara Alves");
		c1.sacar(200.0);
		c1.status();
		
		ContaBnc c2 = new ContaBnc();
		
		c2.abrirConta("CC");
		c2.setNomeCliente("XPO");
		c2.sacar(20.0);
		c2.status();
		
		ContaBnc c3 = new ContaBnc();
		
		c3.abrirConta("CP");
		c3.setNomeCliente("Andrea Alves");
		c3.sacar(200.0);
		c3.status();
	}
}
