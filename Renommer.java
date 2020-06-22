import java.io.File;
import java.io.IOException;

public class Renommer extends Fichier {
	//méthode pour renommer//
	public static void Renomme(File oldfile, File newfile) throws IOException{
		//condition pour renommer//
		if(oldfile.renameTo(newfile)) {
			System.out.println("Fichier renommé");
			
		}else {
			System.out.println("Fichier non renommé");
		}
	}

}
