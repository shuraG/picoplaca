package picoplaca.schedule.service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import picoplaca.schedule.domain.ScheduleNotAllowed;
import picoplaca.schedule.domain.ScheduledTime;

/**
 *
 * @author Brayme
 */
public class SchedulePicoPlacaService {

    private final static List<ScheduleNotAllowed> LISTNOTALLOWD;

    static {
        LISTNOTALLOWD = new ArrayList<>();
        List<ScheduledTime> listScheduledTime = new ArrayList<>();
        listScheduledTime.add(new ScheduledTime(LocalTime.of(7, 0), LocalTime.of(9, 30)));
        listScheduledTime.add(new ScheduledTime(LocalTime.of(16, 0), LocalTime.of(19, 30)));
        List<String> placasMonday = new ArrayList<>();
        placasMonday.add("1");
        placasMonday.add("2");
        List<String> placasTuesday = new ArrayList<>();
        placasTuesday.add("3");
        placasTuesday.add("4");
        List<String> placasWednesday = new ArrayList<>();
        placasWednesday.add("5");
        placasWednesday.add("6");
        List<String> placasThursday = new ArrayList<>();
        placasThursday.add("7");
        placasThursday.add("8");
        List<String> placasFriday = new ArrayList<>();
        placasFriday.add("9");
        placasFriday.add("0");
        List<String> placasSaturday = new ArrayList<>();
        List<String> placasSunday = new ArrayList<>();

        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.MONDAY, listScheduledTime, placasMonday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.TUESDAY, listScheduledTime, placasTuesday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.WEDNESDAY, listScheduledTime, placasWednesday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.THURSDAY, listScheduledTime, placasThursday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.FRIDAY, listScheduledTime, placasFriday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.SATURDAY, listScheduledTime, placasSaturday));
        LISTNOTALLOWD.add(new ScheduleNotAllowed(DayOfWeek.SUNDAY, listScheduledTime, placasSunday));
    }

    public static List<ScheduleNotAllowed> findAllLISTNOTALLOWD() {
        return LISTNOTALLOWD;
    }

}
