package br.com.magna.botanica.api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "filos")
@Entity(name = "Filo")
public  class Filo{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Boolean folhasVerdadeiras;
	private Boolean cauleVerdadeiro;
	private Boolean raizVerdadeiras;
	private Boolean frutos;
	private Boolean flores;
	private Boolean sementes;
	private Boolean ativo;


	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Boolean getFolhasVerdadeiras() {
		return folhasVerdadeiras;
	}

	public Boolean getCauleVerdadeiro() {
		return cauleVerdadeiro;
	}

	public Boolean getRaizVerdadeiras() {
		return raizVerdadeiras;
	}

	public Boolean getFrutos() {
		return frutos;
	}

	public Boolean getFlores() {
		return flores;
	}

	public Boolean getSementes() {
		return sementes;
	}

	public Boolean getAtivo() {
		return ativo;
	}
}

