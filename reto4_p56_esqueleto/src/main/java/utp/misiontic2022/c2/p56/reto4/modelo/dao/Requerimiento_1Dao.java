package utp.misiontic2022.c2.p56.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> resultados = new ArrayList<>();
        JDBCUtilities conexion = new JDBCUtilities();

        String queryMateriales = "SELECT mc.Nombre_Material, mc.Precio_Unidad, p.ID_Proyecto " +
                                "FROM MaterialConstruccion mc JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion " +
                                "JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto " +
                                "WHERE mc.Importado  = 'Si' AND p.Ciudad = 'Ibague' LIMIT 100";

        ResultSet resultadoMateriales = conexion.ejecutarConsulta(queryMateriales);

        while (resultadoMateriales.next()) {
            String nombreMaterial = resultadoMateriales.getString("Nombre_Material");
            int precioUnidad = resultadoMateriales.getInt("Precio_Unidad");
            int idProyecto = resultadoMateriales.getInt("ID_Proyecto");
            Requerimiento_1 filaResultado = new Requerimiento_1(nombreMaterial, precioUnidad, idProyecto);
            resultados.add(filaResultado);
        }

        return resultados;
    }
}
