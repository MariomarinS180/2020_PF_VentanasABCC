/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas_ABCC;

import conexionPostgreSQL.Conexion;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class Ventana extends javax.swing.JFrame {
    ResultSet rs;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null); //CODIGO PARA ESTABLECER FIJA LA VENTANA       
        tablaLibros();
        rellanarCombo();
        cajaIDLibro.setEnabled(false);
        //comboBoxRegistrador.removeAllItems();
        ArrayList <String> lista = new ArrayList <String>();
        lista = conexionPostgreSQL.Conexion.llenar_combo(); 
        for (int i = 0; i <lista.size(); i++) {
            comboBoxRegistrador.addItem(lista.get(i));
        }
    }

    public void tablaLibros() {
        DefaultTableModel modelo = (DefaultTableModel) tablaBDLibros.getModel();
        modelo.setRowCount(0);
        rs = conexionPostgreSQL.Conexion.Consulta("SELECT * FROM Libros");
        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getInt(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getInt(4));
                v.add(rs.getInt(5));
                v.add(rs.getString(6));
                v.add(rs.getInt(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getInt(10));
                modelo.addRow(v);
                tablaBDLibros.setModel(modelo);
            }
        } catch (Exception e) {
        }
    }
    public void rellanarCombo() {
        for (int i = 1900; i <= 2020; i++) {
            comboBoxAnioEdicion.addItem(String.valueOf(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_soloSeAdmitenNumeros = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JLabel();
        cajaEditoral = new javax.swing.JTextField();
        txtAutor = new javax.swing.JLabel();
        cajaAutor = new javax.swing.JTextField();
        txtGenero = new javax.swing.JLabel();
        txtIDLibro = new javax.swing.JLabel();
        cajaPaisAutor = new javax.swing.JTextField();
        txtNumeroDePaginas = new javax.swing.JLabel();
        cajaNumPaginas = new javax.swing.JTextField();
        txtAnioEdicion = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        txtRegistrador = new javax.swing.JLabel();
        comboBoxRegistrador = new javax.swing.JComboBox<>();
        botonRegistrar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonRestablecer = new javax.swing.JButton();
        txtPaisAutor1 = new javax.swing.JLabel();
        cajaIDLibro = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        cajaGenero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBDLibros = new javax.swing.JTable();
        comboBoxAnioEdicion = new javax.swing.JComboBox<>();
        botonRegresar = new javax.swing.JButton();
        labelBanner = new javax.swing.JLabel();
        labelFondoGris = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_soloSeAdmitenNumeros.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lbl_soloSeAdmitenNumeros.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(lbl_soloSeAdmitenNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 30));

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Ingrese el Nombre del Libro");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });
        jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));

        txtEditorial.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtEditorial.setForeground(new java.awt.Color(255, 255, 255));
        txtEditorial.setText("Ingrese la Editorial");
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        cajaEditoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEditoralActionPerformed(evt);
            }
        });
        cajaEditoral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaEditoralKeyTyped(evt);
            }
        });
        jPanel1.add(cajaEditoral, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, -1));

        txtAutor.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setText("Ingrese el Autor");
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        cajaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAutorActionPerformed(evt);
            }
        });
        jPanel1.add(cajaAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 151, 30));

        txtGenero.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setText("Ingrese el Género");
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 110, 20));

        txtIDLibro.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtIDLibro.setForeground(new java.awt.Color(255, 255, 255));
        txtIDLibro.setText("Código del libro");
        jPanel1.add(txtIDLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        cajaPaisAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPaisAutorActionPerformed(evt);
            }
        });
        jPanel1.add(cajaPaisAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 130, 30));

        txtNumeroDePaginas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtNumeroDePaginas.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroDePaginas.setText("Número de Páginas");
        jPanel1.add(txtNumeroDePaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cajaNumPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumPaginasActionPerformed(evt);
            }
        });
        cajaNumPaginas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNumPaginasKeyTyped(evt);
            }
        });
        jPanel1.add(cajaNumPaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        txtAnioEdicion.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtAnioEdicion.setForeground(new java.awt.Color(255, 255, 255));
        txtAnioEdicion.setText("Año de Edición");
        jPanel1.add(txtAnioEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("Precio");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 10));

        cajaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(cajaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 130, 30));

        txtRegistrador.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtRegistrador.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistrador.setText("¿Quién es el trabajador?");
        jPanel1.add(txtRegistrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 20));

        comboBoxRegistrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción..." }));
        comboBoxRegistrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRegistradorActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxRegistrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, 20));

        botonRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        botonRegistrar.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseClicked(evt);
            }
        });
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 30));

        botonModificar.setBackground(new java.awt.Color(255, 255, 0));
        botonModificar.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 120, 30));

        botonRestablecer.setBackground(new java.awt.Color(51, 51, 255));
        botonRestablecer.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        botonRestablecer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restablecer.png"))); // NOI18N
        botonRestablecer.setText("RESTABLECER COMPONENTES");
        botonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestablecerActionPerformed(evt);
            }
        });
        jPanel1.add(botonRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 220, 30));

        txtPaisAutor1.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        txtPaisAutor1.setForeground(new java.awt.Color(255, 255, 255));
        txtPaisAutor1.setText("País del Autor");
        jPanel1.add(txtPaisAutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        cajaIDLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDLibroActionPerformed(evt);
            }
        });
        jPanel1.add(cajaIDLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 150, 30));

        botonEliminar.setBackground(new java.awt.Color(204, 0, 0));
        botonEliminar.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 120, 30));
        jPanel1.add(cajaGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 160, 30));

        tablaBDLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre_Libro", "Editorial", "Páginas", "Año Edición", "Genero", "Precio", "Autor_Libro", "País_Autor", "Trabajador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBDLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBDLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBDLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 570, 100));

        comboBoxAnioEdicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el año..." }));
        jPanel1.add(comboBoxAnioEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 160, 30));

        botonRegresar.setBackground(new java.awt.Color(255, 255, 255));
        botonRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        botonRegresar.setText("REGRESAR");
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        labelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Centro de registro.jpg"))); // NOI18N
        jPanel1.add(labelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        labelFondoGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        labelFondoGris.setText("jLabel1");
        jPanel1.add(labelFondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 580, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxRegistradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRegistradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRegistradorActionPerformed

    private void cajaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioActionPerformed

    private void cajaNumPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumPaginasActionPerformed

    private void cajaPaisAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPaisAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPaisAutorActionPerformed

    private void cajaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAutorActionPerformed

    private void cajaEditoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEditoralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaEditoralActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaIDLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDLibroActionPerformed

    private void botonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestablecerActionPerformed
        // TODO add your handling code here:
        if (cajaAutor.getText().equals("") && cajaEditoral.getText().equals("") && cajaGenero.getText().equals("")
                && cajaIDLibro.getText().equals("") && cajaNombre.getText().equals("") && cajaNumPaginas.getText().equals("")
                && cajaPaisAutor.getText().equals("") && cajaPrecio.getText().equals("") && comboBoxRegistrador.getSelectedIndex() == 0
                && comboBoxAnioEdicion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(getParent(), "NO HAY NADA QUE REESTABLECER", "¡PSST!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            cajaAutor.setText("");
            cajaEditoral.setText("");
            cajaGenero.setText("");
            cajaIDLibro.setText("");
            cajaNombre.setText("");
            cajaNumPaginas.setText("");
            cajaPaisAutor.setText("");
            cajaPrecio.setText("");
            comboBoxRegistrador.setSelectedIndex(0);
            comboBoxAnioEdicion.setSelectedIndex(0);
            comboBoxRegistrador.setEnabled(true);
        }
    }//GEN-LAST:event_botonRestablecerActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void cajaEditoralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaEditoralKeyTyped
        // Validacion de la caja editorial (primera caja) 
        char validacion = evt.getKeyChar();
        if (Character.isDigit(validacion)) {
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cajaEditoralKeyTyped

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        // Validacion de la caja nombre (segunda caja) 
        char validacion = evt.getKeyChar();
        if (Character.isDigit(validacion)) {
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaNumPaginasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNumPaginasKeyTyped
        // Validacion de la caja nombre (tercer caja) 
        char validacion = evt.getKeyChar();
        if (Character.isLetter(validacion)) {
            //getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_cajaNumPaginasKeyTyped

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseClicked
        
    }//GEN-LAST:event_botonRegistrarMouseClicked

    private void tablaBDLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBDLibrosMouseClicked
        // TODO add your handling code here:
        int select = tablaBDLibros.rowAtPoint(evt.getPoint());
            cajaIDLibro.setText(String.valueOf(tablaBDLibros.getValueAt(select, 0)));
            cajaNombre.setText(String.valueOf(tablaBDLibros.getValueAt(select, 1)));
            cajaEditoral.setText(String.valueOf(tablaBDLibros.getValueAt(select, 2)));
            cajaNumPaginas.setText(String.valueOf(tablaBDLibros.getValueAt(select, 3)));
            comboBoxAnioEdicion.setSelectedItem(String.valueOf(tablaBDLibros.getValueAt(select, 4)));
            cajaGenero.setText(String.valueOf(tablaBDLibros.getValueAt(select, 5)));
            cajaPrecio.setText(String.valueOf(tablaBDLibros.getValueAt(select, 6)));
            cajaAutor.setText(String.valueOf(tablaBDLibros.getValueAt(select, 7)));
            cajaPaisAutor.setText(String.valueOf(tablaBDLibros.getValueAt(select, 8)));
            comboBoxRegistrador.setSelectedItem(String.valueOf(tablaBDLibros.getValueAt(select, 9)));
            comboBoxRegistrador.setEnabled(false);
               
    }//GEN-LAST:event_tablaBDLibrosMouseClicked

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
      //Este metodo no fue de gran utilidad
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        // TODO add your handling code here:
        if (cajaIDLibro.getText().equals("")){
            JOptionPane.showMessageDialog(getParent(), "PRIMERO DEBE SELECCIONAR UN REGISTRO", "¡PSST!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
        VentanaInicio vi = new VentanaInicio(); 
        vi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresarMouseClicked

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonRestablecer;
    private javax.swing.JTextField cajaAutor;
    private javax.swing.JTextField cajaEditoral;
    private javax.swing.JTextField cajaGenero;
    private javax.swing.JTextField cajaIDLibro;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaNumPaginas;
    private javax.swing.JTextField cajaPaisAutor;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JComboBox<String> comboBoxAnioEdicion;
    private javax.swing.JComboBox<String> comboBoxRegistrador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBanner;
    private javax.swing.JLabel labelFondoGris;
    private javax.swing.JLabel lbl_soloSeAdmitenNumeros;
    private javax.swing.JTable tablaBDLibros;
    private javax.swing.JLabel txtAnioEdicion;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JLabel txtEditorial;
    private javax.swing.JLabel txtGenero;
    private javax.swing.JLabel txtIDLibro;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroDePaginas;
    private javax.swing.JLabel txtPaisAutor1;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtRegistrador;
    // End of variables declaration//GEN-END:variables
}
