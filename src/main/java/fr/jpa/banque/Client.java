package fr.jpa.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Client.
 */
@Entity
@Table(name="client")
@Cacheable
public class Client {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	/** The nom. */
	@Column(name="NOM", length=50, nullable= false)
	private String nom;
	
	/** The prenom. */
	@Column(name="PRENOM", length=50, nullable= false)
	private String prenom;
	
	/** The date naissance. */
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	/** The adresse. */
	@Embedded
	private Adresse adresse;
	
	/** The banque. */
	@ManyToOne
	@JoinColumn(name="BANQUE_ID")
	private Banque banque;
	
	/** The comptes. */
	@ManyToMany
	@JoinTable(name="client_compte", 
	joinColumns=@JoinColumn(name="ID_CLI", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID")
	)
	private Set<Compte> comptes;

	/**
	 * Instantiates a new client.
	 */
	public Client() {
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param banque
	 * @param comptes
	 */
	public Client(String nom, String prenom, LocalDate dateNaissance, Adresse adresse, Banque banque) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.banque = banque;
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
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom.
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Gets the prenom.
	 *
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Sets the prenom.
	 *
	 * @param prenom the new prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Gets the date naissance.
	 *
	 * @return the date naissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Sets the date naissance.
	 *
	 * @param dateNaissance the new date naissance
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Gets the banque.
	 *
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Sets the banque.
	 *
	 * @param banque the new banque
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Gets the comptes.
	 *
	 * @return the comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Sets the comptes.
	 *
	 * @param comptes the new comptes
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
	
	
	
}
