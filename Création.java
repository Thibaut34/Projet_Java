import java.io.File;
import java.io.IOException;
public class Création {
	//méthode de création//
	public static void création(File f1, File f2) throws IOException{
		//condition de création et de correspondance de 2 fichiers//
		if(f1.createNewFile() && f1 != f2) {
			//affichage de résultats//
			System.out.println("Le fichier est créé");
		}else {
			System.out.println("Le fichier est déjà créé");
		}
	}

}
