package br.com.magna.botanica.api.model;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "plantas")
@Entity(name = "Planta")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
 public class Planta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
	private Long id;
    @JsonProperty("nome")
	protected String nome;
    @JsonProperty("cor")
	private String cor;
	@OneToOne(targetEntity = Filo.class)
	@JoinColumn(name = "filo_id")
    @JsonProperty("filo")
	private Filo filo;
	@OneToOne(targetEntity = Classe.class)
	@JoinColumn(name = "classe_id")
    @JsonProperty("classe")
	private Classe classe;
	@OneToOne(targetEntity = Ordem.class)
	@JoinColumn(name = "ordem_id")
    @JsonProperty("ordem")
	private Ordem ordem;
	@OneToOne(targetEntity = Raiz.class)
	@JoinColumn(name = "raiz_id")
    @JsonProperty("raiz")
	private Raiz raiz;
	@OneToOne(targetEntity = Caule.class)
	@JoinColumn(name = "caule_id")
    @JsonProperty("caule")
	private Caule caule;
	@OneToOne(targetEntity = Folhagem.class)
	@JoinColumn(name = "folhagem_id")
    @JsonProperty("folhagem")
	private Folhagem folhagem;
    @JsonProperty("ativo")
	private Boolean ativo;

    public void excluir() {
		this.ativo = false;
	}

	 public Boolean getAtivo() {
	 	return ativo;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Filo getFilo() {
		return filo;
	}

	public void setFilo(Filo filo) {
		this.filo = filo;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	public Raiz getRaiz() {
		return raiz;
	}

	public void setRaiz(Raiz raiz) {
		this.raiz = raiz;
	}

	public Caule getCaule() {
		return caule;
	}

	public void setCaule(Caule caule) {
		this.caule = caule;
	}

	public Folhagem getFolhagem() {
		return folhagem;
	}

	public void setFolhagem(Folhagem folhagem) {
		this.folhagem = folhagem;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}


}
