package uaslp.objetos.escuela;
import java.util.HashMap;
import java.util.Map;


public class SalaDeJuntasFactory {
    private static Map<String, SalaDeJuntas> salasDeJuntas = new HashMap<>();

    public static SalaDeJuntas get(String nombre) {
        if (!salasDeJuntas.containsKey(nombre)) {
            salasDeJuntas.put(nombre, new SalaDeJuntas(nombre));
        }
        return salasDeJuntas.get(nombre);
    }
}
