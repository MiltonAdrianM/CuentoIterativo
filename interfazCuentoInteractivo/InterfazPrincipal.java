package interfazCuentoInteractivo;

import mundoLectorArchivos.LectorMusica;
import mundoLectorArchivos.LectorTextos;
import mundoNodosYArboles.Decisiones;
import mundoNodosYArboles.Imagenes;
import mundoNodosYArboles.Musica;
import mundoNodosYArboles.Posiciones;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 * @author Milton A. Monsalve
 * @author Hernan D. Giraldo
 * Esta es la clase donde está la interfaz principal 
 * la clse definiendo el menú de la aplicación
 * la interfaz
 * los botones de decision
 */
public class InterfazPrincipal extends JFrame implements ActionListener, WindowListener{
    
	//Atributos de la clase
    private JButton si, no;
    private JLabel imagen, pregunta;
    private JMenu edicion;
    private JMenuItem edicionTexto, creditos, stop;
    private JMenuBar barraMenu;
    private JScrollPane jScrollPane1; // asociar pequeña vista
    private JTextArea areaTexto;
    private Dimension tamPantalla;
        
    protected String cadArea;
    protected Timer timer;
    
    //intanciaciones
    LectorTextos lectorTextos = new LectorTextos();
    Decisiones arbolDecisiones = new Decisiones();
    Posiciones arbolPosiciones = new Posiciones();
    Imagenes arbolImagenes = new Imagenes();
    Musica arbolMusica = new Musica();
    LectorMusica musica = new LectorMusica();
    
    /*metodo para crear la interfaz , menu
     * 
     */
    public void crearInterfaz(){
        
        timer=new Timer();
        tamPantalla=Toolkit.getDefaultToolkit().getScreenSize();
               
        this.addWindowListener(this);
        
        jScrollPane1 = new JScrollPane();
        areaTexto = new JTextArea();
        imagen = new JLabel();
        pregunta = new JLabel();
        si = new JButton();
        no = new JButton();
        barraMenu = new JMenuBar();
        edicion = new JMenu();
        edicionTexto = new JMenuItem();
        creditos = new JMenuItem();
        stop = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        this.setMinimumSize(new Dimension(450,600));
        this.setPreferredSize(new Dimension(770,610));
        this.setLocation((int)((tamPantalla.getWidth()-this.getWidth()/2)/2), (int)((tamPantalla.getHeight()-this.getHeight())/2));
        this.setResizable(false);
        
        this.getContentPane().setBackground(new java.awt.Color(0, 0, 0));
        
        areaTexto.setEditable(true);
        areaTexto.setColumns(20);
        areaTexto.setLineWrap(true);
        areaTexto.setRows(5);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        areaTexto.setEditable(false);
        
        jScrollPane1.setViewportView(areaTexto);

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pregunta.setHorizontalAlignment(SwingConstants.CENTER);
        pregunta.setVisible(false);

        si.setFont(new java.awt.Font("Script MT Bold", 4, 18)); 
        si.setText("Si");
        si.setVisible(false);
        si.setActionCommand("Si");
        si.addActionListener(this);

        no.setFont(new java.awt.Font("Script MT Bold", 4, 18)); 
        no.setText("No");
        no.setVisible(false);
        no.setActionCommand("No");
        no.addActionListener(this);

        edicion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edicion.setText("Letra - Color - Creditos - Stop Music");
        edicion.setFont(new java.awt.Font("Segoe UI", 1, 14)); 

        edicionTexto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        edicionTexto.setText("Edición de Texto-Color");
        edicionTexto.setActionCommand("EdicionTexto");
        edicionTexto.addActionListener(this);
        
        creditos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        creditos.setText("Informacion Autores");
        creditos.setActionCommand("creditos");
        creditos.addActionListener(this);
        
        stop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        stop.setText("stop");
        stop.setActionCommand("stop music");
        stop.addActionListener(this);
                   
        edicion.add(edicionTexto);
        edicion.add(creditos); 
        edicion.add(stop);
        
        barraMenu.add(edicion);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,  350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap()));
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(pregunta)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap()));
        
        this.setMinimumSize(new Dimension(577,550));
        this.setVisible(true);
        pack();
    }
   
    @Override
    /*metodo para darle funcionalidad a los botones dentro de la interfaz
     * 
     * boton de edicion de texto
     * boton de informacion de autores
     * boton de parar canción
     * boton de cambio de escena "Si", " No"
     * boton para cerrar la aplicación
     *  
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("EdicionTexto")){
            InterfazEdicionTexto frameEdicionTexto = new InterfazEdicionTexto(this.areaTexto,this);
            frameEdicionTexto.crearInterfaz();
        }
        if (e.getActionCommand().equals("creditos")){
            JOptionPane.showMessageDialog(null, " AUTORES:"
            		+ "\n Milton Adrian Monsalve Correa"
            		+ "\n Hernan David Giraldo Pinzón."
            		+ "\n FACULTAD:"
            		+ "\n Ingenieria de Sistemas"
            		+ "\n AÑO:"
            		+ "\n 2016", "Creditos" , JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (e.getActionCommand().equals("stop music")){
        	LectorMusica mus = new LectorMusica();
        	musica.stop();
        }
        if (e.getActionCommand().equals("Si")){
            cambioEscena(0);
        }
        
        if (e.getActionCommand().equals("No")){
            cambioEscena(1);      
        }
        
        if (e.getActionCommand().equals("Cerrar")){
            System.exit(0);
        }
    }

    @Override
   /*metodo para llamar las imagenes, texto, sonido, e incializar el cuento
    * (non-Javadoc)
    * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
    */
    public void windowOpened(WindowEvent e) {
        imagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/0.jpg")));
        lectorTextos.establecerMarca("-----0");
        cadArea=lectorTextos.cadenaLeida();
        pregunta.setText(arbolDecisiones.getNodoActual().getDato());
        timer.scheduleAtFixedRate(new TextoPorPartes(areaTexto, cadArea, si, no, pregunta,0), 11,11);
        musica.inicializarClip("src/Musica/Enya  Watermark.wav");
        musica.play();
        musica.loop();
    }

    @Override
    public void windowClosing(WindowEvent e) {
       
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }    

    @Override
    public void windowIconified(WindowEvent e) {
    }    

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
/*metodo para cambio de escena,  
 * del arbol de decisiones, musica,
 * sonido
 * 
 */
    public void cambioEscena(int i){
        String themeSong="";
        int act= 0;
        themeSong=arbolMusica.getNodoActual().getDato();
         try{
                si.setVisible(false);
                no.setVisible(false);
                pregunta.setVisible(false);
                if (i==1){
                    arbolPosiciones.setNodoActual(arbolPosiciones.getNodoActual().getHd());
                    arbolDecisiones.setNodoActual(arbolDecisiones.getNodoActual().getHd());
                    arbolImagenes.setNodoActual(arbolImagenes.getNodoActual().getHd());
                    arbolMusica.setNodoActual(arbolMusica.getNodoActual().getHd());
                    lectorTextos.establecerMarca(arbolPosiciones.getNodoActual().getDato());
                }
                else{
                    arbolPosiciones.setNodoActual(arbolPosiciones.getNodoActual().getHi());
                    arbolDecisiones.setNodoActual(arbolDecisiones.getNodoActual().getHi());
                    arbolImagenes.setNodoActual(arbolImagenes.getNodoActual().getHi());
                    arbolMusica.setNodoActual(arbolMusica.getNodoActual().getHi());
                    lectorTextos.establecerMarca(arbolPosiciones.getNodoActual().getDato());
                }
                
                if (!themeSong.equalsIgnoreCase(arbolMusica.getNodoActual().getDato())){
                    musica.stop();
                    musica.inicializarClip(arbolMusica.getNodoActual().getDato());
                }
                
                musica.play();
                musica.loop();
                cadArea=lectorTextos.cadenaLeida();
                areaTexto.setText("");
                if (arbolPosiciones.getNodoActual().getHd()== null && arbolPosiciones.getNodoActual().getHi()==null){
                    pregunta.setText("FIN");
                    si.setText("Cerrar");
                    si.setActionCommand("Cerrar");
                    si.addActionListener(this);
                    pregunta.setText("Fin");
                    act=1;
                }
                else
                    pregunta.setText(arbolDecisiones.getNodoActual().getDato());
                
                imagen.setIcon(new ImageIcon(getClass().getResource(arbolImagenes.getNodoActual().getDato())));
                timer.scheduleAtFixedRate(new TextoPorPartes(areaTexto, cadArea, si, no, pregunta, act), 11, 11);
                
            }
            catch(NullPointerException e1){
                System.out.print("El cuento  ha terminado ");
            }
    }
 // --------------------------------------------------------------------------------------------
 	// Método main
 	// --------------------------------------------------------------------------------------------
     /**
      * Este método ejecuta la aplicación
      */
    public static void main(String[] args){
    	InterfazPrincipal iP = new InterfazPrincipal();
    	iP.crearInterfaz();
    }
}
