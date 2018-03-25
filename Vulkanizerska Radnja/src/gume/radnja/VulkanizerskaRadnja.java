package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * @author Milos Pecikoza
 * @version 1.0
 * Klasa koja sadrzi listu guma, sa metodama za dodavanje nove gume i pretrazivanje odredjene gume u listi
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista koja sadrzi objekte klase AutoGuma
	 */
	public LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda koja dodaje gumu u listu
	 * @param Ulazni parametar je guma koja treba da se doda
	 * @throws java.lang.RuntimeException kada se unese nedozvoljena vrijednost
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja pronalazi gume odredjenog proizvodjaca i vraca listu tih guma
	 * @param Ulazni parametar je String koji sadrzi marku i model proizvodjaca
	 * @return vraca listu koja sadrzi sve gume zadatog proizvodjaca
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
