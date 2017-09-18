/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1simulacion;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author andrespinzon
 */
public class Parcial1Simulacion {

    public static void main(String[] args) {
        double midU = 0;
        midU = Parcial1Simulacion.midSquareVersion2(1234, 23);
        System.out.println("Congruencial lineal");
        Parcial1Simulacion.congruencialLineal(midU, 1039, 170, 0, 30269);
    }

    public static double midSquareVersion2(int semilla, int ite) {
        double u = 0;
        String tmp;
        //Calculo el 23º u
        for (int i = 0; i < ite; i++) {
            //Elevo la semilla al cuadrado
            Double sqr = Math.pow(semilla, 2);
            String cadena = String.valueOf(sqr.intValue());

            //Evaluo si tiene menos de 4n digitos, si tiene menos completo con 0
            while (cadena.length() < 8) {
                cadena = 0 + cadena;
            }
            //System.out.println("cadena=" + cadena);
            semilla = Integer.parseInt(cadena.substring(0, 2) + cadena.substring(cadena.length() - 2, cadena.length()));
            //System.out.println((i+1)+"X=" + cadena.substring(0, 2) + cadena.substring(cadena.length() - 2, cadena.length()));
            //Asigno U
            u = Double.parseDouble("0." + semilla);
        }
        System.out.println("MidSquare U=" + u);
        System.out.println("=======================================================================");
        return u;
    }

    public static void congruencialLineal(double semilla, int ite, int a, int b, int m) {
        double resu;
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < ite; i++) {
            System.out.print((i + 1) + " - Semilla=" + df.format(semilla));
            resu = ((a * semilla) + b) % m;
            semilla = resu;
            double u = semilla / (m - 1);
            System.out.println("     X=" + resu + "      U=" + u);
        }
    }
}
