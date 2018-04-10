package fr.jpa.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class AssuranceVie.
 */
@Entity
@Table(name= "assurance_vie")
public class AssuranceVie extends Compte {

	/** The date fin. */
	@Column(name="DATE_FIN", nullable= false)
	private LocalDate dateFin;
	
	/** The taux. */
	@Column(name="TAUX", nullable= false)
	private Double taux;

	/**
	 * Instantiates a new assurance vie.
	 */
	public AssuranceVie() {
	}

	
	/**
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(LocalDate dateFin, Double taux, String numero, Double solde) {
		super(numero, solde);
		this.dateFin = dateFin;
		this.taux = taux;
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
	 * Gets the taux.
	 *
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * Sets the taux.
	 *
	 * @param taux the new taux
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	
	
	
	
}
