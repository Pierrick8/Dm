/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm_gautier_pierrick;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
private int times = 0;
public void run() {
times++;
if (times == 181) {
    System.out.println("Trop tard la police est là !");
    //Stop Timer.    
    this.cancel();
    System.exit(0);    
        }
if (times >= 151)
    System.out.println("Il vous reste " + (151 - times) + " secondes !");
    }
}

/**
 *
 * @author gauti
 */
public class DM_Gautier_Pierrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Vous avez 3 minutes pour trouver une combinaison de trois nombres chacun compris entre 1 et 100 inclus, avec un nombre d'essais limités. ");        
    Timer timer = new Timer("Printer");
    MyTask t = new MyTask();
    timer.schedule(t, 0, 1000);

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    
    int nb1,nb2,nb3,a,b,c;
    int essai1 = 0;
    int essai2 = 0;
    int essai3 = 0;
    
    nb1 = rand.nextInt(100)+1;
    nb2 = rand.nextInt(100)+1;
    nb3 = rand.nextInt(100)+1;
    
    System.out.println("Rentrez un premier nombre"); 
    a=sc.nextInt();

    while(a != nb1 ){       
        if(a < nb1){
            System.out.println("C'est plus, recommencez");
        }
        else
            System.out.println("C'est moins, recommencez");
            essai1+= 1;
        
        if(essai1 == 10){
            System.out.println("Vous avez bloqué le cadenas");
            System.exit(0);
        }
        else
            a = sc.nextInt();
    }
    if(a == nb1 ){
        essai1+=  1;
        System.out.println("Bravo vous avez trouver le premier nombre après " + essai1 + " essais");
    }                           
    
    System.out.println("Rentrez le deuxième nombre"); 
    b = sc.nextInt();

    while(b != nb2 ){      
        if(b < nb2){
            System.out.println("C'est plus, recommencez");
        }
        else
            System.out.println("C'est moins, recommencez");
            essai2+= 1;
        
        
        if(essai2 == 10){
            System.out.println("Vous avez bloqué le cadenas");
            System.exit(0);
        }
        else
            b = sc.nextInt();
    }
    if(b == nb2 ){
        essai2+= 1;
        System.out.println("Bravo vous avez trouver le deuxième nombre après " + essai2 + " essais");
    }        
    
    System.out.println("Rentrez le troisième nombre"); 
    c = sc.nextInt();

    while(c != nb3 ){      
        if(c < nb3){
            System.out.println("C'est plus, recommencez");
    }
        if(c > nb3)
            System.out.println("C'est moins, recommencez");
            essai3+= 1;    
        
        
        if(essai3 == 10){
            System.out.println("Vous avez bloqué le cadenas");
            System.exit(0);
        }
        else
            c = sc.nextInt();
    }
    if(c == nb3){
        essai3+= 1;
        System.out.println("Bravo vous avez trouver le troisième nombre après " + essai3 + " essais");
    }        

    System.out.println("Vous avez trouvé les trois nombres en "+(essai1 + essai2 + essai3) + " essais !");
    System.out.println("La combinaison était " + (nb1)+ " " + (nb2)+ " " + (nb3));
    System.exit(0);

    }

    }
    

