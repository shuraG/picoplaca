/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.automobile.domain;

/**
 *
 * @author Administrador
 */
public class Munucipality extends Automobile {

    public Munucipality(String placa) {
        super(placa);
        onTheRoadBehavior = new OnTheRoadWithPicoPlaca();
    }

}
