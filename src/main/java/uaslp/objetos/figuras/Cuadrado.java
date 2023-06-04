package uaslp.objetos.figuras;

public class Cuadrado  extends Figura{
    private double lado;
    public Cuadrado() {
        this.lado = 0;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() throws LadoNoProvistoException {
        if(lado==0.0){
            throw new LadoNoProvistoException();
        }
        return lado * lado;
    }
    public String getName() {
        return "Cuadrado";
    }
}
