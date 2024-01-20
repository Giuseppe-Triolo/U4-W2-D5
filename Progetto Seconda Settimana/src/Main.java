import biblioteca.ArchivioBibliotecario.ArchivioBibliotecario;
import biblioteca.catalogo.Libro;
import biblioteca.catalogo.Rivista;
import biblioteca.utils.Periodicita;

public class Main {
    public static void main(String[] args) {
        ArchivioBibliotecario archivio = new ArchivioBibliotecario();

        archivio.aggiungiElemento(new Libro("666666666", "Against Intellectual Monopoly", 2008, 348, "Michele Boldrin", "Economics"));
        archivio.aggiungiElemento(new Rivista("111111111", "Time Magazine", 2023, 50, Periodicita.SETTIMANALE));


        archivio.salvaSuDisco("archivio.dat");

        archivio = new ArchivioBibliotecario();

        archivio.caricaDaDisco("archivio.dat");

        archivio.cercaPerISBN("123456789").ifPresent(System.out::println);
    }
}
