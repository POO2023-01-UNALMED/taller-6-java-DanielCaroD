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
	public static Fabricante[] tFabricantes = new Fabricante[Fabricante.arr];
	public static int FLong = 0;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos ++;
		this.fabricante.num ++;
		tFabricantes[FLong] = fabricante;
		FLong ++;
	}
	
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
	public int getVelocidadMaxima() {
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
	
	public static void setCantidadVehiculos(int cantidad) {
		CantidadVehiculos = cantidad;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
}