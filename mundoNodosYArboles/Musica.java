
package mundoNodosYArboles;

public class Musica extends Nodo implements mundoNodosYArbolesYInterfaces.IInterfaceArbol  {

    private Nodo nodoActual;
    private Nodo raiz;
    
    /*
     * arbol de musica
     */
    public Musica(){
        raiz= new Nodo("src/Musica/Enya  Watermark.wav");
      
        Nodo n1= new Nodo("src/Musica/Enya It's In The Rain.wav");
        Nodo n11= new Nodo("src/Musica/Vangelis   conquest of paradise.wav");
        Nodo n111= new  Nodo("src/Musica/ENYA   a day without rain.wav");
        Nodo n112= new  Nodo("src/Musica/Enya   Only Time.wav");
        Nodo n12= new Nodo("src/Musica/Música Mágica New Age 2.wav");
        Nodo n121= new Nodo("src/Musica/Enya   White is in the winter night.wav");
        Nodo n122= new Nodo("src/Musica/Secret Garden   Once in a Red Moon.wav");
        
        Nodo n2= new Nodo("src/Musica/Secret Garden   Once in a Red Moon.wav");
        Nodo n21= new Nodo("src/Musica/Enya It's In The Rain.wav");
        Nodo n211= new Nodo("src/Musica/Música Mágica New Age 2.wav");
        Nodo n212= new Nodo("src/Musica/Vangelis   conquest of paradise.wav");
        Nodo n22= new Nodo("src/Musica/Enya   White is in the winter night.wav");
        Nodo n221= new Nodo("src/Musica/Enya   Only Time.wav");
        Nodo n222= new Nodo("src/Musica/Vangelis   conquest of paradise.wav");
        
        
        
        
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