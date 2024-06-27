package com.projet;

import java.util.Scanner;

public class Robot {
    private int x;
    private int y;
    private String direction;

    // Constructeur
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = "nord";
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void avancer() {
        switch (direction) {
            case "nord":
                y += 1;
                break;
            case "sud":
                y -= 1;
                break;
            case "est":
                x += 1;
                break;
            case "ouest":
                x -= 1;
                break;
            default:
                System.out.println("Direction invalide");
                break;
        }
    }
    public void reculer(){
        switch (direction){
            case "nord":
                y-=1;
                break;
            case "sud":
                y+=1;
                break;
            case "est":
                x-=1;
                break;
            case "ouest":
                x+=1;
                break;
            default:
                System.out.println("Direction invalide");
                break;
        }
    }



    public void tournerAGauche() {
        switch (direction) {
            case "nord":
                direction = "ouest";
                break;
            case "sud":
                direction = "est";
                break;
            case "est":
                direction = "nord";
                break;
            case "ouest":
                direction = "sud";
                break;
            default:
                System.out.println("Direction invalide");
                break;
        }
    }


    public void tournerADroite() {
        switch (direction) {
            case "nord":
                direction = "est";
                break;
            case "sud":
                direction = "ouest";
                break;
            case "est":
                direction = "sud";
                break;
            case "ouest":
                direction = "nord";
                break;
            default:
                System.out.println("Direction invalide");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Robot robot = new Robot();

        while (true) {
            // Mampiseho ny direction actuelle sy ny position
            System.out.println("Position actuelle: (" + robot.getX() + ", " + robot.getY() + "), Direction: " + robot.getDirection());

            // Menu
            
            System.out.println("|Que voulez-vous faire?|");
            System.out.println("|1. Avancer            |");
            System.out.println("|2. Reculer            |");
            System.out.println("|3. Tourner à gauche   |");
            System.out.println("|4. Tourner à droite   |");
            System.out.println("|5. Quitter            |");
            System.out.println("Entrer votre choix :");


            int choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    robot.avancer();
                    break;
                case 2:
                    robot.reculer();
                    break;
                case 3:
                    robot.tournerAGauche();
                    break;
                case 4:
                    robot.tournerADroite();
                    break;
                case 5:
                    System.out.println("Vous avez quitter le programme");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }
}
