import java.io.*;
public class Fichier {
	//création de fichier//
	public static void création(File f1, File f2) throws IOException{
		if(f1.createNewFile() && f1 != f2) {
			System.out.println("Le fichier est créé");
		}else {
			System.out.println("Le fichier est déjà créé");
		}
	}
	//recherche de mots//
	public static void présence(File f) throws IOException {
		
		
		String[] tab;
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String recherche = "test";
		int compteur = 0;
		String str;
		while((str = br.readLine()) != null) {
			tab = str.split("");
			for (String mot : tab) {
				if(mot.equals(recherche)) {
					compteur++;
				}
			}
		}
			if(compteur!=0) {
				System.out.println("Le mot est présent" + compteur + "fois.");
				
			}else {
				System.out.println("Le mot n'est pas présent.");
			}
			fr.close();
			br.close();
	}
	//copie//
	public static void copie(File source, File dest) throws IOException {
		InputStream inStream = null;
		OutputStream outStream = null;
		
			
			inStream = new FileInputStream(source);
			outStream = new FileOutputStream(dest);
			byte[]buffer = new byte[1024];
			int length;
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			System.out.println("Copie effectuée");
			inStream.close();
			outStream.close();
			
	}
	//changement de nom//
	public static void Renomme(File oldfile, File newfile) throws IOException{
		if(oldfile.renameTo(newfile)) {
			System.out.println("Fichier renommé");
			
		}else {
			System.out.println("Fichier non renommé");
		}
	}
	//suppression//
	public static void suppression(File f) throws IOException{
		if(f.createNewFile()) {
			f.delete();
			System.out.println("Le fichier est supprimé");
		}else {
			System.out.println("Le fichier n'existe pas");
		}
		
		
	}
	//fichier concaténé//
	public static void concaténer(File f, File cf) throws IOException{
		copie(f, cf);
		int copie = 1;
		if(copie == 1) {
			System.out.println("Le fichier est concaténer");
		}else {
			System.out.println("Le fichier n'est pas concaténer");
		}
	}
	//méthode de test//
	public static void main(String args[]) throws IOException{
		File f1 = new File("Fichier_de_test.txt");
		présence(f1);
		File f2 = f1;
		création(f1,f2);
		File fichier_de_reception = new File("Fichier_réceptif.txt");
		copie(f1,fichier_de_reception);
		concaténer(f1, fichier_de_reception);
		suppression(f1);
		suppression(fichier_de_reception);
	}

}
