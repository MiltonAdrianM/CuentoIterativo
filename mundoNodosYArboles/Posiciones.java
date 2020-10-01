package mundoNodosYArboles;

	/*
	 * clase de las posiciones de los Nodos
	 */
public class Posiciones extends Nodo implements mundoNodosYArbolesYInterfaces.IInterfaceArbol {
    private Nodo nodoActual;
    private Nodo raiz;
    
    /*
     * arbol de posiciones
     */
    public Posiciones(){
        raiz= new Nodo("-----0");
        Nodo n1= new Nodo("-----1");
        Nodo n11= new Nodo("-----1.1");
        Nodo n111= new Nodo("-----1.1.1");
        Nodo n112= new Nodo("-----1.1.2");
        Nodo n12= new Nodo("-----1.2");
        Nodo n121= new Nodo("-----1.2.1");
        Nodo n122= new Nodo("-----1.2.2");
        Nodo n2= new Nodo("-----2");
        Nodo n21= new Nodo("-----2.1");
        Nodo n211= new Nodo("-----2.1.1");
        Nodo n212= new Nodo("-----2.1.2");
        Nodo n22= new Nodo("-----2.2");
        Nodo n221= new Nodo("-----2.2.1");
        Nodo n222= new Nodo("-----2.2.2");
       
       
  
      
        raiz.setHi(n1);
        raiz.setHd(n2);
        
        n1.setHi(n11);
        n1.setHd(n12);
        n11.setHi(n111);
        n11.setHd(n112);
        n12.setHi(n121);
        n12.setHd(n122);
        
        n2.setHi(n21);
        n2.setHd(n22);
        n21.setHi(n211);
        n21.setHd(n212);
        n22.setHi(n221);
        n22.setHd(n222);
        
        
        nodoActual=raiz;
    }
    
    @Override
    /*
     * (non-Javadoc)
     * @see mundoNodosYArbolesYInterfaces.IInterfaceArbol#setNodoActual(mundoNodosYArboles.Nodo)
     */
    public void setNodoActual(Nodo nodoActual) {
        this.nodoActual= nodoActual;
    }

    @Override
    /*
     * (non-Javadoc)
     * @see mundoNodosYArbolesYInterfaces.IInterfaceArbol#getNodoActual()
     */
    public Nodo getNodoActual() {
        return nodoActual;
    }
}