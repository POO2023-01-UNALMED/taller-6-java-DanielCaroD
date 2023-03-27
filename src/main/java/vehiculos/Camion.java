package vehiculos;

public class Camion extends Vehiculo  {
	private int ejes;
	int puertas = 2;
	int velocidadMaxima = 80;
	String traccion = "4X2";
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		CantidadVehiculos ++;
		Ccamiones ++;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getEjes() {
		return ejes;
	}
}