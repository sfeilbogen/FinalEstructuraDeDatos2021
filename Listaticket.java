public class Listaticket {
    private Nodoticket inicio;
    private int longitud;

    public Listaticket() {
    }

    public Listaticket(Nodoticket inicio, int longitud) {
        this.inicio = inicio;
        this.longitud = longitud;
    }

    public Nodoticket getInicio() {
        return inicio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setInicio(Nodoticket inicio) {
        this.inicio = inicio;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esVacia() {
        if (this.inicio == null) {
            return true;
        } else
            return false;
    }

    public void mostrarlista() {
        if (this.esVacia()
        ) {
            System.out.println("la lista esta vacia:");
        } else {
            Nodoticket busco = new Nodoticket();
            busco = this.inicio;
            int i = 0;
            while (i < this.longitud) {
                System.out.println(busco.getTicket()
                );
                i++;
                busco = busco.getSiguiente();
            }
        }
    }

    public void agrego(Nodoticket nodo) {
        if (this.esVacia()) {
            setInicio(nodo);
            longitud++;
        } else {
            if (!this.buscar(nodo.getTicket())) {
                nodo.setSiguiente(this.inicio);
                this.inicio = nodo;
                longitud++;

            } else {
                System.out.println("el cliente ya se encuentra en la lista");
            }
        }

    }

    public boolean buscar(Ticket ticket) {
        Nodoticket ticket2 = this.inicio;
        boolean verdad = false;
        while (ticket2 != null) {
            if (ticket2.equals(ticket)) {
                verdad = true;
            }
            ticket2 = ticket2.getSiguiente();
        }
        return verdad;

    }
    
    public boolean chequeoticket(Cliente cliente, Museos museo) {
        boolean encontrado = false;
        Nodoticket aux = this.inicio;
        while (aux != null) {
            if (cliente.equals(aux.getTicket().getCliente()) && museo.equals(aux.getTicket().getMuseo())) {
                encontrado = true;
                break;
            } else {
                aux = aux.siguiente;
            }
        }
        return encontrado;

    }

    public void borronodoo(Nodoticket nodo, Nodoticket anterior, Museos museos, Cliente cliente) {
        if (inicio.getTicket().getMuseo().equals(museos) && inicio.getTicket().getCliente().equals(cliente)) {
            inicio = inicio.getSiguiente();
            longitud--;
        } else {
            while (nodo != null) {
                if (nodo.getTicket().getMuseo().equals(museos) && nodo.getTicket().getCliente().equals(cliente)) {
                    if (nodo.getSiguiente() == null) {
                        nodo.setSiguiente(null);
                    } else {
                        anterior.setSiguiente(nodo.getSiguiente());
                    }
                    longitud--;
                }
                anterior = nodo;
                nodo = nodo.getSiguiente();
            }
        }
    }
    public void muestroticketscliente(Cliente cliente) {
        Nodoticket aux = this.inicio;
        boolean bande=false;
        while (aux != null) {
            if (cliente.equals(aux.getTicket().getCliente())) {
                System.out.println(aux.getTicket());
                bande=true;
                aux=aux.getSiguiente();
            } else {
                aux = aux.siguiente;
            }
        }
        if (!bande){
            System.out.println("Usted no tiene tickets. ");
        }

    }
}