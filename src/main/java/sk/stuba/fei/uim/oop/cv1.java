package sk.stuba.fei.uim.oop;
import java.util.Scanner;


public class cv1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj cisla:");
        int a, b;
        a=input.nextInt();
        b=input.nextInt();

        System.out.println("Vrati:" + porovnaj(a,b));

    }
    static int porovnaj(int a , int b){
        if(a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            return 0;
        }
    }
}
