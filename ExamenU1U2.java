/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenu1u2;

import java.util.Scanner;

/**
 *
 * @author expec
 */
public class ExamenU1U2 {

    public static void main(String[] args) {
        double instrumento1=1250.45,instrumento2=3743.00,instrumento3=2683.78, totalPorcentaje1,totalPorcentaje2,totalPorcentaje3, pCompra1,
                pCompra2,pCompra3,ganancia1,ganancia2,ganancia3;
        String nInstrumento1,nInstrumento2,nInstrumento3;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer instrumento: ");
        nInstrumento1=e.nextLine();
        System.out.println("Ingrese el precio de compra de: "+nInstrumento1);
        pCompra1 = e.nextDouble();
        System.out.println("Ingrese el nombre del segundo instrumento: ");
        e.nextLine();
        nInstrumento2= e.nextLine();
        System.out.println("Ingrese el precio de compra de: "+nInstrumento2);
        pCompra2 = e.nextDouble();
        System.out.println("Ingrese el nombre del tercer instrumento: ");
        e.nextLine();
        nInstrumento3 = e.nextLine();
        System.out.println("Ingrese el precio de compra de: "+nInstrumento3);
        pCompra3 = e.nextDouble();
        
        ganancia1 = instrumento1 - pCompra1;
        ganancia2 = instrumento2 - pCompra2;
        ganancia3 = instrumento3 - pCompra3;
        
        totalPorcentaje1 = (ganancia1/pCompra1)*100;
        totalPorcentaje2 = (ganancia1/pCompra2)*100;
        totalPorcentaje3 = (ganancia1/pCompra3)*100;
        
        System.out.println("********************************");
        System.out.println("El porcentaje de ganancia de: "+nInstrumento1+"es: "+totalPorcentaje1);
        System.out.println("El porcentaje de ganancia de: "+nInstrumento2+"es: "+totalPorcentaje2);
        System.out.println("El porcentaje de ganancia de: "+nInstrumento3+"es: "+totalPorcentaje3);
        System.out.print("********************************");

        e.close();
    }
}
