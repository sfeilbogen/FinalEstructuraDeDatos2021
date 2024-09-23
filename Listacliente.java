  public class Listacliente {
        private Nodocliente inicio;
        private int longitud;

        public Listacliente()
        {}
        public Listacliente(Nodocliente inicio, int longitud)
        {
            this.inicio=inicio;
            this.longitud=longitud;
        }
        public Nodocliente getInicio() {
            return inicio;
        }
        public int getLongitud() {
            return longitud;
        }
        public void setInicio(Nodocliente inicio) {
            this.inicio = inicio;
        }
        public void setLongitud(int longitud) {
            this.longitud = longitud;
        }
        public boolean esVacia() {
            if(this.inicio==null) {
                return true;
            }
            else
                return false;
        }
        public void agrego(Nodocliente nodo) {
            if(this.esVacia()) {
            setInicio(nodo);
            longitud++;
        }
		else{
            if(this.buscar(nodo.getCliente())==false) {
                nodo.setSiguiente(this.inicio);
                this.inicio=nodo;
                longitud++;

            }}

    }
        public boolean buscar(Cliente cliente) {
            Nodocliente cliente2=this.inicio;
            boolean verdad=false;
            while(cliente2!=null) {
                if(cliente2.equals(cliente)) {
                    verdad=true;
                }
                cliente2=cliente2.getSiguiente();
            }
            return verdad;

        }

        public void mostrarlista()
        {
            if(this.esVacia()
            ) {
                System.out.println("la lista esta vacia:");
            }
            else{
                Nodocliente busco= new Nodocliente();
                busco=this.inicio;
                int i=0;
                while(i<this.longitud)
                {
                    System.out.println(busco.getCliente()
                    );
                    i++;
                    busco=busco.getSiguiente();
                }
            }}
        public boolean buscandocliente(int dni,String nombre,String apellido){
            boolean encontrado=false;
            Nodocliente aux=this.inicio;
            while (aux!=null){
                if(dni==aux.getCliente().getDni() && nombre.equals(aux.getCliente().getNombre())&& apellido.equals(aux.getCliente().getApellido())){
                    encontrado=true;
                    break;
                }
                else{
                    aux=aux.siguiente;
                }
            }
            return encontrado;
        }


    }

