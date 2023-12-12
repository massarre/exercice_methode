package com.exercicemethode;

import java.util.Random;

public class App {

  public static void main(String[] args) {
    int caseCourante = 0;
    int caseObjectif = 20;
    int nbLancers = 5;

    System.out.println("Bienvenue ! Commençons...");
    caseCourante = executerFor(nbLancers, caseObjectif);
    alternatives(caseCourante, caseObjectif);
  }

  public static int executerFor(int nbLancers, int caseCourante) {
    for (int i = 1; i <= nbLancers; i++) {
      Random generateur = new Random();
      int nbAléatoire = generateur.nextInt(6) + 1;
      caseCourante = caseCourante + nbAléatoire;
      System.out.println(String.format(
          "Lancer " + i + " : vous avez fait " + nbAléatoire + ". Vous êtes sur la case " + caseCourante + "."));
    }
    return caseCourante;
  }

  static void alternatives(int caseCourante, int caseObjectif) {
    if (caseCourante == caseObjectif) {
      System.out.println("Vous avez gagné !");
    } else if (caseCourante > caseObjectif) {
      System.out.print("Vous dépassez, vous avez perdu !");
    } else {

      System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
    }
  }

  // {
  // int nblancer=5
  // randonom gene
  // for (int i = 1; i<=nblancer; i++){
  // casecourante = lancerdedeé (generateur, casecourante)
  // }
  // aficherrelsuatparie (casecourante, caseobjetcif)
  // }
}
