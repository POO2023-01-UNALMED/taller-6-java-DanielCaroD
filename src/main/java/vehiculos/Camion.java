package vehiculos;

public class Camion extends Vehiculo  {
	private int ejes;
	int puertas = 2;
	int velocidadMaxima = 80;
	String traccion = "4X2";
	
	public Camion (String placa, String nombre, int precio, int peso, Fabricante fabricante)  {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
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