import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Classe qui compte les mots dans un fichier texte.
 */
public class WordCounter {

    /**
     * Lit le fichier ligne par ligne et additionne les mots trouvés.
     *
     * @param fichier fichier à lire
     * @return nombre total de mots dans le fichier
     * @throws FileNotFoundException si le fichier est introuvable
     */
    public int compterMots(File fichier) throws FileNotFoundException {
        int totalMots = 0;

        try (Scanner lecteur = new Scanner(fichier)) {
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                totalMots += compterMotsDansLigne(ligne);
            }
        }

        return totalMots;
    }

    /**
     * Compte les mots dans une ligne.
     *
     * @param ligne ligne à analyser
     * @return nombre de mots dans la ligne
     */
    public int compterMotsDansLigne(String ligne) {
        String ligneNettoyee = ligne.trim();

        if (ligneNettoyee.isEmpty()) {
            return 0;
        }

        String[] mots = ligneNettoyee.split(" +");
        return mots.length;
    }
}