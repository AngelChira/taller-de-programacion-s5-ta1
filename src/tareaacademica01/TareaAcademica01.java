package tareaacademica01;

import java.util.Scanner;

public class TareaAcademica01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final short UIT =4950;
        final int MONTO_FIJO = UIT * 7;
        System.out.print("Ingrese el salario anul obtenido: ");
        float salarioAnual = teclado.nextFloat();
        float remuneracionNetoAnual = (float) (salarioAnual - MONTO_FIJO);
        float total = 0;
        if (remuneracionNetoAnual >= 0){
            if (remuneracionNetoAnual <= (5*UIT)){
                total = (float) (remuneracionNetoAnual * 0.08);
            } else {
                if (remuneracionNetoAnual <= (20*UIT)){
                    total = (float) (remuneracionNetoAnual * 0.14);
                } else {
                    if (remuneracionNetoAnual <= (35*UIT)){
                        total = (float) (remuneracionNetoAnual * 0.17);
                    } else {
                        if (remuneracionNetoAnual <= (45*UIT)){
                            total = (float) (remuneracionNetoAnual * 0.2);
                        } else {
                            total = (float) (remuneracionNetoAnual * 0.3);
                        }
                    }
                }
            }
        } else {
            System.out.println("Error, el monto del Remuneación Neta Anual es negativo.");
        }
        if (total > 0){
            System.out.printf("El monto total es S/%.2f %n",total);
        }
    }
    
}
