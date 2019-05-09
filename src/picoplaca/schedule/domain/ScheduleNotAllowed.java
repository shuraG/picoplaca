/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.schedule.domain;

import java.time.DayOfWeek;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ScheduleNotAllowed {

    private DayOfWeek dayOfWeek;
    private List<ScheduledTime> listScheduledTime;
    private List<String> listNplacas;

    public ScheduleNotAllowed(DayOfWeek dayOfWeek, List<ScheduledTime> listScheduledTime, List<String> nPlaca) {
        this.dayOfWeek = dayOfWeek;
        this.listScheduledTime = listScheduledTime;
        this.listNplacas = nPlaca;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public List<ScheduledTime> getListScheduledTime() {
        return listScheduledTime;
    }

    public void setListScheduledTime(List<ScheduledTime> listScheduledTime) {
        this.listScheduledTime = listScheduledTime;
    }

    public List<String> getListNplacas() {
        return listNplacas;
    }

    public void setListNplacas(List<String> listNplacas) {
        this.listNplacas = listNplacas;
    }

}
