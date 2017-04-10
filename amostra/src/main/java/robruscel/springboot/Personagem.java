package robruscel.springboot;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Personagem implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHAR_ID")
	private Long personagemID;
	
	@Column(name = "NOME")
	private String Nome;
	
	@Column(name = "CLASSE")
	private String Classe;
	
	@Column(name = "RAÇA")
	private String Raça;
	
	@Column(name = "LEVEL")
	private int Level;
	
	@Column(name = "FORÇA")
	private int Força;
	
	@Column(name = "HABILIDADE")
	private int Habilidade;
	
	@Column(name = "RESISTÊNCIA")
	private int Resistência;
	
	@Column(name = "ARMADURA")
	private int Armadura;
	
	@Column(name = "PDF")
	private int PDF;
	
		
	public Long getPersonagemID() {
		return personagemID;
	}

	public void setPersonagemID(Long personagemID) {
		this.personagemID = personagemID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
	}

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	public int getForça() {
		return Força;
	}

	public void setForça(int força) {
		Força = força;
	}

	public int getHabilidade() {
		return Habilidade;
	}

	public void setHabilidade(int habilidade) {
		Habilidade = habilidade;
	}

	public int getResistência() {
		return Resistência;
	}

	public void setResistência(int resistência) {
		Resistência = resistência;
	}

	public int getArmadura() {
		return Armadura;
	}

	public void setArmadura(int armadura) {
		Armadura = armadura;
	}

	public int getPDF() {
		return PDF;
	}

	public void setPDF(int pDF) {
		PDF = pDF;
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

public Personagem(){
		
	}

	public Personagem(String Nome, String Classe, String Raça, 
			int Level, int Força, int Habilidade, int Resistência, int Armadura, int PDF){
			
		this.Nome = Nome;
		this.Classe = Classe;
		this.Raça = Raça;
		this.Level = Level;
		this.Força = Força;
		this.Habilidade = Habilidade;
		this.Resistência = Resistência;
		this.Armadura = Armadura;
		this.PDF = PDF;
	}
	
	@Override
	public String toString(){
		return "Personagem [Char_ID = " + personagemID + ", Nome = " + Nome + ", Classe = " + Classe +
				", Raça = " + Raça + ", Level = " + Level + ", Força = " + Força + ", Habilidade = " +
				Habilidade + ", Resistência = " + Resistência + ", Armadura = " + Armadura + ", "
						+ "PDF" + PDF +"]";
	}

		
}
