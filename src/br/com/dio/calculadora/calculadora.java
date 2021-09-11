package br.com.dio.calculadora;

import jdk.dynalink.beans.StaticClass;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor :");
        a= scan.nextByte();
        System.out.println("Digite o segundo valor :");
        b= scan.nextByte();

        int somar = somar(a,b);
        int sub =  subtrair(a,b);
        int mult = multiplicar(a,b);
        double div =  dividr(a,b);

        System.out.println("soma : "+somar);
        System.out.println("Subtração :  "+sub);
        System.out.println("multiplicação: " +mult);
        System.out.println("divisão: "+div);


    }

    public static int somar (int a, int b){
        return a+b;

    }
    public static int subtrair (int a, int b){
        return a-b;

    }
    public static int multiplicar (int a, int b){
        return a*b;

    }
    public static double dividr (double a, double b){
        return a/b;

    }
}
