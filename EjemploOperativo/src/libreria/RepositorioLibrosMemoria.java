package libreria;

import java.util.HashMap;
import java.util.Map;

public class RepositorioLibrosMemoria implements RepositorioLibros {
    private Map<String, String> libros = new HashMap<>();

    // Guarda el libro con clave-valor -> titulo_desc
    @Override
    public void guardarLibro(String titulo, String desc) {
        libros.put(titulo, desc); 
    }

    // Retornará la descripcion del libro (si no existe el titulo, retornará null)
    @Override
    public String buscarLibro(String titulo) {
        return libros.get(titulo); 
    }
}