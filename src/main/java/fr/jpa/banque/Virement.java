package fr.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Virement.
 */
@Entity
@Table(name= "virement")
public class Virement extends Operation {

	/** The beneficiaire. */
	@Column(name = "BENEFICIAIRE", length = 50,nullable = false)
	private String beneficiaire;

	/**
	 * Instantiates a new virement.
	 */
	public Virement() {
	}

	/**
	 * Gets the beneficiaire.
	 *
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Sets the beneficiaire.
	 *
	 * @param beneficiaire the new beneficiaire
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	
	

}
