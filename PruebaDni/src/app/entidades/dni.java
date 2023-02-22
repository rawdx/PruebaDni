package app.entidades;

public class dni {
	
	private int numDni;
	private char letraDni;
	
	
	public int getNumDni() {
		return numDni;
	}
	public void setNumDni(int numDni) {
		this.numDni = numDni;
	}
	public char getLetraDni() {
		return letraDni;
	}
	public void setLetraDni(char letraDni) {
		this.letraDni = letraDni;
	}
	
	@Override
	public String toString() {
		return "dni = [" + numDni + letraDni + "]";
	}
	
	
}
