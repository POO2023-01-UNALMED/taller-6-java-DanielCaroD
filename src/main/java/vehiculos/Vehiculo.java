package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	static int CantidadVehiculos;
	static int Cautomoviles;
	static int Ccamionetas;
	static int Ccamiones;
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPuertas() {
		return puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int VelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getTraccion() {
		return traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Fabricante fabricante() {
		return fabricante;
	}
	
	public void vehiculosPorTipo () {
		System.out.println("Automoviles: " + Cautomoviles + "\nCamionetas; " + Ccamionetas + "\nCamiones: " + Ccamiones);
	}
	
	public Fabricante fabricaMayorVentas() {
		return this.fabricante;
	}
}