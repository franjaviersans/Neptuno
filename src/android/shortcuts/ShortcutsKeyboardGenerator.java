package android.shortcuts;

import java.util.Vector;


public class ShortcutsKeyboardGenerator {
	
	//Class to contain the new keyes
	public class shortKey{
		public int code;
		public CharSequence text;
		public CharSequence label;
		
		public shortKey(int c, CharSequence t, CharSequence l){
			this.code = c;
			this.text = t;
			this.label = l;
		}
	}
	
	private Vector<shortKey> Keyes;
	
	public ShortcutsKeyboardGenerator(){
		Keyes = new Vector<shortKey>();
	}
	
	//Method to obtain the data from ....
	public void ObtainData(){
		if(Keyes.size() > 0)Keyes.clear();

		Keyes.ensureCapacity(5);
		Keyes.add(new shortKey(110, "No voy a almorzar","nva"));
		Keyes.add(new shortKey(110, "Estoy en el cine","ec"));
		Keyes.add(new shortKey(110, "Francisco Sans","fs"));
		Keyes.add(new shortKey(110, "Fernando Crema","fc"));
		Keyes.add(new shortKey(110, "Voy a comer", "vc"));
	}
	
	public Vector<shortKey> GetShorcuts(){
		return Keyes;
	}
}
