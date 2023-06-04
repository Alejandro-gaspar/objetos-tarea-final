package uaslp.objetos.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea()throws BaseNoProvistaException,AlturaNoProvistaException {
        if(base==0){
            throw new BaseNoProvistaException();
        }
        if(altura==0){
            throw new AlturaNoProvistaException();
        }
        return (base * altura) / 2;
    }
    public String getDescription() {
        return "Cualquier triangulo";
    }
}
