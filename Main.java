import java.util.Observer;


public class Main {
	public static void main(String[] arg){
		Wetterstation wetterstation = new Wetterstation();
		 Observer aktuelleBedingungen = new AktuelleBedingungen();
		 Observer tendenz = new Tendenz();

		wetterstation.addObserver(aktuelleBedingungen);
		wetterstation.addObserver(tendenz);
	}
}