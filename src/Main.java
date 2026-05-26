import java.io.File;
import java.io.FileNotFoundException;

/**
 * Classe principale du programme de comptage de mots.
 * Cette classe lance le programme, indique le fichier à lire,
 * utilise la classe WordCounter pour compter les mots, puis affiche
 * le resultat à l'utilisateur.
 */
public class Main {

    /**
     * Chemin du fichier texte à lire.
     */
    private static final String chemin_file = "Textfile.txt";

    /**
     * Point d'entree du programme.
     *
     * @param args arguments de la ligne de commande, non utilisés ici
     */
    public static void main(String[] args) {
        WordCounter compteur = new WordCounter();

        System.out.println("Programme de comptage de mots");

        try {
            File fichier = new File(chemin_file);
            int totalMots = compteur.compterMots(fichier);

            System.out.println("Nombre total de mots : " + totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : le fichier est introuvable.");
            System.out.println("Verifiez que le fichier existe dans le dossier data.");
        } catch (Exception e) {
            System.out.println("Une erreur est arrivee : " + e.getMessage());
        }
    }
}