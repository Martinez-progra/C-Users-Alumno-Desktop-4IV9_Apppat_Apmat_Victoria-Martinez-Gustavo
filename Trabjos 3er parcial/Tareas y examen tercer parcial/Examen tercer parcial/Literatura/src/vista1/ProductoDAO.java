package vista1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Autor;
import modelo.ConexionBDS;
import modelo.Editorial;
import modelo.Genero;

public class ProductoDAO {

    // CREATE — Agregar 
    public void agregar(Object entidad) throws SQLException, Exception {
        String sql = "";
        if (entidad instanceof Autor) {
            sql = "INSERT INTO autores (nombre, nacionalidad, fecha_nacimiento, muerte) VALUES (?, ?, ?, ?)";
        } else if (entidad instanceof Editorial) {
            sql = "INSERT INTO editoriales (nombre, sitio_web, fecha_editorial, pais) VALUES (?, ?, ?, ?)";
        } else if (entidad instanceof Genero) {
            sql = "INSERT INTO generos (nombre, tipo_genero, subgenero, creacion) VALUES (?, ?, ?, ?)";
        }

        try (Connection conn = ConexionBDS.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            establecerParametros(ps, entidad);
            ps.executeUpdate();
        }
    }

    // UPDATE — Actualizar
    public void actualizar(Object entidad, int idBaseDatos) throws SQLException, Exception {
        String sql = "";
        if (entidad instanceof Autor) {
            sql = "UPDATE autores SET nombre = ?, nacionalidad = ?, fecha_nacimiento = ?, muerte = ? WHERE id_autor = ?";
        } else if (entidad instanceof Editorial) {
            sql = "UPDATE editoriales SET nombre = ?, sitio_web = ?, fecha_editorial = ?, pais = ? WHERE id_editorial = ?";
        } else if (entidad instanceof Genero) {
            sql = "UPDATE generos SET nombre = ?, tipo_genero = ?, subgenero = ?, creacion = ? WHERE id_genero = ?";
        }

        try (Connection conn = ConexionBDS.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            establecerParametros(ps, entidad);
            ps.setInt(5, idBaseDatos);
            ps.executeUpdate();
        }
    }

    // READ — Listar Todo
    public List<Autor> listarAutores() throws SQLException, Exception {
        List<Autor> lista = new ArrayList<>();
        String sql = "SELECT * FROM autores";
        try (Connection conn = ConexionBDS.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                lista.add(new Autor(
                    rs.getInt("id_autor"), 
                    rs.getString("nombre"), 
                    rs.getString("nacionalidad"), 
                    rs.getString("fecha_nacimiento"), 
                    rs.getString("muerte")
                ));
            }
        }
        return lista;
    }

    // READ — Buscar por ID
    public Autor buscarAutorPorId(int idAutor) throws SQLException, Exception {
        String sql = "SELECT * FROM autores WHERE id_autor = ?";
        try (Connection conn = ConexionBDS.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idAutor);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Autor(
                        rs.getInt("id_autor"),
                        rs.getString("nombre"),
                        rs.getString("nacionalidad"),
                        rs.getString("fecha_nacimiento"),
                        rs.getString("muerte")
                    );
                }
            }
        }
        return null;
    }

    // DELETE — Eliminar
    public void eliminarAutor(int idAutor) throws SQLException, Exception {
        String sql = "DELETE FROM autores WHERE id_autor = ?";
        try (Connection conn = ConexionBDS.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idAutor);
            ps.executeUpdate();
        }
    } 

    private void establecerParametros(PreparedStatement ps, Object entidad) throws SQLException {
        if (entidad instanceof Autor) {
            Autor a = (Autor) entidad;
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getNacionalidad());
            ps.setString(3, a.getFechaNacimiento()); 
            ps.setString(4, a.getMuerte());
        } else if (entidad instanceof Editorial) {
            Editorial e = (Editorial) entidad;
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getSitioWeb());
            ps.setDate(3, e.getFechaEditorial());
            ps.setString(4, e.getPais());
        } else if (entidad instanceof Genero) {
            Genero g = (Genero) entidad;
            ps.setString(1, g.getNombre());
            ps.setString(2, g.getTipoGenero());
            ps.setString(3, g.getSubgenero());
            ps.setString(4, g.getCreacion());
        }
    }

}

