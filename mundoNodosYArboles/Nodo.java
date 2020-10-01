package mundoNodosYArboles;

/*
 * clase Nodo
 * 
 */
public class Nodo implements mundoNodosYArbolesYInterfaces.IInterfaceNodo
{	
	/*
	 * atrivutos de la clase
	 * @Nodo hi
	 * @Nodo hd
	 * String dato
	 */
    private String dato;
    private Nodo hi;
    private Nodo hd;
    
    public Nodo(){
        dato=null;
        hi=null;
        hd=null;
    }
    public Nodo(String dato){
        this.dato=dato;
        hi=null;
        hd=null;
    }
    // Creacion de los metodos get
    /*
     * (non-Javadoc)
     * @see mundoNodosYArbolesYInterfaces.IInterfaceNodo#getDato()
     */
    public String getDato(){
        return dato;
    }
    
    public Nodo getHi(){
        return hi;
    }
    
    public Nodo getHd(){
        return hd;
    }
    
    //Creacion de los metodos set
    /*
     * (non-Javadoc)
     * @see mundoNodosYArbolesYInterfaces.IInterfaceNodo#setDato(java.lang.String)
     */
    public void setDato(String dat){
        dato=dat;
    }
    
    public void setHi(Nodo  nodo){
        hi=nodo;
    }
    
    public void setHd(Nodo  nodo){
        hd=nodo;
    }

    
    
}
