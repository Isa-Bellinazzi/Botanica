package br.com.magna.botanica.api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "caules")
@Entity(name = "Caule")

public class Caule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	@OneToOne(targetEntity = Classe.class)
	@JoinColumn(name = "classe_id")
	private Classe classeId;
	private Boolean ativo;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Classe getClasseId() {
		return classeId;
	}

	public Boolean getAtivo() {
		return ativo;
	}


}
