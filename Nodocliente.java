
public class Nodocliente {
    Nodocliente siguiente;
    Cliente cliente;
    public Nodocliente()
    {}
    public Nodocliente(Cliente cliente)
    {
        this.siguiente=null;
        this.cliente=cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Nodocliente getSiguiente() {
        return siguiente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setSiguiente(Nodocliente siguiente) {
        this.siguiente = siguiente;

    }
    @Override
    public boolean equals(Object cliente) {
        String nombre;
        String apellido;
        int dni;
        nombre=((Cliente)cliente).getNombre();
        apellido=((Cliente)cliente).getApellido();
        dni=((Cliente)cliente).getDni();
        if (this.cliente.getNombre()==nombre &&this.cliente.getApellido()==apellido &&this.cliente.getDni()==dni ) {
            return true;
        }
        else {
            return false;
        }
    }

}

