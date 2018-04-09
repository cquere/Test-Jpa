package fr.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class LivretA.
 */
@Entity
@Table(name= "livret_a")
public class LivretA extends Compte {

	/** The taux. */
	@Column(name="TAUX", nullable= false)
	private Double taux;

	/**
	 * Instantiates a new livret A.
	 */
	public LivretA() {
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
