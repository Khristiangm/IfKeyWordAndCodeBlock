package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

//        if (score <= 5000 && score >= 1000) {
//            System.out.println("Your Score Was Less than 5000!!, but more than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your Score Was Less than 1000!!, Be careful");
//        }
//    }

        if (gameOver ==true) {
            int finalScore = score + (levelCompleted * bonus);// Variaveis Criadas dentro do Bloco de Codigo, nao podem ser chamadas fora dele;;
            System.out.println("Your Final Score Was " + finalScore );


        }
        if (secondGameOver == true){
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your Second Final Score Was " + secondFinalScore);
        }
    }
}
