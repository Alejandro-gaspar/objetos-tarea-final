package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{

    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados{
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public double getArea() {
        double n = numeroDeLados;
        double tanValue = Math.tan(Math.PI / n);
        return (n * lado * lado) / (4 * tanValue);
    }
    public String getName() {
        return "Poligono Regular";
    }
}
