package uaslp.objetos.escuela;
import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String clave;
    private String claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaNacimiento;

    private Alumno(Builder builder) {
        this.nombre = builder.nombre;
        this.clave = builder.clave;
        this.claveDeCarrera = builder.claveDeCarrera;
        this.anioDeIngreso = builder.anioDeIngreso;
        this.fechaNacimiento = builder.fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Getters para los atributos
    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String nombre;
        private String clave;
        private String claveDeCarrera;
        private int anioDeIngreso;
        private LocalDate fechaNacimiento;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder clave(String clave) {
            this.clave = clave;
            return this;
        }

        public Builder claveDeCarrera(String claveDeCarrera) {
            this.claveDeCarrera = claveDeCarrera;
            return this;
        }

        public Builder anioDeIngreso(int anioDeIngreso) {
            this.anioDeIngreso = anioDeIngreso;
            return this;
        }

        public Builder fechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public Alumno build() {
            return new Alumno(this);
        }
    }
}
