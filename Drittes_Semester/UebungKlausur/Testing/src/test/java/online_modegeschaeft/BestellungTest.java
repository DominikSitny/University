package online_modegeschaeft;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestellungTest {
	
	Bestellung b;
	
	@BeforeEach
	public void addPositionen() {
		b = new Bestellung(1, new Kunde("1;Meier;Justus;17"));
		b.hinzufuegenArtikel(new Artikel(1, "Nike Free", 8.99));
		b.hinzufuegenArtikel(new Artikel(3, "Adidas Jacke", 9.99));
	}
	
	@Test
	public void test1() {
		double betrag = 0;
		for(Artikel a : this.b.getArtikelpositionen()) {
			betrag += a.getPreis();		}
		b.setRabatt(10);
		assertThat(b.getGesamtbetrag()).isEqualTo(betrag - 10);
	}
	
	
}
