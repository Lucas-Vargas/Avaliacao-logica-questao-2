/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoquestao2;

import java.util.Scanner;

/**
 * @Lucas da Silva Vargas
 */
public class AvaliacaoQuestao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int camP, camM, camG, cont;
       double res, descP, descM, descG;
        System.out.println("Quantas camisetas pequenas deseja comprar?");
        camP = ler.nextInt();
        System.out.println("Quantas camisetas médias deseja comprar?");
        camM = ler.nextInt();
        System.out.println("Quantas camisetas grandes deseja comprar?");
        camG = ler.nextInt();
        
        if(camP>5 || camM>5 || camG>5){
            if(camP>5){
                camP*=10;
                camP*=0.945;
                System.out.println("Você tera de pagar R$"+camP+" pelas camisetas pequenas, com um desconto de 5.5%.");
            }else{
                camP*=10;
                System.out.println("Você terá de pagar R$"+camP+" pelas camisetas pequenas.");
            }
            if(camM>5){
                camM*=12;
                camM*=0.945;
                System.out.println("Você tera de pagar R$"+camM+" pelas camisetas médias, com um desconto de 5.5%.");
            }else{
                camM*=12;
               System.out.println("Você terá de pagar R$"+camM+" pelas camisetas médias."); 
            }
            if(camG>5){
                camG*=15;
                camG*=0.945;
                System.out.println("Você tera de pagar R$"+camG+" pelas camisetas grandes, com um desconto de 5.5%.");
            }else{
                camG+=15;
                System.out.println("Você terá de pagar R$"+camG+" pelas camisetas grandes."); 
            }
    }else{
            camP*=10;
        camM*=12;
        camG*=15;
            System.out.println("Você tera de pagar R$"+camP+" pelas camisetas pequenas.\nVocê tera de pagar R$"+camM+" pelas camisetas médias.\nVocê tera de pagar R$"+camG+" pelas camisetas grandes");
        }
    
    }
    
}
