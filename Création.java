import java.io.File;
import java.io.IOException;
public class Cr�ation {
	//m�thode de cr�ation//
	public static void cr�ation(File f1, File f2) throws IOException{
		//condition de cr�ation et de correspondance de 2 fichiers//
		if(f1.createNewFile() && f1 != f2) {
			//affichage de r�sultats//
			System.out.println("Le fichier est cr��");
		}else {
			System.out.println("Le fichier est d�j� cr��");
		}
	}

}
