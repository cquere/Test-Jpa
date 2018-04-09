package fr.jpa.banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Banque.
 */
@Entity
@Table(name = "banque")
public class Banque {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** The nom. */
	@Column(name="NOM", length=50, nullable= false)
	private String nom;
	
	/** The clients. */
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;

	/**
	 * Instantiates a new banque.
	 */
	public Banque() {
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
	 * Gets the clients.
	 *
	 * @return the clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * Sets the clients.
	 *
	 * @param clients the new clients
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	
	

}
