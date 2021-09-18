package br.com.mbas;

public interface Controlador {
	
	public abstract void abrirConta(String tipo);
	public abstract void fecharConta();
	public abstract void depositar(Double valor);
	public abstract void sacar(Double valor);
	public abstract void pagarMensal();

}
