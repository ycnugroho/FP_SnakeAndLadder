/**
 * -----------------------------------------------------
 * ES234211 - Programming Fundamental
 * Genap - 2023/2024
 * Group Capstone Project: Snake and Ladder Game
 * -----------------------------------------------------
 * Class    : C
 * Group    : 9
 * Members  :
 * 1. 5026231032 - Yokanan Prawira Nugroho
 * 2. 5026231087 - Shahnaz Ariqah Simanullang
 * 3. 5026231190 - Antony Purnamarasid August Ratulangi
 * ------------------------------------------------------
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the board you want : ");
        int boardSize = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        SnakeAndLadder g1 = new SnakeAndLadder(boardSize);
        g1.play();

        scanner.close();

    }
}

