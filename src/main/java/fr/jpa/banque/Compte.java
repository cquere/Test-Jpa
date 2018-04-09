package fr.jpa.banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Compte.
 */


@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@Table(name= "compte")
public abstract class Compte {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The numero. */
	@Column(name="NUMERO", length=50, nullable= false)
	private String numero;

	/** The solde. */
	@Column(name="SOLDE", nullable= false)
	private Double solde;
	
	/** The clients. */
	@ManyToMany
	@JoinTable(name="client_compte",
	joinColumns=@JoinColumn(name="ID_COM", referencedColumnName="ID"),
	inverseJoinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID")
	)
	private Set<Client> clients;
	
	/** The operations. */
	@OneToMany(mappedBy= "compte")
	private Set<Operation> operations;

	/**
	 * Instantiates a new compte.
	 */
	public Compte() {
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
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Gets the solde.
	 *
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * Sets the solde.
	 *
	 * @param solde the new solde
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
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

	/**
	 * Gets the operations.
	 *
	 * @return the operations
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/**
	 * Sets the operations.
	 *
	 * @param operations the new operations
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}
	
	
	

}
