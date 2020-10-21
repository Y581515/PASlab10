package dat100Lab7;

import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;
	private Random random=new Random();

	public Terning() {
		this.oyne=0;
	}

	public int getOyne() {

		return oyne;
	}

	public void trill() {
		oyne=random.nextInt(6)+1;
	}
}