/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desglose_billetes;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class Desglose_billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner introducir= new Scanner(System.in);
        int num,rest,coc;
        System.out.println("ingresa numero: ");
        num=introducir.nextInt();
        if (num>=500){
            coc=num/500;
            num=num%500;
            System.out.println(" "+coc+" billetes de 500");
        }
        if (num>=200){
            coc=num/200;
            num=num%200;
            System.out.println(" "+coc+" billetes de 200");
        }
        if (num>=100){
            coc=num/100;
            num=num%100;
            System.out.println(" "+coc+" billetes de 100");
        }   
        if (num>=50){
            coc=num/50;
            num=num%50;
            System.out.println(" "+coc+" billetes de 50");
        }
        if (num>=20){
            coc=num/20;
            num=num%20;
            System.out.println(" "+coc+" billetes de 20");
        }
        if (num>=10){
            coc=num/10;
            num=num%10;
            System.out.println(" "+coc+" billetes de 10");
        }
        if (num>=5){
            coc=num/5;
            num=num%5;
            System.out.println(" "+coc+" billetes de 5");
        }
         
        if (num>=2){
            coc=num/2;
            num=num%2;
            System.out.println(" "+coc+" monedas de 2");
        }
        if (num>=1){
            coc=num/1;
            num=num%1;
            System.out.println(" "+coc+" monedas de 1");
        }
    }
    
}
