package br.univel.classes;

import java.awt.List;

public class Entrega {

	public Entrega() {
		// TODO Auto-generated constructor stub
	}



	private String endereco;

	private List produto;


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List getProduto() {
		return produto;
	}

	public void setProduto(List produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Entrega [endereco=" + endereco + ", produto=" + produto + "]";
	}






}
