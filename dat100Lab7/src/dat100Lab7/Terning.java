package dat100Lab7;

import java.util.Random;

public class Terning {
	public static void main(String[] args) {
		int oyne=100;
		Random terning = new Random();
		int []tab=new int [oyne];
		

		for (int j = 0; j < oyne/20; j++) {
			int i = 0;
			int tabIndekst=0;
			while (i < oyne/5) {
				int n = terning.nextInt(7);
				if (n > 0) {
					System.out.print(n + "\t");
					tab[tabIndekst]=n;
					tabIndekst++;
					i++;
				}
			}System.out.println();
		}
		
		

	}

}
