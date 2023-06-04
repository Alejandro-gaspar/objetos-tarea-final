package uaslp.objetos.figuras;

public class Figura implements DrawableItem{
    private String name;
    public Figura() {

    }

    public Figura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
