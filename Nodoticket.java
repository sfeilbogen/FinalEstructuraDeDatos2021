
public class Nodoticket {
        Nodoticket siguiente;
        Ticket ticket;
        public Nodoticket(){}
        public Nodoticket(Ticket ticket){
            this.siguiente=null;
            this.ticket=ticket;
        }

        public Ticket getTicket() {
            return ticket;
        }

        public Nodoticket getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodoticket siguiente) {
            this.siguiente = siguiente;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }



    }


