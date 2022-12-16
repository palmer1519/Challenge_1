/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge_1;

import java.util.Scanner;

/**
 *
 * @author palme
 */
public class Challenge_1 {

    public static void main(String[] args) {
        double a;
        Scanner num = new Scanner(System.in);
        try {
            System.out.println("Introduce la LATITUD: ");
            a = num.nextDouble();
            anguloCal(a);
        } catch (Exception e) {
            System.out.println("Datos incorrectos");
        }
    }

    private static void anguloCal(double a) {
        int n = 2;
        int Rt = 6371;
        int h = 24;
        double distancia = Math.toRadians(a);
        double velocidad;
        double Pi = 3.1416;

        distancia = n * Rt * Pi * Math.cos(distancia);
        velocidad = distancia / h;
        System.out.println("La distancia es: " + distancia);
        System.out.println("VELOCIDAD: " + velocidad + "Km/h");

    }

}
