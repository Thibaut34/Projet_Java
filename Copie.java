import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class Copie {
	//méthode de copie//
	public static void copie(File source, File dest) throws IOException {
		//initialisation de variable//
		InputStream inStream = null;
		OutputStream outStream = null;
		
			//conversion du fichier source en bits, 
		//le flux de bits est reconverti dans le fichier destination
			inStream = new FileInputStream(source);
			outStream = new FileOutputStream(dest);
			byte[]buffer = new byte[1024];
			int length;
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			//la copie est effectuée//
			System.out.println("Copie effectuée");
			inStream.close();
			outStream.close();
			
	}
}