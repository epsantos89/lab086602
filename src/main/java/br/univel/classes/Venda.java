package br.univel.classes;

import java.awt.List;
import java.io.Serializable;

public class Venda implements Serializable{


	public Venda() {
		// TODO Auto-generated constructor stub
	}


	private String cliente;
	private List produto;




	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public List getProduto() {
		return produto;
	}

	public void setProduto(List produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", produto=" + produto + "]";
	}





}
