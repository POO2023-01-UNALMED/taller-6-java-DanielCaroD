package vehiculos;

public class Camioneta extends Vehiculo  {
	private boolean volco;
	int velocidadMaxima = 90;
	String traccion = "4X4";
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		CantidadVehiculos ++;
		Ccamionetas ++;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public boolean isVolco() {
		return volco;
	}
}
