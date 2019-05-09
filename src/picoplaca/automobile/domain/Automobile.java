/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.automobile.domain;

/**
 *
 * @author Brayme
 */
public abstract class Automobile {

    private String placa;
    OnTheRoadBehavior onTheRoadBehavior;

    public Automobile(String placa) {
        this.placa = placa;
    }

    public boolean canBeOnTheRoad(String date, String time) {
        return onTheRoadBehavior.canBeOnTheRoad(date, time, this.placa);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
