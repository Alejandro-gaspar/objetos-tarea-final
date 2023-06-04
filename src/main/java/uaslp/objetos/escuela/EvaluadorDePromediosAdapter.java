package uaslp.objetos.escuela;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        List<Double> calificaciones = parseCalificaciones(listaDeCalificaciones);
        return evaluadorDePromedios.evalua(calificaciones);
    }

    private List<Double> parseCalificaciones(String listaDeCalificaciones) {
        List<Double> calificaciones = new ArrayList<>();
        String[] calificacionesArray = listaDeCalificaciones.split(",");
        for (String calificacionStr : calificacionesArray) {
            double calificacion = Double.parseDouble(calificacionStr);
            calificaciones.add(calificacion);
        }
        return calificaciones;
    }
}






