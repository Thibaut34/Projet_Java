import java.io.File;
import java.io.IOException;
public class Concat�ner extends Copie {
	
	public static void concat�ner(File f, File cf) throws IOException{
		copie(f, cf);
		int copie = 1;
		if(copie == 1) {
			System.out.println("Le fichier est concat�ner");
		}else {
			System.out.println("Le fichier n'est pas concat�ner");
		}
	}

}
