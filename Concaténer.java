import java.io.File;
import java.io.IOException;
public class Concaténer extends Copie {
	
	public static void concaténer(File f, File cf) throws IOException{
		copie(f, cf);
		int copie = 1;
		if(copie == 1) {
			System.out.println("Le fichier est concaténer");
		}else {
			System.out.println("Le fichier n'est pas concaténer");
		}
	}

}
