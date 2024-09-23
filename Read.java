
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Read {
    public static void main(String[] args) {
        vector();
    }

    public static Museos[] vector() {
        String file = "C:\\Users\\Familia feliz\\eclipse-workspace\\final\\src\\Museos.csv"; // aca hay que reemplazar la dirección de memoria en la que se encuentra el archivo de museos. recomiendo meterlo dentro del src del proyecto de Java
        BufferedReader reader = null;
        String line;
        Museos museos[] = new Museos[1046];
        Queue<Cliente> colaclientes = new LinkedList<>();

        try {
            reader = new BufferedReader(new FileReader(file));
            int cont = 0;
            
            while ((line = reader.readLine()) != null) {
                String[] columna = line.split(",");
               
                if (cont > 0 && cont < 1047) {
                   
                    Museos museo1 = new Museos(colaclientes,columna[0], columna[1], columna[2], columna[3], columna[4], columna[5], columna[6], columna[11], columna[12], columna[16], columna[17], columna[18], "1901");
                    
                    museos[cont - 1] = museo1;
                    
                }
                cont++;


            }
         

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return museos;
    }
}

