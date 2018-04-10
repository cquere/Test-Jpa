package fr.jpa.banque;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Operation.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@Table(name="operation")
public class Operation {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/** The date. */
	@Column(name="DATE", nullable= false)
	private LocalDate date;
	
	/** The montant. */
	@Column(name="MONTANT", nullable= false)
	private Double montant;
	
	/** The motif. */
	@Column(name="MOTIF", length=150)
	private String motif;
	
	/** The compte. */
	@ManyToOne
	@JoinColumn(name="COMPTE_ID")
	private Compte compte;

	/**
	 * Instantiates a new operation.
	 */
	public Operation() {

	}

	/**
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 */
	public Operation(LocalDate date, Double montant, String motif, Compte compte) {
		this.date = date;
		this.montant = montant;
		this.motif = motif;
		this.compte = compte;
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
	 * Gets the date.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Gets the montant.
	 *
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * Sets the montant.
	 *
	 * @param montant the new montant
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/**
	 * Gets the motif.
	 *
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Sets the motif.
	 *
	 * @param motif the new motif
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Gets the compte.
	 *
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Sets the compte.
	 *
	 * @param compte the new compte
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	
	
}
