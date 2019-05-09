/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.schedule.domain;

import java.time.LocalTime;

/**
 *
 * @author Administrador
 */
public class ScheduledTime {

    private LocalTime from;
    private LocalTime until;

    public ScheduledTime(LocalTime from, LocalTime until) {
        this.from = from;
        this.until = until;
    }

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getUntil() {
        return until;
    }

    public void setUntil(LocalTime until) {
        this.until = until;
    }

}
