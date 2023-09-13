package tareaacademica01;

import java.util.Scanner;

public class TareaAcademica01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final short UIT =4950;
        final int MONTO_FIJO = UIT * 7;
        System.out.print("Ingrese el salario anual obtenido: ");
        float salarioAnual = teclado.nextFloat();
        float remuneracionNetaAnual = (float) (salarioAnual - MONTO_FIJO);
        float impuestoRenta = 0;
        if (remuneracionNetaAnual > 0){
            if (remuneracionNetaAnual <= (5*UIT)){
                impuestoRenta = (float) (remuneracionNetaAnual * 0.08);
            } else {
                if (remuneracionNetaAnual <= (20*UIT)){
                    impuestoRenta = (float) (remuneracionNetaAnual * 0.14);
                } else {
                    if (remuneracionNetaAnual <= (35*UIT)){
                        impuestoRenta = (float) (remuneracionNetaAnual * 0.17);
                    } else {
                        if (remuneracionNetaAnual <= (45*UIT)){
                            impuestoRenta = (float) (remuneracionNetaAnual * 0.2);
                        } else {
                            impuestoRenta = (float) (remuneracionNetaAnual * 0.3);
                        }
                    }
                }
            }
        } else {
            System.out.println("Usted no pagará nada ya que el salario anual es menor que el monto fijo.");
        }
        if (impuestoRenta > 0){
            System.out.printf("El impuesto a la renta a pagar es S/%.2f soles. %n",impuestoRenta);
        }
    }
    
}
