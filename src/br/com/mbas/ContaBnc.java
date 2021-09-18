package br.com.mbas;

public class ContaBnc implements Controlador{

	final static Double MENSAL_CC = 12.0;
	final static Double MENSAL_CP = 20.0;
	
	private Integer numConta;
	protected String tipoConta;
	private String nomeCliente;
	private Double saldoConta;
	private Boolean contaAtiva;
	
	public void status() {
		System.out.println("-------------------------------");
		System.out.println("Cliente: " + this.getNomeCliente());
		System.out.println("Tipo conta: " + this.getTipoConta());
		System.out.println("Saldo: " + this.getSaldoConta());
		System.out.println("-------------------------------");
	}
	
	//Getters and Setters	
	 public ContaBnc() {
		 this.setSaldoConta(0.0);
		 this.setContaAtiva(false);
	 }
	 public Integer getNumConta() {
		 return this.numConta;
	 }
	 public void setNumConta(Integer numConta) {
		 this.numConta = numConta;
	 }
	 public String getTipoConta() {
		 return this.tipoConta;
	 }
	 public void setTipoConta(String tpCnt) {
		 this.tipoConta = tpCnt;
	 }
	 public String getNomeCliente() {
		 return this.nomeCliente;
	 }
	 public void setNomeCliente(String nmCliente) {
		 this.nomeCliente = nmCliente;
	 }
	 public Double getSaldoConta() {
		 return this.saldoConta;
	 }
	 public void setSaldoConta(Double sldCnt) {
		 this.saldoConta = sldCnt;
	 }
	 public Boolean getContaAtiva() {
		 return this.contaAtiva;
	 }
	 public void setContaAtiva(Boolean cntAtiva) {
		 this.contaAtiva = cntAtiva;
	 }
	 
	//Void override
		@Override
		public void abrirConta(String tipo) {
			if (!this.getContaAtiva()) {
				this.setContaAtiva(true);
				if(tipo == "CC") {
					this.setSaldoConta(50.0);
					this.setTipoConta(tipo);
					System.out.println("Conta corrente aberta com sucesso!");
				} else if (tipo == "CP") {
					this.setSaldoConta(150.0);
					this.setTipoConta(tipo);
					System.out.println("Conta poupança aberta com sucesso!");
				} else {
					System.err.println("Tipo Inválido");
				}
			} else {
				System.err.println("Conta já ativa!");
			}
		}

		@Override
		public void fecharConta() {
			if(this.getContaAtiva()) {
				if(this.getSaldoConta()>0) {
					System.err.println("Acerte o débito antes de fechar a conta!");
				} else if (this.getSaldoConta()<0) {
					System.err.println("Saque todo o saldo antes de fechar a conta!");
				} else {
					System.out.println("Conta fechado com sucesso!");
				}
			} else {
				System.err.println("Conta já inativa!");
			}
		}

		@Override
		public void depositar(Double valor) {
			if(this.getContaAtiva()) {
				this.setSaldoConta(this.getSaldoConta()+valor);
				System.out.println("Deposito realizado com sucesso!");
			} else {
				System.err.println("Conta inativa!");
			}
		}

		@Override
		public void sacar(Double valor) {
			if(this.getContaAtiva()) {
				if(this.getSaldoConta()>=valor) {
					this.setSaldoConta(this.getSaldoConta()-valor);
					System.out.println("Saque realizado com sucesso!");
				} else {
					System.err.println("Saldo insuficiente!");
				}
			} else {
				System.err.println("Conta inátiva!");
			}
		}

		@Override
		public void pagarMensal() {
			if(this.getContaAtiva()) {
				if(this.getTipoConta() == "CC") {
					this.setSaldoConta(this.getSaldoConta() - MENSAL_CC);
				} else if(this.getTipoConta() == "CP") {
					this.setSaldoConta(this.getSaldoConta() - MENSAL_CP);
				}
			} else {
				System.err.println("Conta inátiva!");
			}
		}
}
