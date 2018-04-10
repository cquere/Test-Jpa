package fr.jpa.banque;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// TODO: Auto-generated Javadoc
/**
 * The Class Adresse.
 */
@Embeddable
public class Adresse {

	/** The numero. */
	@Column(name="NUMERO_RUE", nullable= false)
	int numero;
	
	/** The rue. */
	@Column(name="RUE", length=100, nullable= false)
	String rue;
	
	/** The code postal. */
	@Column(name="CODE_POSTAL", nullable= false)
	int codePostal;
	
	/** The ville. */
	@Column(name="VILLE", length=50, nullable= false)
	String ville;

	/**
	 * Instantiates a new adresse.
	 */
	public Adresse() {
	}

	
	/**
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(int numero, String rue, int codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}


	/**
	 * Gets the numero.
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Sets the numero.
	 *
	 * @param numero the new numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Gets the rue.
	 *
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Sets the rue.
	 *
	 * @param rue the new rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Gets the code postal.
	 *
	 * @return the code postal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Sets the code postal.
	 *
	 * @param codePostal the new code postal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Gets the ville.
	 *
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Sets the ville.
	 *
	 * @param ville the new ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
