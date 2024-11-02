package com.martin.projects;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner consola = new Scanner(System.in);
    int number = random.nextInt(0, 100);
    boolean active = true;
    int opcion = menuOpcion(consola);
    int intentosMaximos = getIntentos(opcion);
    int intentos = 0;
    getMessage(opcion);
    System.out.println("Let's start the game!");
    while (active && intentos < intentosMaximos) {
      System.out.print("Enter your guess: ");
      int adivinado = consola.nextInt();
      if (adivinado == number) {
        System.out.println(
            "Congratulations! You guessed the correct number in " + intentos + " attempts.");
        active = false;
      } else {
        if (adivinado < number) {
          System.out.println("Incorrect! The number is greater than " + adivinado);
        }
        if (adivinado > number) {
          System.out.println("Incorrect! The number is less than " + adivinado);
        }
        intentos++;
      }
    }
  }


  private static int getIntentos(int opcion) {
    return switch (opcion) {
      case 1 -> 10;
      case 2 -> 5;
      case 3 -> 3;
      default -> throw new IllegalArgumentException("Invalid opcion " + opcion);
    };
  }

  private static void getMessage(int opcion) {
    switch (opcion) {
      case 1 -> System.out.println("Great! You have selected the Easy difficulty level.");
      case 2 -> System.out.println("Great! You have selected the Medium difficulty level.");
      case 3 -> System.out.println("Great! You have selected the Hard difficulty level.");
      default -> throw new IllegalArgumentException("Invalid opcion " + opcion);
    }
  }

  private static int menuOpcion(Scanner consola) {
    System.out.print("""
        Please Select the difficult level
        1. Easy (10 chances)
        2. Medium (5 chances)
        3. Hard (3 chances)
        4. exit
        Ingrese una opcion:\s""");
    return Integer.parseInt(consola.nextLine());
  }
}