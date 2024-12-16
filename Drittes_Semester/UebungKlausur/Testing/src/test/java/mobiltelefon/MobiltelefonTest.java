package mobiltelefon;

public class MobiltelefonTest {

	private Mobiltelefon mb;
	
	public MobiltelefonTest() {
		this.mb = new Mobiltelefon("Dominik Sitny", "Apple", "schwarz");
	}
	
	public void doTestcase(int nr) {
		switch(nr) {
			case 1: tf1();
					break;
			case 2: tf2();
					break;
			case 3: tf3();
					break;
			default:	System.err.println("Diesen Testfall gibt es nicht.");
		}
		
	}
	
	private void tf1() {
		System.out.println("10 mal das Telefon eischalten");
		for(int i = 0; i<10;i++) {
			this.mb.einschalten();
		}
	}
	
	private void tf2() {
		System.out.println("10 mal das Telefon ausschalten");
		for(int i = 0; i<10;i++) {
			this.mb.ausschalten();
		}
	}
	
	private void tf3() {
		System.out.println("15 mal spielen");
		for(int i=0;i<15;i++) {
			this.mb.spielen();
		}
	}
}

