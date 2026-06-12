package vista1;

import modelo.Autor;
import vista1.ProductoDAO;
import vista.LiteraturaVista;
import modelo.ConexionBDS;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoControlador {

    private static final Logger LOG = Logger.getLogger(ProductoControlador.class.getName());

    private final ProductoDAO dao; 
    private final LiteraturaVista vista;

    private static final int COL_ID = 0;

    public ProductoControlador(ProductoDAO dao, LiteraturaVista vista) {
        this.dao   = dao;
        this.vista = vista;
        inicializarEventos();
        cargarTablaAutores(); 
    }

    private void inicializarEventos() {
        vista.getBtnAgregar()    .addActionListener(e -> agregar());
        vista.getBtnActualizar() .addActionListener(e -> actualizar());
        vista.getBtnEliminar()   .addActionListener(e -> eliminar());
        vista.getBtnBuscar()     .addActionListener(e -> buscar());
        vista.getBtnLimpiar()    .addActionListener(e -> vista.limpiarFormulario());

        vista.getTablaLiteratura().addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent e) {
                cargarSeleccionado();
            }
        });
    }

    private void cargarTablaAutores() {
        try {
            DefaultTableModel modelo = vista.getModeloTabla();
            modelo.setRowCount(0);
            
            List<Autor> lista = dao.listarAutores(); 
            for (Autor a : lista) {
                modelo.addRow(new Object[]{
                    a.getIdAutor(), 
                    a.getNombre(),
                    a.getNacionalidad(),
                    a.getFechaNacimiento(),
                    a.getMuerte()
                });
            }
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "Error al cargar la tabla", ex);
            vista.mostrarError("No se pudieron cargar los autores: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(ProductoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarSeleccionado() {
        int fila = vista.getTablaLiteratura().getSelectedRow();
        if (fila < 0) return;

        DefaultTableModel modelo = vista.getModeloTabla();
        int id = (int) modelo.getValueAt(fila, COL_ID);

        try {
            Autor autor = dao.buscarAutorPorId(id);
            if (autor != null) {
                vista.getTxtId()             .setText(String.valueOf(autor.getIdAutor())); 
                vista.getTxtNombre()         .setText(autor.getNombre());
                vista.getTxtNacionalidad()   .setText(autor.getNacionalidad());
                vista.getTxtFechaNacimiento().setText(autor.getFechaNacimiento() != null ? autor.getFechaNacimiento().toString() : "");
                vista.getTxtMuerte()         .setText(autor.getMuerte());
            }
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error al buscar autor seleccionado", ex);
        }
    }

    private void agregar() {
        try {
            Autor nuevo = construirAutorDesdeVista();
            if (nuevo == null) return; 

            dao.agregar(nuevo); 
            cargarTablaAutores();
            vista.limpiarFormulario();
            vista.mostrarMensaje("Autor agregado correctamente.");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "Error de SQL al agregar", ex);
            vista.mostrarError("Error de base de datos: " + ex.getMessage());
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error general al agregar", ex);
            vista.mostrarError("Error: " + ex.getMessage());
        }
    }

    private void actualizar() {
        String idTexto = vista.getTxtId().getText().trim();
        if (idTexto.isEmpty()) {
            vista.mostrarError("Selecciona un registro de la tabla antes de actualizar.");
            return;
        }
        try {
            int id = Integer.parseInt(idTexto);
            Autor modificado = construirAutorDesdeVista();
            if (modificado == null) return;

            dao.actualizar(modificado, id);
            cargarTablaAutores();
            vista.limpiarFormulario();
            vista.mostrarMensaje("Autor actualizado correctamente.");
        } catch (NumberFormatException ex) {
            vista.mostrarError("El ID no es válido.");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "Error al actualizar autor", ex);
            vista.mostrarError("Error al actualizar: " + ex.getMessage());
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error general al actualizar", ex);
            vista.mostrarError("Error: " + ex.getMessage());
        }
    }

    private void eliminar() {
        String idTexto = vista.getTxtId().getText().trim();
        if (idTexto.isEmpty()) {
            vista.mostrarError("Selecciona un registro de la tabla antes de eliminar.");
            return;
        }
        try {
            int id = Integer.parseInt(idTexto);
            dao.eliminarAutor(id);
            cargarTablaAutores();
            vista.limpiarFormulario();
            vista.mostrarMensaje("Autor eliminado correctamente.");
        } catch (NumberFormatException ex) {
            vista.mostrarError("El ID no es válido.");
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "Error al eliminar autor", ex);
            vista.mostrarError("Error al eliminar: " + ex.getMessage());
        } catch (Exception ex) {
            LOG.log(Level.SEVERE, "Error general al eliminar", ex);
            vista.mostrarError("Error: " + ex.getMessage());
        }
    }

    private void buscar() {
        String texto = vista.getTxtNombre().getText().trim();
        if (texto.isEmpty()) {
            cargarTablaAutores(); 
            return;
        }
        try {
            DefaultTableModel modelo = vista.getModeloTabla();
            modelo.setRowCount(0);
            
            for (Autor a : dao.listarAutores()) {
                if (a.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                    modelo.addRow(new Object[]{
                        a.getIdAutor(), 
                        a.getNombre(),
                        a.getNacionalidad(),
                        a.getFechaNacimiento(),
                        a.getMuerte()
                    });
                }
            }
        } catch (SQLException ex) {
            LOG.log(Level.SEVERE, "Error al buscar autores", ex);
        } catch (Exception ex) {
            Logger.getLogger(ProductoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Autor construirAutorDesdeVista() {
        try {
            Autor a = new Autor();
            a.setNombre(vista.getTxtNombre().getText().trim());
            a.setNacionalidad(vista.getTxtNacionalidad().getText().trim()); 
            
            
            
            a.setMuerte(vista.getTxtMuerte().getText().trim());
            return a;
        } catch (IllegalArgumentException e) {
            vista.mostrarError("El formato de fecha debe ser AAAA-MM-DD (Ej: 1995-12-25)");
            return null;
        }
    }
}