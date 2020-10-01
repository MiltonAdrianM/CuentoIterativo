package mundoNodosYArboles;

public class Imagenes extends Nodo implements mundoNodosYArbolesYInterfaces.IInterfaceArbol{
    private Nodo nodoActual;
    private Nodo raiz;
    
    /*
     * arbol de imagenes
     */
    public Imagenes(){
        raiz= new Nodo("/Imagenes/0.jpg");
        Nodo n1= new Nodo("/Imagenes/1.gif");
        Nodo n11= new Nodo("/Imagenes/11.gif");
        Nodo n111= new Nodo("/Imagenes/111.jpg");
        Nodo n112= new Nodo("/Imagenes/112.jpg");
        Nodo n12= new Nodo("/Imagenes/12.gif");
        Nodo n121= new Nodo("/Imagenes/121.gif");
        Nodo n122= new Nodo("/Imagenes/122.jpg");
        
        Nodo n2= new Nodo("/Imagenes/2.gif");
        Nodo n21= new Nodo("/Imagenes/21.gif");
        Nodo n211= new Nodo("/Imagenes/211.gif");
        Nodo n212= new Nodo("/Imagenes/1.jpg");
        Nodo n22= new Nodo("/Imagenes/22.gif");
        Nodo n221= new Nodo("/Imagenes/221.jpg");
        Nodo n222= new Nodo("/Imagenes/222.jpg");
       
        
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
