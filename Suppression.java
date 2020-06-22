import java.io.File;
import java.io.IOException;
public class Suppression {
	//méthode de suppression//
	public static void suppression(File f) throws IOException{
		//condition de suppression//
		//si le fichier est créé, il peut être supprimé//
		if(f.createNewFile()) {
			f.delete();
			System.out.println("Le fichier est supprimé");
		}else {
			System.out.println("Le fichier n'existe pas");
		}
		
		
	}

}
