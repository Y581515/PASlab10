package dat100Lab7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class LeseFraFil {
	
	
	static String MAPPE_STR = System.getProperty("user.dir") + "/src/dat100Lab7/";

	  static public void main(String[] args) {

	  String filnavn;
	  int r=0;
	  do {
		  filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);
		  
		  try {
			 
		
			  File file = new File(MAPPE_STR + filnavn);
			  Scanner reader = new Scanner(file);
			  BufferedReader rreader = new BufferedReader(new FileReader(file));
		
			  int linenumber = 1;
		
			  // les innhold i filen linje for linje
			  String line;
	
//			  while (reader.hasNextLine()) {
//			  line = reader.nextLine();
//			  System.out.println(linenumber + " " + line);
//			  linenumber++;
//			  }
			  
			  while ((line = rreader.readLine())!=null) {
				  
				  System.out.println(linenumber + " " + line);
				  linenumber++;
				  }
		
			  reader.close();
			  rreader.close();
			  r=5;
		  }
		  catch (Exception e){
			  r++;
			if(r<5) {
				
			}
			else {
				 System.out.println("fillen finnes ikke");

				JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
			}
		  }
	  }while(r<5);
	  
	  
  

	  // JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
	  // ikke. \n" + e.getMessage());
	  }
	
	

}
