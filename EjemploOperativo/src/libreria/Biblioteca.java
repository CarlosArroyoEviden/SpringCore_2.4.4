package libreria;

public class Biblioteca {
    private final RepositorioLibros repositorioLibros;

    // Inyección de dependencias por constructor
    public Biblioteca(RepositorioLibros repositorioLibros) {
        this.repositorioLibros = repositorioLibros;
    }

    public void registrarLibro(String titulo, String desc) {
        repositorioLibros.guardarLibro(titulo, desc);
        System.out.println("Libro registrado: " + titulo);
    }

    public void mostrarLibro(String titulo) {
        String libro = repositorioLibros.buscarLibro(titulo);
        if (libro != null) {
            System.out.println("Libro encontrado: " + libro);
        } else {
            System.out.println("Libro no encontrado: " + titulo);
        }
    }
}