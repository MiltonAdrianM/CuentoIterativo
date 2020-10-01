package mundoNodosYArboles;

public class Decisiones extends Nodo implements mundoNodosYArbolesYInterfaces.IInterfaceArbol {
    private Nodo nodoActual;
    private Nodo raiz;
    
    /*
     * arbol de decisiones
     */
    public Decisiones(){
        raiz= new Nodo("quieres el principio: SI. ó ir a Egipto: NO");
      
        Nodo n1= new Nodo("quieres ir a siria: SI. ó China: NO");
        Nodo n11= new Nodo("Seguir yo solo:SI ó ir al dios de la sabiduria: NO");
        Nodo n111= new Nodo("");
        Nodo n112= new Nodo("");
        Nodo n12= new Nodo("ir al dios de la misericordia: SI. ó dios de la ambicion: NO");
        Nodo n121= new Nodo("");
        Nodo n122= new Nodo("");
        
        Nodo n2= new Nodo("ir al Nilo: SI. Otros  lugares: NO");
        Nodo n21= new Nodo("Irnos de Ahi: SI. ó Quedarnos: NO");
        Nodo n211= new Nodo("");
        Nodo n212= new Nodo("");
        Nodo n22= new Nodo("Ir al Planeta Franklin: SI. ó Ir al sol: NO");
        Nodo n221= new Nodo("");
        Nodo n222= new Nodo("");
     
        
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
    public void setNodoActual(Nodo nodoActual) {
        this.nodoActual= nodoActual;
    }

    @Override
    public Nodo getNodoActual() {
        return nodoActual;
    }
    
}
