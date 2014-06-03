import java.util.Observable;
import java.util.Observer;


public class Tendenz implements Observer{
	private int lastTemp;
	private int lastFeucht;
	private int lastDruck;


	public Tendenz(){}
	
	public void update(Observable obs, Object obj) {
		MessDaten daten = (MessDaten) obj;
		int temp = daten.getTemperatur();
		int feucht = daten.getFeuchtigkeit();
		int druck = daten.getDruck();

		System.out.print("Tendenz: ");

		if (temp >= lastTemp){
			System.out.print("Temp + ");
		}
		else {
			System.out.print("Temp - ");
		}

		if (feucht >= lastFeucht){
			System.out.print("Feucht + ");
		}
		else {
			System.out.print("Feucht - ");
		}

		if (druck >= lastDruck){
			System.out.println("Druck + ");
		}
		else {
			System.out.println("Druck - ");
		}

		lastTemp = temp;
		lastFeucht = feucht;
		lastDruck = druck;
	}

}