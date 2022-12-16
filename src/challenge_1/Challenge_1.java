
package challenge_1;

import java.util.Scanner;


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
        double Pi = 3.1416;
        double distancia = Math.toRadians(a);
        double velocidad;
        
        // V = 2πRtCosα / t
        distancia = n * Rt * Pi * Math.cos(distancia);
        // V = d / t
        velocidad = distancia / h;
        
        System.out.println("La distancia es: " + distancia + " Km");
        System.out.println("VELOCIDAD: " + velocidad + " Km/h");

    }

}
