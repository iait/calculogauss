package com.eiv.gauss;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Calculo de suma de Gauss");

        CalculoGauss gauss = new CalculoGaussAlt2Impl();
        
        Scanner s = new Scanner(System.in);
        String sNum = s.nextLine();
        int num = Integer.valueOf(sNum);
        
        long resultado = gauss.calcular(num);
        System.out.println("El resultado de la suma de gauss de " + num + " es " + resultado);
        
        s.close();
        
    }

}
