package vehiculos;

public class Pais {
	private String nombre;
	public int cont = 0;
	private Pais pMas;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public Pais paisMasVendedor() {
		for (int i = 0; i < Fabricante.Long; i++) {
			if(i == 0) {
				pMas = Fabricante.tPaises[i];
			}
			else if (Fabricante.tPaises[i].cont > pMas.cont) {
				pMas = Fabricante.tPaises[i];
			}
		}
		return pMas;
	}
}
