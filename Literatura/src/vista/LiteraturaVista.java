/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 * CAPA: VISTA — LiteraturaVista
 * Sistema adaptado para la base de datos de Literatura (Autores, Editoriales, Géneros)
 * @author Gustavo (Modificado para Base de Datos Literatura)
 */
public class LiteraturaVista extends JFrame {

    // --- Tabla ---
    private JTable tablaLiteratura;
    private DefaultTableModel modeloTabla;

    // --- Campos comunes (Presentes en las 3 tablas) ---
    private JTextField txtId, txtNombre;
    private JComboBox<String> cmbTipoEntidad;

    // --- Campos de la tabla: AUTORES ---
    private JTextField txtNacionalidad, txtFechaNacimiento, txtMuerte;

    // --- Campos de la tabla: EDITORIALES ---
    private JTextField txtSitioWeb, txtFechaEditorial, txtPais;

    // --- Campos de la tabla: GENEROS ---
    private JTextField txtTipoGenero, txtSubgenero, txtCreacion;

    // --- Botones CRUD ---
    private JButton btnAgregar, btnActualizar, btnEliminar, btnBuscar, btnLimpiar;

    // --- Panel dinámico con CardLayout ---
    private JPanel panelCamposEspecificos;
    private CardLayout cardLayout;

    public LiteraturaVista() {
        setTitle("Práctica 3: CRUD de Literatura — Patrón MVC");
        setSize(950, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setLayout(new BorderLayout(10, 10));

        // --- NORTH: Título del Sistema ---
        JPanel panelTitulo = new JPanel();
        panelTitulo.setBackground(new Color(41, 128, 185)); // Azul elegante para Literatura
        JLabel lblTitulo = new JLabel("Sistema de Gestión de Literatura — Práctica 3 (MVC)");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setForeground(Color.WHITE);
        panelTitulo.add(lblTitulo);
        add(panelTitulo, BorderLayout.NORTH);

        // --- CENTER: Tabla de Datos ---
        // Las columnas cambian de significado conceptual según la entidad, o el controlador puede reconfigurarlas
        modeloTabla = new DefaultTableModel(
            new String[]{"ID", "Nombre", "Dato Específico 1", "Dato Específico 2", "Dato Específico 3", "Entidad"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaLiteratura = new JTable(modeloTabla);
        tablaLiteratura.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaLiteratura.setRowHeight(25);

        JScrollPane scrollTabla = new JScrollPane(tablaLiteratura);
        scrollTabla.setPreferredSize(new Dimension(900, 250));
        add(scrollTabla, BorderLayout.CENTER);

        // --- SOUTH: Formulario y Botonera ---
        JPanel panelInferior = new JPanel(new BorderLayout(5, 5));
        panelInferior.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));
        panelInferior.add(crearPanelFormulario(), BorderLayout.CENTER);
        panelInferior.add(crearPanelBotones(), BorderLayout.SOUTH);
        add(panelInferior, BorderLayout.SOUTH);
    }

    private JPanel crearPanelFormulario() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setBorder(BorderFactory.createTitledBorder("Datos de la Entidad Literaria"));

        // Campos comunes a todas las tablas (ID, Nombre y Tipo)
        JPanel panelComun = new JPanel(new GridLayout(1, 6, 5, 5));

        panelComun.add(new JLabel("Gestionar:"));
        cmbTipoEntidad = new JComboBox<>(new String[]{"AUTOR", "EDITORIAL", "GENERO"});
        panelComun.add(cmbTipoEntidad);

        panelComun.add(new JLabel("ID (Buscar/Modificar):"));
        txtId = new JTextField();
        panelComun.add(txtId);

        panelComun.add(new JLabel("Nombre / Razón Social:"));
        txtNombre = new JTextField();
        panelComun.add(txtNombre);

        panel.add(panelComun, BorderLayout.NORTH);

        // Inicialización de Paneles específicos con CardLayout
        cardLayout = new CardLayout();
        panelCamposEspecificos = new JPanel(cardLayout);
        panelCamposEspecificos.setBorder(BorderFactory.createTitledBorder("Atributos Específicos de la Tabla"));

        // CARD 1: Autores
        JPanel panelAutor = new JPanel(new GridLayout(1, 6, 5, 5));
        panelAutor.add(new JLabel("Nacionalidad:"));
        txtNacionalidad = new JTextField();
        panelAutor.add(txtNacionalidad);
        panelAutor.add(new JLabel("Fecha Nac. (YYYY-MM-DD):"));
        txtFechaNacimiento = new JTextField();
        panelAutor.add(txtFechaNacimiento);
        panelAutor.add(new JLabel("Muerte/Defunción:"));
        txtMuerte = new JTextField();
        panelAutor.add(txtMuerte);
        panelCamposEspecificos.add(panelAutor, "AUTOR");

        // CARD 2: Editoriales
        JPanel panelEditorial = new JPanel(new GridLayout(1, 6, 5, 5));
        panelEditorial.add(new JLabel("Sitio Web:"));
        txtSitioWeb = new JTextField();
        panelEditorial.add(txtSitioWeb);
        panelEditorial.add(new JLabel("Fecha Ed. (YYYY-MM-DD):"));
        txtFechaEditorial = new JTextField();
        panelEditorial.add(txtFechaEditorial);
        panelEditorial.add(new JLabel("País:"));
        txtPais = new JTextField();
        panelEditorial.add(txtPais);
        panelCamposEspecificos.add(panelEditorial, "EDITORIAL");

        // CARD 3: Géneros
        JPanel panelGenero = new JPanel(new GridLayout(1, 6, 5, 5));
        panelGenero.add(new JLabel("Tipo Género:"));
        txtTipoGenero = new JTextField();
        panelGenero.add(txtTipoGenero);
        panelGenero.add(new JLabel("Subgénero:"));
        txtSubgenero = new JTextField();
        panelGenero.add(txtSubgenero);
        panelGenero.add(new JLabel("Época Creación:"));
        txtCreacion = new JTextField();
        panelGenero.add(txtCreacion);
        panelCamposEspecificos.add(panelGenero, "GENERO");

        panel.add(panelCamposEspecificos, BorderLayout.CENTER);
        return panel;
    }

    private JPanel crearPanelBotones() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnBuscar = new JButton("Buscar por ID");
        btnLimpiar = new JButton("Limpiar");

        // Paleta de colores visuales
        Color colorBtn = new Color(41, 128, 185);
        Color colorBtnEliminar = new Color(192, 57, 43);
        
        for (JButton btn : new JButton[]{btnAgregar, btnActualizar, btnBuscar, btnLimpiar}) {
            btn.setBackground(colorBtn);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setOpaque(true);
            btn.setBorderPainted(false);
        }
        btnEliminar.setBackground(colorBtnEliminar);
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setOpaque(true);
        btnEliminar.setBorderPainted(false);

        panel.add(btnAgregar);
        panel.add(btnActualizar);
        panel.add(btnEliminar);
        panel.add(btnBuscar);
        panel.add(btnLimpiar);

        return panel;
    }

    // ========================================================================
    // GETTERS — Acceso para el Controlador de Literatura
    // ========================================================================
    
    public JTable getTablaLiteratura() { return tablaLiteratura; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }

    // Componentes Comunes
    public JTextField getTxtId() { return txtId; }
    public JTextField getTxtNombre() { return txtNombre; }
    public JComboBox<String> getCmbTipoEntidad() { return cmbTipoEntidad; }

    // Getters Autores
    public JTextField getTxtNacionalidad() { return txtNacionalidad; }
    public JTextField getTxtFechaNacimiento() { return txtFechaNacimiento; }
    public JTextField getTxtMuerte() { return txtMuerte; }

    // Getters Editoriales
    public JTextField getTxtSitioWeb() { return txtSitioWeb; }
    public JTextField getTxtFechaEditorial() { return txtFechaEditorial; }
    public JTextField getTxtPais() { return txtPais; }

    // Getters Generos
    public JTextField getTxtTipoGenero() { return txtTipoGenero; }
    public JTextField getTxtSubgenero() { return txtSubgenero; }
    public JTextField getTxtCreacion() { return txtCreacion; }

    // Getters Botones
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnActualizar() { return btnActualizar; }
    public JButton getBtnEliminar() { return btnEliminar; }
    public JButton getBtnBuscar() { return btnBuscar; }
    public JButton getBtnLimpiar() { return btnLimpiar; }

    // CardLayout mecánico para alternar vistas
    public CardLayout getCardLayout() { return cardLayout; }
    public JPanel getPanelCamposEspecificos() { return panelCamposEspecificos; }

    // ========================================================================
    // MÉTODOS AUXILIARES DE INTERFAZ
    // ========================================================================

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public boolean confirmar(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje,
            "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public void limpiarFormulario() {
        txtId.setText("");
        txtNombre.setText("");
        
        // Limpieza Autores
        txtNacionalidad.setText("");
        txtFechaNacimiento.setText("");
        txtMuerte.setText("");
        
        // Limpieza Editoriales
        txtSitioWeb.setText("");
        txtFechaEditorial.setText("");
        txtPais.setText("");
        
        // Limpieza Géneros
        txtTipoGenero.setText("");
        txtSubgenero.setText("");
        txtCreacion.setText("");
        
        tablaLiteratura.clearSelection();
    }

    public Object getTablaProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}