package fr.jpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


// TODO: Auto-generated Javadoc
/**
 * The Class Livre.
 */
@Entity
@Table(name="livre")
public class Livre {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/** The titre. */
	@Column(name="TITRE", length=255, nullable= false)
	private String titre;
	
	/** The auteur. */
	@Column(name="AUTEUR", length=50, nullable= false)
	private String auteur;
	
	
	/** The emprunts. */
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns=@JoinColumn(name="ID_LIV", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
	)
	private Set<Emprunt> emprunts;
	
	/**
	 * Instantiates a new livre.
	 */
	public Livre() {
	
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * Gets the titre.
	 *
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}
	
	/**
	 * Sets the titre.
	 *
	 * @param titre the new titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	/**
	 * Gets the auteur.
	 *
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}
	
	/**
	 * Sets the auteur.
	 *
	 * @param auteur the new auteur
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * Gets the emprunts.
	 *
	 * @return the emprunts
	 */
	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	/**
	 * Sets the emprunts.
	 *
	 * @param emprunts the new emprunts
	 */
	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
}
