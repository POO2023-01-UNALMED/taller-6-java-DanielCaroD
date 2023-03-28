package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static Pais[] tPaises;
	public static int Long = 0;
	
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.pais.cont ++;
		tPaises[Long] = pais;
		Long ++;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return pais;
	}
}
