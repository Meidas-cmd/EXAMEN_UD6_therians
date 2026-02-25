package Examen_Therians;

public interface AccionesPoliciales {

    Ciudadano solicitarDatosCiudadano();

    Expediente crearExpediente();

    void siguienteEstado(Expediente expediente);

    void archivarExpediente(Expediente expediente);
}
