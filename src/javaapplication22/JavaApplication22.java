/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import picoplaca.automobile.factory.AutomobileFactory;
import picoplaca.automobile.domain.Automobile;

/**
 *
 * @author Administrador
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "AEC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        System.out.println("Can be on the Road!?: " + automobile.canBeOnTheRoad(fecha, hora));
    }

}
