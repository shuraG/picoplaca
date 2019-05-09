package picoplaca.automobile.domain;

/**
 * Define an private automobile
 *
 * @author brayme
 */
public class PrivateAutoMobile extends Automobile {

    public PrivateAutoMobile(String placa) {
        super(placa);
        onTheRoadBehavior = new OnTheRoadWithPicoPlaca();
    }

}
