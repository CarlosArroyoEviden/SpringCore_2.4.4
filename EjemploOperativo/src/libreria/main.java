package libreria;

public class main {

	public static void main(String[] args) {
        // Crear la implementación del repositorio
        RepositorioLibros repositorioLibros = new RepositorioLibrosMemoria();

        // Crear el servicio, inyectando la dependencia
        Biblioteca biblioteca = new Biblioteca(repositorioLibros);

        // Usar el servicio
        biblioteca.registrarLibro("El señor de los misterios", "Libro de misterio, o algo así");
        biblioteca.mostrarLibro("El señor de los misterios");
        biblioteca.mostrarLibro("El Quijote");

	}

}
