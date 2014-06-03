
import java.util.Observable;
import java.util.Observer;


public class AktuelleBedingungen implements Observer{
	public AktuelleBedingungen(){}

	public void update(Observable obs, Object obj) {
		MessDaten daten = (MessDaten) obj;
		System.out.println("aktuell: " 
				+ daten.getTemperatur() + " C " 
				+ daten.getFeuchtigkeit() + "% "
				+ daten.getDruck() + " hPa ");
	}
}