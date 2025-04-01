package libreria;

public interface RepositorioLibros {

	void guardarLibro(String titulo, String descripcion);
	
    String buscarLibro(String titulo);
	
}
