import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            // Ouvre le fichier
            File file = new File("test.txt");

            // Lit le fichier
            Scanner scanner = new Scanner(file);

            // Stocke le nombre total de mots
            int totalWords = 0;

            // Continue tant qu’il reste des lignes
            while (scanner.hasNextLine()) {

                // Lit une ligne
                String line = scanner.nextLine();

                // Sépare les mots avec les espaces
                String[] words = line.split(" ");

                // Ajoute les mots au total
                totalWords = totalWords + words.length;

            }

            // Affiche le résultat final
            System.out.println("Nombre total de mots : " + totalWords);

            // Ferme le Scanner
            scanner.close();

        } catch (FileNotFoundException e) {

            // Message si le fichier n’existe pas
            System.out.println("Fichier introuvable");

        }

    }

}