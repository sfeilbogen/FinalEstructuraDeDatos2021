
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


//suponemos que habiendo realizado las clases pedidas en la consigna agregamos las que consideramos necesarias
// suponemoos que nosotros podemos manejar los datos por eso sugerimos utilizar el csv. que adjuntamos en la carpeta de este proyecto (la informacion es la misma)
public class Main{
	
// suponemos que no podemos estar mas de una vez en una misma cola por museo hasta ser atendida la cola
// suponemos que podemos estar al mismo tiempo en dos colas de distintos museos (suponemos que es cola virtual)
	public static Scanner in= new Scanner(System.in);
	public static void main (String[] args) {
            int soy;
            Listacliente listaclientes=new Listacliente();
            Listaticket listatickets=new Listaticket();
            Museos[] vectormuseos=new Museos[1046];
            vectormuseos=Read.vector();
            do {
                System.out.println("Seleccione el tipo de actor que eres: 1- Administrador, 2- Cliente, 3- Salir del menu general");
                soy = in.nextInt();
                switch (soy) {
                    case 1:
                        int opcion;
                        do {
                            //ADMINISTRADOR
                            System.out.println("Seleccione lo que desea realizar: 1- Atender clientes, 2-Consultar Tickets e ingresar clientes a un museo, 3- Salir del menu administrador ");
                            opcion = in.nextInt();
                            switch (opcion) {
                                case 1:
                                   
                                    System.out.println("Buscamos el museo a atender la cola de clientes");
                                    Museos museo = validoytraigomuseo(vectormuseos);
                                    museo.visualizamoscola();
                                    Museos.atendemosclientes(museo, listatickets);

                                    break;
                                case 2:
                                	
                                	
                                    System.out.println("Ingrese los datos del cliente que desea ingresar al museo: ");
                                    
                                    System.out.println("Ingrese el nombre:");
                                    String nombre = in.next();

                                    System.out.println("Ingrese el apellido:");
                                    String apellido = in.next();

                                    System.out.println("Ingrese el DNI (sin puntos):");
                                    int dni = in.nextInt();
                                    
                                    Cliente cliente =new Cliente(dni, nombre, apellido);
                                    if(!listaclientes.buscandocliente(dni,nombre,apellido)){
                                        System.out.println("El cliente no esta ingresado en la lista universal de clientes");
                                    }
                                    else{
                                        Museos museochequeo= validoytraigomuseo(vectormuseos);
                                        if(!listatickets.chequeoticket(cliente,museochequeo)){
                                            System.out.println("El cliente "+cliente.getNombre()+" "+cliente.getApellido()+" no tiene tickets para el museo seleccionado.");
                                        }
                                        else{
                                            System.out.println("El cliente "+cliente.getNombre()+" "+cliente.getApellido()+ " ha ingresado al museo seleccionado y su ticket sera eliminado ");
                                            listatickets.borronodoo(listatickets.getInicio(),null,museochequeo,cliente);
                                            }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Terminara el programa.");
                                    break;
                                default:
                                    System.out.println("Ha seleccionado un numero no correspondiente.lientes.");
                            }
                        }
                        
                        while (opcion != 3);
                        
                        break;

                    case 2:
                        //CLIENTE
                    	
                        System.out.println("Ingrese su nombre:");
                        String nombre = in.next();

                        System.out.println("Ingrese su apellido:");
                        String apellido = in.next();

                        System.out.println("Ingrese su DNI (sin puntos):");
                        int dni = in.nextInt();
                        
                        Cliente cliente =new Cliente(dni, nombre, apellido);
                        
                       
                        if (listaclientes.esVacia()){
                           
                            Nodocliente nodocliente=new Nodocliente(cliente);
                            listaclientes.agrego(nodocliente);
                        }
                        if(listaclientes.buscandocliente(dni,nombre,apellido) && listaclientes.getLongitud()>1){
                            //System.out.println("Usted ya existe como cliente");

                        }
                        else{System.out.println("Muchas gracias, ya lo hemos registrado al sistema.");
                            Nodocliente nodocliente=new Nodocliente(cliente);
                            listaclientes.agrego(nodocliente);}
                        
                        
                      
                        int opcion2;
                        do {
                            System.out.println("Ingrese la actividad que desee realizar: 1- Sacar entradas a un museo, 2- Consultar mis tickets, 3- Consultar posicion en alguna cola de algun museo 4- Cancelar adquisicion de tickets (salir de la cola), 5- Salir del menu cliente");
                            opcion2 = in.nextInt();
                            switch (opcion2) {
                                case 1:
                                    Museos museo = validoytraigomuseo(vectormuseos); 
                                    if(!Museos.buscoclienteencola(museo,cliente)){
                                    	museo.colaclientes.add(cliente);
                                    	museo.visualizamoscola();
                                    }
                                    else {
                                    	System.out.println("Usted ya se encuentra en la cola de este museo: "+museo);
                                    }
                                    break;
                                    
                                case 2:
                                    System.out.println("Si es que tiene tickets, los vera abajo: ");
                                    listatickets.muestroticketscliente(cliente);
                                    break;
                                    
                                case 3:
                                	
                                	System.out.println("¿De que museo quiere saber en que posicion se encuentra de la cola? ");
                                	Museos museo2 = validoytraigomuseo(vectormuseos);
                                	if(museo2.getColaclientes().contains(cliente)==false) {
                                		System.out.println("Usted no se encuentra en la cola del museo: "+ museo2);
                                	}
                                	else{
                                		Museos.buscoposicionescolas(museo2, cliente);
                                		museo2.visualizamoscola();
                                	}
                              
                                	break;
                                	
                                case 4:
                                	System.out.println("Seleccione el museo del cual quiere salir de la cola: ");
                                	
                                	Museos museo3 = validoytraigomuseo(vectormuseos);
                                	if(museo3.getColaclientes().contains(cliente)){   
                                		Museos.actualizocola(museo3,cliente);
                                		museo3.visualizamoscola();
                                	}
                                	else {
                                		System.out.println("Usted no puede salir de la cola ya que no se encuentra en la misma.");
                                		
                                		}
                                	
                                	break;
                                	
                                	
                                case 5:
                                    System.out.println("Lo enviaremos al menu principal.");
                                    break;
                                default:
                                    System.out.println("Ha seleccionado un numero no correspondiente.");
                            }
                        }
                        while (opcion2 != 5);
                        break;
                        
                    case 3:
                        System.out.println("Terminara el programa.");
                        break;
                        
                    default:
                        System.out.println("Ha seleccionado un numero no correspondiente");
                        break;
                }
            }
            while (soy != 3) ;
        }


        public static Museos validoytraigomuseo(Museos[] vectormuseo) {
            boolean esta=false;
            
            System.out.println("Ingrese la provincia en la que se encuentra el museo que desea seleccionar:");
            in.nextLine();
            String provincia = in.nextLine();
            System.out.println("Ahora ingrese la localidad en la que se encuentra el museo que desea seleccionar: ");
            String localidad = in.nextLine();
            
            
            esta=Museos.verificamosexistenciamuseo(vectormuseo,provincia, localidad);

            while (!esta) {
                System.out.println("Se ha producido un error, no se encuentra ningun museo en la localidad "+ localidad + " y provincia "+provincia);
                System.out.println("Ingrese la provincia en la que se encuentra el museo que desea seleccionar:");
                provincia = in.nextLine();
                System.out.println("Ahora ingrese la localidad en la que se encuentra el museo que desea seleccionar: ");
                localidad = in.nextLine();
                esta=Museos.verificamosexistenciamuseo(vectormuseo,provincia, localidad);

            }
            
            
            System.out.println("Ingrese el numero del museo que quiere seleccionar de la localidad "+localidad+" y de la provincia "+provincia);
            Museos.muestromuseos(vectormuseo,provincia, localidad);
            String numeromuseo=in.next();
            
            String respuesta;
            if(Museos.verificonummuseo(vectormuseo,numeromuseo)){
                System.out.println("Usted selecciono el museo siguiente: ");
                Museos.buscomuseo(vectormuseo,numeromuseo);
                System.out.println("¿Es correcto?");
                respuesta=in.next();}
            else{
                respuesta="no";
            }
            while (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Comenzamos el proceso de seleccion del museo nuevamente dadas la localidad y provincia seleccionadas");
                System.out.println("Museos disponibles para su localidad y provincia seleccionada: ");
                Museos.muestromuseos(vectormuseo,provincia, localidad);
                System.out.println("Ingrese nuevamente el numero del museo");
                numeromuseo=in.next();
                if(Museos.verificonummuseo(vectormuseo,numeromuseo)){
                    System.out.println("Usted ingreso al museo siguiente: ");
                    Museos.buscomuseo(vectormuseo,numeromuseo);
                    System.out.println("¿Es correcto?");
                    respuesta=in.next();


                }
                else{
                    respuesta="no";
                }
            }

            return Museos.metodotraigomuseo(vectormuseo,numeromuseo);
        }
}

