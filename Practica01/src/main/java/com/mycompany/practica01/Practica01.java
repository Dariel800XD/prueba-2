package com.mycompany.practica01;

import java.util.Scanner;

public class Practica01 {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido a una calculadora");
        
        Scanner input = new Scanner(System.in);
        
        int primerNum;
        int segunNum;
        
        
        
        System.out.println("Ingrese el primer número:");
        primerNum = input.nextInt();
        
        System.out.println("Ingrese el segundo Numero:");
        segunNum = input.nextInt();
        
        int suma = primerNum + segunNum;
        int resta = primerNum - segunNum;
        int division = primerNum / segunNum;
        int multiplicacion = primerNum * segunNum;
        
        int operaciones;
        
        System.out.println("Elige la operacion que haras con su numero indicador:");
        System.out.println("1: Suma, 2: Resta, 3: Division, 4: Multiplicacion");
        
        operaciones = input.nextInt();
        
        
        
        if(operaciones == 1){
            
            System.out.println(suma);
        }
        
        else {
            if(operaciones == 2){
                
                System.out.println(resta);
                
            }
            
            else {
                if(operaciones == 3){
                    System.out.println(division);
                }
                
                else {
                    if(operaciones == 4){
                        System.out.println(multiplicacion);
                    }
                    else {
                        System.out.println("Escoge un operador de los que esta en la pantalla67");
                    }
                }
            }
        }
        
        input.close();;

    }
}
