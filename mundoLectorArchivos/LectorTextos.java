package mundoLectorArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * clase donde llama el archivo
 */
public class LectorTextos implements mundoLectorArchivosYInterfaces.IInterfaceLectorTextos {
    private BufferedReader in;
    private FileReader texto;
        
    @Override
    /*
     * (non-Javadoc)
     * @see mundoLectorArchivosYInterfaces.IInterfaceLectorTextos#establecerMarca(java.lang.String)
     */
    public void establecerMarca(String pos) {
        try{
            texto=new FileReader("src/Docs/Cuento.txt");
            in=new BufferedReader(texto);
            while(!in.readLine().contains(pos))
                in.readLine();
            in.readLine();
            in.mark(1);
            in.reset();
        }
        catch(FileNotFoundException e1){
            System.out.print("No se encontro archivo");
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
        catch(NullPointerException e1){
            System.out.print("No se inicializo el BufferedReader ");
        }
    }
        
    @Override
    /*
     * (non-Javadoc)
     * @see mundoLectorArchivosYInterfaces.IInterfaceLectorTextos#cadenaLeida()
     */
    public String cadenaLeida(){
        String cad="";
        try{
            while(!in.readLine().contains("-----"))
                cad=cad+in.readLine();
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
        catch(NullPointerException e1){
            System.out.print("No se inicializo el BufferedReader");
        }
        return cad;
    }
   
}
