package pack1;

public class Funktion {

	public static void reset() {
		for (int i=0; i<Gui.state.length; i++) {
			Gui.state[i] = 0; //alle Felder werden zurückgesetzt
			
		}
		
		Gui.player = 0;
		Gui.gewinner = 0;
		
		
	}
	

}
