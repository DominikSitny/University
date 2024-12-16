package online_modegeschaeft;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KundeTest {

	Kunde k;
	Artikel a;
	
	@BeforeEach
	public void setKunde() {
		k = new Kunde("1;Meier;Justus;17");
		a = new Artikel(0, "Tshirt", 49.99);
	}
	
	@Test
	public void testWarenkorbStillEmpty() {
		
		k.loescheArtikelAusWarenkorb(a);
		assertThat(k.getWarenkorb().size()).isEqualTo(0);
		
	}
	@Test
	public void testArtikelEntfernen() {
		
		k.hinzufuegenArtikelInWarenkorb(a);
		
		assertThat(k.getWarenkorb().size()).isEqualTo(1);
		
		k.loescheArtikelAusWarenkorb(a);
		
		assertThat(k.getWarenkorb().size()).isEqualTo(0);

	}
	
	@Test
	public void testCorrectRemovingOfArticle() {
		Artikel a2 = new Artikel(1, "Hose", 89.99);
		k.hinzufuegenArtikelInWarenkorb(a);
		k.hinzufuegenArtikelInWarenkorb(a2);
		
		k.loescheArtikelAusWarenkorb(a2);
		
		assertThat(k.getWarenkorb().get(0)).isEqualTo(a);
		
	}
	
}
