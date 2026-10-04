package model;

import java.util.Date;

public class Emprestimo {
	public int situacao;
	public Date dataDeEmprestimo;
	public Date dataPrevistaDeDevolucao;
	public Date dataDeEntregaReal;
	public Usuario usuario;
	public Exemplar exemplar;
	
	public String toString() {
		return "Data de emprestimo: "+ dataDeEmprestimo+ " Data prevista de devolução: "+dataPrevistaDeDevolucao +
				" Data de entrega: "+ dataDeEntregaReal;
	}

	public void setDataDeEmprestimo(Date date) {
		this.dataDeEmprestimo = date;
	}
	public void setDataDeEntregaReal(Date date) {
		this.dataDeEntregaReal = date;
	}

	public void setDataPrevistaDeDevolucao(Date date) {
		this.dataPrevistaDeDevolucao = date;
		
	}
}
