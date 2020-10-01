package interfazCuentoInteractivo;

import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextoPorPartes extends TimerTask {
    private JTextArea areaTexto;
    private JButton si,no;
    private JLabel label;
    private char[] charArr;
    private String cad;
    private int n;
    private int act;
    
    /*
     * metodo que lee el texto
     * 
     */
    public TextoPorPartes(JTextArea areaTexto,String cad, JButton b1, JButton b2, 
    						JLabel lab, int action){
        this.areaTexto=areaTexto;
        si=b1;
        no=b2;
        label= lab;
        act=action;
        
        this.cad="";
        n=0;
        charArr= new char[cad.toCharArray().length];
        for (int i=0; i<cad.toCharArray().length;i++)
            charArr[i]=cad.charAt(i);
    }
    @Override
    /*
     * (non-Javadoc)
     * @see java.util.TimerTask#run()
     * 
     */
    public void run() {
        if(n<this.charArr.length){
            cad=cad+this.charArr[n];
            this.areaTexto.setText(cad);
            n++;
        }
        else if (act==0){
            si.setVisible(true);
            no.setVisible(true);
            label.setVisible(true);
            this.cancel();
        }
        
         else{
            si.setVisible(true);
            no.setVisible(false);
            label.setVisible(true);
            this.cancel();
        }
    }
}
