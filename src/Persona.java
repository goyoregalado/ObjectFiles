import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int age;

    public Persona(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                '}';
    }
}
