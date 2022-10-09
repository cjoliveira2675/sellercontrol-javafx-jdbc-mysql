package model.entities;

import java.io.Serializable;

public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String nome;
	
	public Departamento(Integer codigo, String nome) {
		//super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Departamento(){
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
}
