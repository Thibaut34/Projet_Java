import java.io.File;
import java.io.IOException;
public class ConcatÚner extends Copie {
	
	public static void concatÚner(File f, File cf) throws IOException{
		copie(f, cf);
		int copie = 1;
		if(copie == 1) {
			System.out.println("Le fichier est concatÚner");
		}else {
			System.out.println("Le fichier n'est pas concatÚner");
		}
	}

}
