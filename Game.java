package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int nbr = 10 + random.nextInt(91);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Entrer un nombre entre 10 et 100 : ");
            int userNbr = scanner.nextInt();
            if (userNbr == nbr) {
                System.out.println("Vous avez gagné !");
                return;
            } else if(userNbr > nbr) {
                System.out.println("Essaie encore !, votre nombre est superieur au nombre généré il vous reste "+(10-i)+" Essaie");
            }else if(userNbr < nbr) {
                System.out.println("Essaie encore !, votre nombre est inferieur au nombre généré il vous reste "+(10-i)+" Essaie");
            }else {
            	System.out.println("Vous avez perdue!");
            }
        }

        System.out.println("Désolé, vous avez épuisé vos essais. Le nombre était : " + nbr);
    }
}
