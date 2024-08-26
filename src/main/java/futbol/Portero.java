package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short goles, byte dorsal) {
		super(nombre, edad, "Portero");
		golesRecibidos = goles;
		this.dorsal = dorsal;
	}
	
	public Portero() {
		super();
		golesRecibidos = 289;
		dorsal = 7;
	}
	
	
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public boolean jugarConLasManos() {
		return true;
	}
	
	public int compareTo(Portero f) {
		return Math.abs(this.getGolesRecibidos() - f.getGolesRecibidos());
	}
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+dorsal+". Le han marcado "+golesRecibidos;
	}
}
