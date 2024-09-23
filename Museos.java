import java.util.Objects;
import java.util.Queue;
import java.util.LinkedList;

public class Museos {
    private String espacio_cultural_id;
    private String provincia_id;
    private String localidad_id;
    private String observaciones;
    private String provincia;
    private String localidad;
    private String nombre;
    private String mail;
    private String web;
    private String juridiccion;
    private String anio_de_creacion;
    private String descripcion_de_patrimonio;
    private String anio_de_inaguracion;
    public Queue<Cliente>colaclientes=new LinkedList<>();



    public Museos(){}

    public Museos(String espacio_cultural_id, String provincia_id,String localidad_id, String provincia, String localidad, String nombre){
        this.espacio_cultural_id=  espacio_cultural_id;
        this.provincia_id= provincia_id;
        this.localidad_id= localidad_id;
        this.provincia=provincia;
        this.localidad=localidad;
        this.nombre=nombre;
    }

    public Museos(Queue<Cliente>colacliente,String espacio_cultural_id,String provincia_id,String localidad_id,String observaciones,String provincia,String localidad,String nombre, String mail,String web,String juridiccion,String anio_de_creacion, String descripcion_de_patrimonio,String anio_de_inaguracion){
        this.espacio_cultural_id=espacio_cultural_id;
        this.provincia=provincia;
        this.localidad=localidad;
        this.localidad_id=localidad_id;
        this.observaciones=observaciones;
        this.provincia_id=provincia_id;
        this.nombre=nombre;
        this.mail=mail;
        this.web=web;
        this.juridiccion=juridiccion;
        this.anio_de_inaguracion=anio_de_inaguracion;
        this.anio_de_creacion=anio_de_creacion;
        this.descripcion_de_patrimonio=descripcion_de_patrimonio;

    }

    public Museos (String espacio_cultural_id, String provincia_id) {
        this.espacio_cultural_id=espacio_cultural_id;
        this.provincia_id= provincia_id;
    }

    public String getEspacio_cultural_id() {
        return espacio_cultural_id;
    }
    public String getProvincia_id() {
        return provincia_id;
    }
    public String getLocalidad_id() {
        return localidad_id;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMail() {
        return mail;
    }
    public String getWeb() {
        return web;
    }
    public String getJuridiccion() {
        return juridiccion;
    }
    public String getAnio_de_creacion() {
        return anio_de_creacion;
    }
    public String getDescripcion_de_patrimonio() {
        return descripcion_de_patrimonio;
    }
    public String getAnio_de_inaguracion() {
        return anio_de_inaguracion;
    }
    public Queue<Cliente> getColaclientes() {
        return colaclientes;
    }
    public void setColaclientes(LinkedList<Cliente> colaclientes) {
        this.colaclientes = colaclientes;
    }


    public void setEspacio_cultural_id(String espacio_cultural_id) {
        this.espacio_cultural_id = espacio_cultural_id;
    }
    public void setProvincia_id(String provincia_id) {
        this.provincia_id = provincia_id;
    }
    public void setLocalidad_id(String localidad_id) {
        this.localidad_id = localidad_id;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setWeb(String web) {
        this.web = web;
    }
    public void setJuridiccion(String juridiccion) {
        this.juridiccion = juridiccion;
    }
    public void setAnio_de_creacion(String anio_de_creacion) {
        this.anio_de_creacion = anio_de_creacion;
    }
    public void setDescripcion_de_patrimonio(String descripcion_de_patrimonio) {
        this.descripcion_de_patrimonio = descripcion_de_patrimonio;
    }
    public void setAnio_de_inaguracion(String anio_de_inaguracion) {
        this.anio_de_inaguracion = anio_de_inaguracion;
    }

    @Override
    public String toString() {
        return "Nombre museo=" + nombre+", Espacio cultural ID=" + ultimosnumeros(espacio_cultural_id) + ", Provincia ID=" + provincia_id
                + ", Localidad ID=" + localidad_id + ", Observaciones=" + observaciones + ", Provincia=" + provincia
                + ", Localidad=" + localidad + ", Mail=" + mail + ", Web=" + web
                + ", Jurisdiccion=" + juridiccion + ", Anio de creacion=" + anio_de_creacion
                + ", Descripcion de patrimonio=" + descripcion_de_patrimonio + ", Anio de inaguracion="
                + anio_de_inaguracion;
    }



    public static boolean verificamosexistenciamuseo(Museos museos[], String provincia, String localidad) {
        boolean esta=false;
        for(int i=0;i<museos.length;i++) {
            if(museos[i].getLocalidad().equalsIgnoreCase(localidad) && museos[i].getProvincia().equalsIgnoreCase(provincia)) {
                esta=true;
            }


        }
        return esta;

    }

    public static void muestromuseos(Museos museos[], String provincia, String localidad) {
        for(int i=0;i<museos.length-1;i++) {
            if(museos[i].getLocalidad().equalsIgnoreCase(localidad) && museos[i].getProvincia().equalsIgnoreCase(provincia)) {
                System.out.println("Museo numero: "+ultimosnumeros(museos[i].getEspacio_cultural_id()));
                System.out.println(museos[i]);
            }


        }
    }

    public static void buscomuseo(Museos museos[], String numeromuseo) {
      String a;
    	for(int i=0;i<museos.length;i++) {
        	a=ultimosnumeros(museos[i].getEspacio_cultural_id());
            if(a.equals(numeromuseo)) {
                System.out.println("Museo numero: "+ ultimosnumeros(museos[i].getEspacio_cultural_id()));
                System.out.println(museos[i]);
            }


        }
    }
    
public static String ultimosnumeros(String numero) {
    	
    	String ultimos="";
    	if (numero.length() > 6) 
    	{
    		ultimos = numero.substring(numero.length() - 6);
    	} 
    	else
    	{
    		ultimos = numero;
    	}
    	
    	return ultimos;
    }
    public static boolean verificonummuseo(Museos museos[], String numeromuseo) {
        boolean esta=false;
        String a;
        for(int i=0;i<museos.length;i++) {
        	a=ultimosnumeros(museos[i].getEspacio_cultural_id());
            if(a.equals(numeromuseo)) {
                esta=true;
            }


        }
        return esta;

    }
   
    public static Museos metodotraigomuseo(Museos museos[], String numeromuseo) {
        Museos museo= new Museos();
        String a;
        for(int i=0;i<museos.length;i++) {
        	a=ultimosnumeros(museos[i].getEspacio_cultural_id());
            if(a.equals(numeromuseo)) {
                museo=museos[i];

            }


        }
        return museo;
    }

	

    public void visualizamoscola() {
        System.out.println("Los clientes en la cola hasta ahora son: ");
        for (Cliente i : this.colaclientes) {
            System.out.println(i);
        }
    }

    public static void atendemosclientes(Museos museo, Listaticket ticketslista) {
       
        if (museo.colaclientes.isEmpty()) {
            System.out.println("No hay nadie en esta cola para atender. ");
        } else {
            while(!museo.colaclientes.isEmpty()) {
                System.out.println("Atendemos el siguiente cliente " + museo.colaclientes.peek());
                Ticket ticket = new Ticket(museo.colaclientes.poll(), museo);
                System.out.println("Se le ha asignado el ticket: "+ticket);
                Nodoticket nodo = new Nodoticket(ticket);
                ticketslista.agrego(nodo);
               
            }
        }
    }
    public static void buscoposicionescolas(Museos museos,Cliente cliente) {
    	
 
        if (museos.colaclientes.isEmpty()) {
            System.out.println("No se encuentra usted en esta cola del museo: "+ museos);
        } else {
        	int count=1;
        	for (Cliente i : museos.colaclientes) {
        		if(i.equals(cliente)) {
        			System.out.println("Usted se encuentra en la posicion: "+count);}
        			count++;
        			
            
    }}}
    
    
public static boolean buscoclienteencola(Museos museos,Cliente cliente) {
    	
    	boolean esta=false;
        if (museos.colaclientes.isEmpty()) {
            esta=false;
        } else {
        	
        	for (Cliente i : museos.colaclientes) {
        		if(i.equals(cliente)) {
        			esta=true;
        			
            }
        	
    }}
        return esta;
        }
   

	public static void actualizocola(Museos museo, Cliente cliente) {
	    Queue<Cliente> ayuda= new LinkedList<>();
	    while(!museo.colaclientes.isEmpty()){
	            if(!museo.colaclientes.peek().equals(cliente)){
	            	
	              ayuda.add(museo.colaclientes.poll());
	                
	            }
	            else{
	                System.out.println("Se esta removiendo a: "+cliente);
	                museo.colaclientes.remove(cliente);
	            }
	        }
	        for(Cliente i:ayuda){
	            museo.colaclientes.add(i);
	        }
	        System.out.println("Ahora la cola de museo actualizada es ");
	        System.out.println(museo.colaclientes);
	    }
	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Museos museos = (Museos) o;
        return espacio_cultural_id.equals(museos.espacio_cultural_id) && provincia_id.equals(museos.provincia_id) && localidad_id.equals(museos.localidad_id) && Objects.equals(observaciones, museos.observaciones) && provincia.equals(museos.provincia) && localidad.equals(museos.localidad) && nombre.equals(museos.nombre) && Objects.equals(mail, museos.mail) && Objects.equals(web, museos.web) && Objects.equals(juridiccion, museos.juridiccion) && Objects.equals(anio_de_creacion, museos.anio_de_creacion) && Objects.equals(descripcion_de_patrimonio, museos.descripcion_de_patrimonio) && Objects.equals(anio_de_inaguracion, museos.anio_de_inaguracion) && Objects.equals(colaclientes, museos.colaclientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(espacio_cultural_id, provincia_id, localidad_id, observaciones, provincia, localidad, nombre, mail, web, juridiccion, anio_de_creacion, descripcion_de_patrimonio, anio_de_inaguracion, colaclientes);
    }
}