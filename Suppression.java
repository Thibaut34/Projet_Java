import java.io.File;
import java.io.IOException;
public class Suppression {
	//m�thode de suppression//
	public static void suppression(File f) throws IOException{
		//condition de suppression//
		//si le fichier est cr��, il peut �tre supprim�//
		if(f.createNewFile()) {
			f.delete();
			System.out.println("Le fichier est supprim�");
		}else {
			System.out.println("Le fichier n'existe pas");
		}
		
		
	}

}
