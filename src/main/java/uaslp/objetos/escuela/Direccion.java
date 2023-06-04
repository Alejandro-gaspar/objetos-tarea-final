package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion instance;

    private Direccion() {
        // Constructor privado para evitar la creación directa de instancias
    }

    public static Direccion getInstance() {
        if (instance == null) {
            instance = new Direccion();
        }
        return instance;
    }
}
