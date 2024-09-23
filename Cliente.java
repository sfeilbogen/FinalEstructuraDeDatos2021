
import java.util.Objects;

public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    
    public Cliente(){}
    public Cliente(int dni,String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "DNI=" + dni +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return dni == cliente.dni && nombre.equals(cliente.nombre) && apellido.equals(cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido);
    }
}
