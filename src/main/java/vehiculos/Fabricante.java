package vehiculos;

public class Fabricante {
	public int num = 0;
	private String nombre;
	private Pais pais;
	public static Pais[] tPaises;
	public static int Long = 0;
	private static Fabricante fMas;
	
	
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
	
	public static Fabricante fabricaMayorVentas() {
		for (int i = 0; i < Vehiculo.FLong; i++) {
			if(i == 0) {
				fMas = Vehiculo.tFabricantes[i];
			}
			else if (Vehiculo.tFabricantes[i].num > fMas.num) {
				fMas = Vehiculo.tFabricantes[i];
			}
		}
		return fMas;
	}
}