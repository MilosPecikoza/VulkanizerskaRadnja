package gume;

public class AutoGuma {
	
	/**
	 * Atribut koji pokazuje marku i model
	 */
	private String markaModel = null;
	
	/**
	 * Atribut koji pokazuje precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Atribut koji pokazuje sirinu gume
	 */
	private int sirina = 0;
	
	/**
	 * Atribut koji pokazuje visinu gume
	 */
	private int visina = 0;

	
	/**
	 * Metoda vraca marku i model
	 * @return marka i model kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda postavlja marku i model na odgovarajucu vrijednost
	 * @param nova vrijednost za marku i model
	 * @throws java.lang.RuntimeException ako se unese nedozvoljena vrijednost
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda vraca precnik gume
	 * @return precnika kao int
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Metoda postavlja precnik na odgovarajucu vrijednost
	 * @param nova vrijednost precnika
	 * @throws java.land.RuntimeException ako se unese nedozvoljenja vrijednost
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda vraca sirinu gume
	 * @return sirinu kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda postavlja sirinu na odgovarajucu vrijednost
	 * @param nova vrijednost sirine
	 * @throws java.lang.RuntimeException ako se unese nedozvoljenja vrijednost
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Metoda vraca visinu gume
	 * @return visinu kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda postavlja visinu na odgovarajucu vrijednost
	 * @param nova vrijednost visine
	 * @throws java.lang.RuntimeException ako se unese nedozvoljenja vrijednost
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Metoda koja pretvara sve atribute u string i vraca ih
	 * @return svi atributi kao String
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	
	/**
	 * Metoda koja poredi 2 objekta klase AutoGuma 
	 * @return true ako su isti, false ako nisu isti
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
