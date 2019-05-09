package picoplaca.automobile.domain;

/**
 * For Autos from Goverment or Emergencies, which are allowed to circulate any
 * time.
 *
 * @author Brayme
 */
public class OnTheRoadWithoutPicoPlaca implements OnTheRoadBehavior {

    /**
     *
     * @param date
     * @param time
     * @param placa
     * @return
     */
    @Override
    public boolean canBeOnTheRoad(String date, String time, String placa) {
        return true;
    }

}
