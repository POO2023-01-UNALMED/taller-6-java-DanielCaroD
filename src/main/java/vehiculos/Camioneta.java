package vehiculos;

public class Camioneta extends Vehiculo  {
	private boolean volco;
	int velocidadMaxima = 90;
	String traccion = "4X4";
	
	public Camioneta (String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante ,boolean volco)  {
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
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
