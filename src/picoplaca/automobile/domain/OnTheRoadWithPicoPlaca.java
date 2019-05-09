/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package picoplaca.automobile.domain;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;
import picoplaca.schedule.domain.ScheduleNotAllowed;
import picoplaca.schedule.domain.ScheduledTime;
import picoplaca.schedule.service.SchedulePicoPlacaService;

/**
 * For Autos like commercials and privates, which aren't allowed circulated in
 * any time.
 *
 * @author Brayme
 */
public class OnTheRoadWithPicoPlaca implements OnTheRoadBehavior {

    @Override
    public boolean canBeOnTheRoad(String date, String time, String placa) {
        List<ScheduleNotAllowed> listNotAllow = SchedulePicoPlacaService.findAllLISTNOTALLOWD();
        LocalDate lDate = LocalDate.parse(date);
        LocalTime lTime = LocalTime.parse(time);
        String placaThird = String.valueOf(placa.charAt(7));
        boolean matched = listNotAllow.stream()
                .anyMatch(p -> {
                    boolean matchDay = p.getDayOfWeek().equals(lDate.getDayOfWeek());                    
                    boolean matchScheTime = matchWithScheduleTime(lTime, p.getListScheduledTime());
                    boolean matchPlaca = p.getListNplacas().stream().anyMatch(pl -> placaThird.equals(pl));
                    return matchDay && matchScheTime && matchPlaca;
                }
                );
        return !matched;
    }

    private boolean matchWithScheduleTime(LocalTime lTime, List<ScheduledTime> listScheTime) {
        return listScheTime.stream().anyMatch(scheTime -> {
            boolean between = lTime.isAfter(scheTime.getFrom()) && lTime.isBefore(scheTime.getUntil());
            boolean equals = lTime.equals(scheTime.getFrom()) || lTime.equals(scheTime.getUntil());
            return between || equals;
        });
    }
}
