package memorygame;

//Variables de la clase
public class Carta {

	private String imagen;
	private int idCarta;
	private String nombre;
	
	

	//Aca el constructor de la clase
	public Carta (String imagen, int idCarta, String nombre) {
		
		this.idCarta = idCarta;
		this.imagen = imagen;
		this.nombre = nombre;
		
		}
	
	
	//Getters y Setters. ¿Lo quieren separar en primero Getters y luego Setters?
	public String getImagen() {
		return imagen;
	}
	
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
	public int getIdCarta() {
		return idCarta;
	}
	
	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}