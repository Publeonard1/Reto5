package utp.misiontic2022.c2.p56.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p56.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p56.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> resultados = controlador.consultarRequerimiento1();
            System.out.println("Nombre material-Precio unidad-Id del proyecto");
            for (int i = 0; i < resultados.size(); i++) {
                System.out.println(resultados.get(i).getNombreMaterial() + "-$" + resultados.get(i).getPrecioUnidad() + "-" + resultados.get(i).getIdProyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> resultados = controlador.consultarRequerimiento2();
            System.out.println("Proveedor-Ventas");
            for (int i = 0; i < resultados.size(); i++) {
                System.out.println(resultados.get(i).getProveedor() + "-" + resultados.get(i).getVentas());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> resultados = controlador.consultarRequerimiento3();
            System.out.println("Constructora-Costo de líderes");
            for (int i = 0; i < resultados.size(); i++) {
                System.out.println(resultados.get(i).getConstructora() + "-" + resultados.get(i).getCostoLideres());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}