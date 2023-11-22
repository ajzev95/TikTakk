package vista;

import java.awt.Color;
import javax.swing.JLabel;
import modelo.Imagen;
import modelo.Jugador;
import modelo.Tablero;
import modelo.TipoImagen;

public class FormTikTac extends javax.swing.JFrame {
    
    public static Imagen imgJugadorEquis;
    public static Imagen imgJugadorCirculo;
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;
    
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;

    public FormTikTac(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
        imgJugadorEquis = jugadorEquis;
        imgJugadorCirculo = jugadorCirculo;
        nombreJugadorEquis = lblNombreJ1;
        nombreJugadorCirculo = lblNombreJ2;
        puntajeEquis = lblPuntajeJ1;
        puntajeCirculo = lblPuntajeJ2;
        tablero.cambiarEstilos(TipoImagen.EQUIS);
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0,0,0,0));
        
        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());
        
        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAnchoCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(14,19,43));
        tablero.setColorTablero(new Color(239,180,255));
        tablero.setLocation(40,150);
        tablero.createTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new modelo.Imagen();
        jugadorEquis = new modelo.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondo.setBackground(new java.awt.Color(13, 19, 43));
        panelFondo.setToolTipText("");
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        lblCierre.setBackground(new java.awt.Color(60, 63, 65));
        lblCierre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(370, 10, 16, 30);

        jugadorCirculo.setText("imagen1");
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        jugadorEquis.setText("imagen1");
        jugadorEquis.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        lblNombreJ2.setToolTipText("");
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30);

        lblNombreJ1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        lblNombreJ1.setToolTipText("");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30);

        lblPuntajeJ2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        panelFondo.add(jLabel2);
        jLabel2.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        getContentPane().add(panelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.red);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
