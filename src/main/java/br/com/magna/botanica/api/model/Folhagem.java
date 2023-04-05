package br.com.magna.botanica.api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "folhagens")
@Entity(name = "Folhagem")
public class Folhagem {
	@Id
	private Long id;
	private String descricao;
	@OneToOne(targetEntity = Classe.class)
	@JoinColumn(name = "classe_id")
	private Classe classeId;
	private Boolean ativo;

	public String getDescricao() {
		return descricao;
	}

	public Classe getClasseId() {
		return classeId;
	}

	public Boolean getAtivo() {
		return ativo;
	}
	public Long getId() {
		return id;
	}
}
