package fr.jpa.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Emprunt.
 */
@Entity
@Table(name="emprunt")
public class Emprunt {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/** The date debut. */
	@Column(name="DATE_DEBUT", nullable= false)
	private LocalDate dateDebut;
	
	/** The date fin. */
	@Column(name="DATE_FIN")
	private LocalDate dateFin;
	
	/** The delai. */
	@Column(name="DELAI")
	private Integer delai;
	
	/** The client. */
	@ManyToOne
	@JoinColumn(name="ID_CLIENT", nullable= false)
	private Client client;
	
	/** The livres. */
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns=@JoinColumn(name="ID_EMP", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")
	)
	private Set<Livre> livres;
	
	/**
	 * Instantiates a new emprunt.
	 */
	public Emprunt() {

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
	 * Gets the date debut.
	 *
	 * @return the date debut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Sets the date debut.
	 *
	 * @param dateDebut the new date debut
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Gets the date fin.
	 *
	 * @return the date fin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Sets the date fin.
	 *
	 * @param dateFin the new date fin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Gets the delai.
	 *
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * Sets the delai.
	 *
	 * @param delai the new delai
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}


	/**
	 * Gets the livres.
	 *
	 * @return the livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}

	/**
	 * Sets the livres.
	 *
	 * @param livres the new livres
	 */
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

}
