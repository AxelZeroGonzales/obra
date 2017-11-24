/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.AsistenciaBLL;
import controller.EmpleadoBLL;
import controller.ObraBLL;
import controller.ObraEmpleadosBLL;
import entity.AsistenciaTO;
import entity.EmpleadoTO;
import entity.Obra;
import entity.ObraEmpleado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author proxc
 */
public class viewAsistencia extends javax.swing.JFrame implements Runnable {

    int z;
    TableColumn agregarColumn;
    String codigo;
     String hora,minutos,segundos;
 Thread hilo;

    /**
     * Creates new form Home15
     */
    public viewAsistencia() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
                lbfecha.setText(fecha());
        hilo = new Thread((Runnable) this);
        hilo.start();
        setVisible(true);
//        listaEmpleados();
        listaObras();
    }
public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
        hora =calendario.get(Calendar.HOUR_OF_DAY)>9?"" + calendario.get(Calendar.HOUR_OF_DAY):"0"+ calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?"" + calendario.get(Calendar.MINUTE):"0"+ calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?"" + calendario.get(Calendar.SECOND):"0"+ calendario.get(Calendar.SECOND);
    }
    public void run(){
        Thread currend =Thread.currentThread();
       // while(currend==hilo){
         //   hora();
           // lbhora.setText(hora+":" + minutos+":"+segundos);
           for (int i=1;i>0;i++){
               if(i>0){
                 hora();
           lbhora.setText(hora+":" + minutos+":"+segundos);  
               }
               
        
        }
    }
        public static String fecha(){
        Date fecha=new Date ();
        SimpleDateFormat formatofecha = new SimpleDateFormat ("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_vista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        obras = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLista1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        Acumuladas = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Tardanzas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_agregar1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        txthora2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        txtNombreObra = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        main.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(31, 97, 141));
        header.setPreferredSize(new java.awt.Dimension(838, 200));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 116, -1, -1));

        btn_vista.setBackground(new java.awt.Color(84, 153, 199));
        btn_vista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_vista.setForeground(new java.awt.Color(255, 255, 255));
        btn_vista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_vista.setText("Inicio");
        btn_vista.setOpaque(true);
        btn_vista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vistaMouseClicked(evt);
            }
        });
        header.add(btn_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 200, 146, 30));

        jLabel3.setBackground(new java.awt.Color(127, 179, 213));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 32, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Asistencia");
        header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 330, 80));

        jLabel17.setText("jLabel17");
        header.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BGAB_icon_211x211.png"))); // NOI18N
        header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 160));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DRYWALL FAMILY");
        header.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        home.setLayout(new java.awt.CardLayout());

        obras.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(26, 82, 118));
        jPanel6.setForeground(new java.awt.Color(255, 204, 204));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lista de Obras");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 30));

        tblLista.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblLista.setForeground(new java.awt.Color(51, 51, 51));
        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLista.setGridColor(new java.awt.Color(255, 255, 255));
        tblLista.setRowHeight(20);
        tblLista.setSelectionBackground(new java.awt.Color(26, 82, 118));
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListaMousePressed(evt);
            }
        });
        tblLista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblListaKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tblLista);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, 240));

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbhora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("00:00:00");
        jPanel2.add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 80, 36));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        lbfecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD/MM/YYYY");
        jPanel2.add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel16.setBackground(new java.awt.Color(31, 97, 147));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 32, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        tblLista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Fecha", "Hora de ingreso", "Hora de Salida", "Tardanzas"
            }
        ));
        tblLista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLista1MousePressed(evt);
            }
        });
        tblLista1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLista1KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tblLista1);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Horas Acumuladas:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Tardanzas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Acumuladas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tardanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Tardanzas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Acumuladas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105))
        );

        jPanel4.setBackground(new java.awt.Color(26, 82, 118));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Movimientos del Empleado");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombres:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dia:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 40, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hora de Ingreso:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, -1));
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hora de Salida:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 140, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre de la Obra:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        btn_agregar1.setBackground(new java.awt.Color(84, 153, 199));
        btn_agregar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_agregar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_agregar1.setText("Guardar");
        btn_agregar1.setOpaque(true);
        btn_agregar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregar1MouseClicked(evt);
            }
        });
        jPanel4.add(btn_agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 146, 30));
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 130, -1));
        jPanel4.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, -1));

        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });
        jPanel4.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, -1));
        jPanel4.add(txthora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, -1));
        jPanel4.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, -1));
        jPanel4.add(txtNombreObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, -1));

        jLabel19.setBackground(new java.awt.Color(31, 97, 147));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("X");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 32, -1));

        jLabel20.setBackground(new java.awt.Color(31, 97, 147));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("X");
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 32, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 141, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 990, 710));

        javax.swing.GroupLayout obrasLayout = new javax.swing.GroupLayout(obras);
        obras.setLayout(obrasLayout);
        obrasLayout.setHorizontalGroup(
            obrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obrasLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 487, Short.MAX_VALUE))
        );
        obrasLayout.setVerticalGroup(
            obrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        home.add(obras, "card3");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_headerMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_vistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vistaMouseClicked
            // TODO add your handling code here:
            listaObras();
        setLblColor(btn_vista);

        obras.setVisible(true);

    }//GEN-LAST:event_btn_vistaMouseClicked

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btn_agregar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregar1MouseClicked
        procesar();
    }//GEN-LAST:event_btn_agregar1MouseClicked

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void tblListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMousePressed
        int filaSeleccionada = this.tblLista.getSelectedRow();//Identificamos que fila ha sido seleccionada

        try {
            this.txtCodigo.setText(tblLista.getValueAt(filaSeleccionada, 0).toString());
            codigo=tblLista.getValueAt(filaSeleccionada, 0).toString();
                this.txtNombreObra.setText(tblLista.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
        }
        listaEmpleados();
        listaObras();
    }//GEN-LAST:event_tblListaMousePressed

    private void tblListaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblListaKeyReleased
       if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSeleccionada = this.tblLista.getSelectedRow();//Identificamos que fila ha sido seleccionada
            try {
                this.txtCodigo.setText(tblLista.getValueAt(filaSeleccionada, 0).toString());
                this.txtNombreObra.setText(tblLista.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_tblListaKeyReleased

    private void tblLista1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLista1KeyReleased
         if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSeleccionada = this.tblLista1.getSelectedRow();//Identificamos que fila ha sido seleccionada
            try {
                this.txtNombre.setText(tblLista1.getValueAt(filaSeleccionada, 0).toString());
                this.txtApellido.setText(tblLista1.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tblLista1KeyReleased

    private void tblLista1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLista1MousePressed
         int filaSeleccionada = this.tblLista1.getSelectedRow();//Identificamos que fila ha sido seleccionada

        try {
            this.txtNombre.setText(tblLista1.getValueAt(filaSeleccionada, 0).toString());
            codigo=tblLista1.getValueAt(filaSeleccionada, 0).toString();
                this.txtApellido.setText(tblLista1.getValueAt(filaSeleccionada, 1).toString());
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer datos de la tabla", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblLista1MousePressed

    // ------------switch between colors for Active/Inactive color
    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(31, 97, 141));
    }

    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(84, 153, 199));
    }

    //-----------End --------
    //Let's create staff options and Avoid data
    /**
     * @param  the command line arguments
     */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewAsistencia().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Acumuladas;
    private javax.swing.JTextField Tardanzas;
    private javax.swing.JLabel btn_agregar1;
    private javax.swing.JLabel btn_vista;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbhora;
    private javax.swing.JPanel main;
    private javax.swing.JPanel obras;
    private javax.swing.JTable tblLista;
    private javax.swing.JTable tblLista1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreObra;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txthora2;
    // End of variables declaration//GEN-END:variables
   AsistenciaTO asis;
   AsistenciaBLL asisp = new AsistenciaBLL();
    Obra ob;
    ObraBLL oob = new ObraBLL();
    ObraEmpleadosBLL obemp = new ObraEmpleadosBLL();
    ObraEmpleado obe;
    EmpleadoBLL oemp = new EmpleadoBLL();
    private void procesar(int opcion) {
        String msg = "";
        try {
            switch (opcion) {
                case 5:
                    
                    break;
                case 6:
                    oob.ObraActualizar(leerDatos2());
                    msg = "Obra actualizada con exito";
                    break;
                case 7:
                    oob.ObraEliminar(leerDatos2());
                    msg = "Obra eliminada con exito";
                    break;
                case 8:
                    verObra();
                    return;
            }
            JOptionPane.showMessageDialog(null, msg);
            listaEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void listaObras() {
        DefaultTableModel tabla = (DefaultTableModel) tblLista.getModel();
        tabla.setRowCount(0);
        try {
            List<Obra> lista = oob.ObraListar();
            for (Obra x : oob.ObraListar()) {
                Object[] fila = {x.getCodigo(), x.getNombre()};
                tabla.addRow(fila);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void listaEmpleados() {
        int i = this.tblLista.getSelectedRow();
        DefaultTableModel tabla = (DefaultTableModel) tblLista1.getModel();
        tabla.setRowCount(0);
        try {
            codigo = (String) tblLista.getValueAt(i, 0);
                List<EmpleadoTO> lista = oemp.EmpleadoListar3(codigo);
                for (EmpleadoTO x : oemp.EmpleadoListar3(codigo)) {
                    Object[] fila = { x.getNombre(), x.getApellido()};
                    tabla.addRow(fila);
                }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    


    private void procesar() {
    
        
    }
    

}