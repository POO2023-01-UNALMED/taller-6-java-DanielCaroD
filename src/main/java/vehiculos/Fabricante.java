package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	static Pais[] tPaises;
	static int Long = 0;
	static Pais pMas;
	
	
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
	
	public Pais paisMasVendedor() {
		for (int i = 0; i < Long; i++) {
			if(i == 0) {
				pMas = tPaises[i];
			}
			else if (tPaises[i].cont > pMas.cont) {
				pMas = tPaises[i];
			}
		}
		return pMas;
	}
}