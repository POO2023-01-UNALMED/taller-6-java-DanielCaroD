package vehiculos;

public class Pais {
	private String nombre;
	public int cont = 0;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
}
