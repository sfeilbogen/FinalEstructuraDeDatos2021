public class Ticket {
    private Cliente cliente;
    private Museos museo;
    private int numticket;

    private static int cont=0;
    public Ticket(){cont=cont+1;}
    public Ticket(Cliente cliente,Museos museo){
        this.cliente=cliente;
        this.museo=museo;
       cont=cont+1;
        this.numticket=cont;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Museos getMuseo() {
        return museo;
    }

    public int getNumticket() {
        return numticket;
    }

    public void setNumticket(int numticket) {
        this.numticket = numticket;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMuseo(Museos museo) {
        this.museo = museo;
    }

 
    @Override
    public String toString() {
        return "Ticket: " +
                "DNI del cliente=" + cliente.getDni() +
                ", Espacio cultural ID del museo=" + Museos.ultimosnumeros(museo.getEspacio_cultural_id()) +
                ", numero de ticket=" + numticket;
    }
}
