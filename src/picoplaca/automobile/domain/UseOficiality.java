package picoplaca.automobile.domain;

/**
 * Can be automobiles like: police, emergencies, etc
 *
 * @author Brayme
 */
public class UseOficiality extends Automobile {

    public UseOficiality(String placa) {
        super(placa);
        onTheRoadBehavior = new OnTheRoadWithoutPicoPlaca();
    }

}
