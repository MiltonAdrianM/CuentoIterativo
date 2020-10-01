package interfazCuentoInteractivo;

import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class InterfazEdicionTexto extends JFrame implements ActionListener, ListSelectionListener, MouseListener,WindowListener{
      private JButton aplicar, aceptar;
      private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5;
      private JList listaTipoTexto, listaEstiloTexto, listaTamañoTexto;
      private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3;
      private JTextArea textArea;
      private JFrame frame1;
      
      private String fontType;
      private int fontStyle, fontHuge;
      
      public InterfazEdicionTexto(JTextArea areaTexto, JFrame ven){
          textArea = areaTexto;
          frame1=ven;
      }
           
      public void crearInterfaz(){
          aplicar = new javax.swing.JButton();
          aceptar = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          listaTipoTexto = new javax.swing.JList();
          jScrollPane2 = new javax.swing.JScrollPane();
          listaEstiloTexto = new javax.swing.JList();
          jScrollPane3 = new javax.swing.JScrollPane();
          listaTamañoTexto = new javax.swing.JList();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          
          this.setResizable(false);
          this.addWindowListener(this);
          
          this.textArea=textArea;
          
          // aplicar el texto 
          aplicar.setText("Aplicar");
          aplicar.setActionCommand("Aplicar");
          aplicar.addActionListener(this);
          
          // seleccionamos el texto
          aceptar.setText("Aceptar");
          aceptar.setActionCommand("Aceptar");
          aceptar.addActionListener(this);

          // trae la lista de textos
          listaTipoTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
          listaTipoTexto.setModel(new javax.swing.AbstractListModel() {
              String[] strings = { "Arial", "Segoe Print", "Georgia", "Batang", "Microsoft PhagsPa", "Viner Hand ITC", "Cambria", "Comic Sans MS", "Tahoma", "Times New Roman" };
              public int getSize() { return strings.length; }
              public Object getElementAt(int i) { return strings[i]; }});
          
          listaTipoTexto.addListSelectionListener(this);
          listaTipoTexto.setSelectedIndex(listaTipoTexto.getMinSelectionIndex());
          jScrollPane1.setViewportView(listaTipoTexto);

          listaEstiloTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
          listaEstiloTexto.setModel(new javax.swing.AbstractListModel() {
              String[] strings = { "Plano", "Negrita", "Cursiva", "Cursiva con negrita" };
              public int getSize()
              { return strings.length; }
              public Object getElementAt(int i) { return strings[i]; }});
          
          listaEstiloTexto.addListSelectionListener(this);
          listaEstiloTexto.setSelectedIndex(listaEstiloTexto.getMinSelectionIndex());
          jScrollPane2.setViewportView(listaEstiloTexto);

          listaTamañoTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
          listaTamañoTexto.setModel(new javax.swing.AbstractListModel() {
              String[] strings = { "3", "5", "8", "10", "12", "14", "18", "24", "36", "48" };
              public int getSize() { return strings.length; }
              public Object getElementAt(int i) { return strings[i]; }});
          
          listaTamañoTexto.addListSelectionListener(this);
          listaTamañoTexto.setSelectedIndex(listaTamañoTexto.getMinSelectionIndex());
          jScrollPane3.setViewportView(listaTamañoTexto);

          jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          jLabel1.setText("Ejemplo de letra");
          jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

          jLabel2.setText("Tipo de letra");

          jLabel3.setText("Estilo de letra");

          jLabel4.setText("Tamaño de letra");

          jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
          jLabel5.setForeground(new java.awt.Color(0, 0, 204));
          jLabel5.setText("Modificar color de letra");
          jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          jLabel5.addMouseListener(this);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addContainerGap())
                      .addGroup(layout.createSequentialGroup()
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel2))
                          .addGap(18, 18, 18)
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jLabel3))
                          .addGap(18, 18, 18)
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                  .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                  .addGap(51, 51, 51)
                                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                      .addComponent(aplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                      .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                      .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                              .addComponent(jLabel4))
                          .addGap(0, 42, Short.MAX_VALUE)))));
          
          layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(34, 34, 34)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(jLabel2)
                      .addComponent(jLabel3)
                      .addComponent(jLabel4))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addGroup(layout.createSequentialGroup()
                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                          .addGap(18, 18, 18))
                      .addGroup(layout.createSequentialGroup()
                          .addComponent(jLabel5)
                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(aplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                          .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addGap(46, 46, 46)))
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                  .addGap(25, 25, 25)));
          
          this.setVisible(true);
          pack();
      }
      
    
    @Override
    /*
     * (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
     public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Aplicar"))
            textArea.setFont(new Font(fontType, fontStyle, fontHuge));
        if(e.getActionCommand().equals("Aceptar"))
            frame1.setEnabled(true);
            this.setVisible(false);
     }
    @Override
    /*
     * (non-Javadoc)
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     */
    public void valueChanged(ListSelectionEvent e) {
        try{
            fontType= String.valueOf(this.listaTipoTexto.getSelectedValue());
            fontStyle = this.listaEstiloTexto.getSelectedIndex();
            fontHuge = Integer.parseInt(String.valueOf(this.listaTamañoTexto.getSelectedValue()));
            this.jLabel1.setFont(new Font(fontType, fontStyle, fontHuge));
        }
        catch(java.lang.NumberFormatException e1){
            e1.getCause();
        }
        
       
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    /*
     * (non-Javadoc)
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    public void mousePressed(MouseEvent e) {
        InterfazEdicionColor edicionColor = new InterfazEdicionColor(this.textArea,this);
        edicionColor.crearInterfaz();
        this.setEnabled(false);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        this.setVisible(false);
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
 }
