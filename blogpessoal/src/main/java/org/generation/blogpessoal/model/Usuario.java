package org.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank (message = "O nome é obrigatório")
	@Size(min = 3, max = 200, message = "o nome deve conter entre 3 e 200 caracteres ")
	private String nome;
	
	@NotBlank (message = "O usuário é obrigatório")
	@Size(min = 1, max = 20, message = "O usuário deve conter  de 1 a 20 caracteres")
	private String usuario;
	
	@NotBlank (message = "A senha é obrigatória")
	@Size(min = 8, max = 25, message = "A senha deve conter  de 8 a 25 caracteres")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
