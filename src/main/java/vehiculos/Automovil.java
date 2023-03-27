package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	int puertas = 4;
	int velocidadMaxima = 100;
	String traccion = "FWD";
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		CantidadVehiculos ++;
		Cautomoviles ++;

	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuestos() {
		return puestos;
	}
}