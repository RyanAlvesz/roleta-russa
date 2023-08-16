package br.senai.sp.jandira.model;

import java.util.Random;
import java.util.Scanner;

public class rodar {

    Random aleatorio = new Random();
    Scanner teclado = new Scanner(System.in);

    int resposta;

    public void Pergunta(){

        System.out.println("---------------------------");
        System.out.println("        Roleta Russa");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.print("Escolha um número de 1 a 3: ");
        resposta = teclado.nextInt();

    }
    public void Roletar(){

        Pergunta();

        int numeroAleatorio = aleatorio.nextInt(3) + 1;

        System.out.println("Você escolheu: " + resposta);
        System.out.println("O número sorteado foi: " + numeroAleatorio);
        System.out.println("");

        if (resposta == numeroAleatorio){
            System.out.println("Você perdeu!");
        }else{
            System.out.println("Você ganhou!");
        }

        System.out.println();
        System.out.println("Deseja jogar de novo? (Sim/Não)");
        String respostaJogar = teclado.next();

        switch (respostaJogar.toLowerCase()){

            case "sim":
                Roletar();
                break;
        }

    }

}
