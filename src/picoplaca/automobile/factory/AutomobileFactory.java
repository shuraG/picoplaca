package picoplaca.automobile.factory;

import picoplaca.automobile.domain.Automobile;
import picoplaca.automobile.domain.Commercial;
import picoplaca.automobile.domain.Government;
import picoplaca.automobile.domain.Munucipality;
import picoplaca.automobile.domain.PrivateAutoMobile;
import picoplaca.automobile.domain.UseOficiality;

/**
 *
 * @author Brayme
 */
public class AutomobileFactory {

    public Automobile createAutomobile(String placa) {
        Automobile automobile;
        String placa2n = String.valueOf(placa.charAt(1));
        switch (placa2n) {
            case "A":
            case "U":
            case "Z":
                automobile = new Commercial(placa);
                break;
            case "E":
                automobile = new Government(placa);
                break;
            case "X":
                automobile = new UseOficiality(placa);
                break;
            case "M":
                automobile = new Munucipality(placa);
                break;
            default:
                automobile = new PrivateAutoMobile(placa);
                break;
        }
        return automobile;
    }

}
