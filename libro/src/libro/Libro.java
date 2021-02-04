package libro;

public class Libro {
	
	private String titulo;
	private String autor;
	private boolean disponible;

	Libro (){
		this.autor = null;
		this.titulo = null;
		this.disponible = true;
	}
	
	Libro(String titulo, String autor, boolean disponible){
		this.autor = autor;
		this.titulo = titulo;
		this.disponible = disponible;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}	
	public String toString() {
		return "titulo: " + this.titulo + "\nautor: " + this.autor; 
	}
	
	public void prestamo() {
		this.disponible = false;
	}
	
	public void devolucion() {
		this.disponible = true;		
	}
}
