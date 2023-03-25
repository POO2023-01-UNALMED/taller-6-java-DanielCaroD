package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	int puertas = 4;
	int velocidadMaxima = 100;
	String traccion = "FWD";
	
	public Automovil (String placa, String nombre, int precio, int peso, String traccion, Fabricante fabricante)  {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
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