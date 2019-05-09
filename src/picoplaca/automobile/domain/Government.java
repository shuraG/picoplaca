package picoplaca.automobile.domain;

/**
 *
 * @author Brayme
 */
public class Government extends Automobile {

    public Government(String placa) {
        super(placa);
        onTheRoadBehavior = new OnTheRoadWithoutPicoPlaca();
    }

}
