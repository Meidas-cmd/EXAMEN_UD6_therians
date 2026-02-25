package Examen_Therians;

public class NoPagadoException extends RuntimeException {
    public NoPagadoException() {
        super("El expediente todavia no esta pagado: ");
    }
}
