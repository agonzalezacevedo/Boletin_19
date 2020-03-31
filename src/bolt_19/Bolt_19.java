package bolt_19;

import javax.swing.JOptionPane;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt_19 {

    public static void main(String[] args) {
        int[][] matriz = new int[20][36];
        String[] equipos = {"RMF", "FCB", "VIL", "GRA", "ALV", "ATH", "RSO", "GTF", "VLC", "BTS", "OSA", "LEV", "SEV", "ATL", "EIB", "MAL", "CEL", "ESP", "VLL", "LEG"};
        String[] xornada = {"X1", "X2", "X3", "X4", "X5", "X6", "X7", "X8", "X9", "X10", "X11", "X12", "X13", "X14", "X15", "X16", "X17", "X18", "X19", "X20", "X21", "X22", "X23", "X24", "X25", "X26", "X27", "X28", "X29", "X30", "X31", "X32", "X33", "X34", "X35", "X36",};
        int opcion;
        Metodos obx = new Metodos();
        matriz = obx.crearTaboa(matriz);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("     Menu      "
                    + "\n1.Crear Tabla"
                    + "\n2.Salir"
                    + "\n3.Amosar Todo"
                    + "\n4.Amosar Media Alumno"
                    + "\n5.Amosar Media Modulo"));
            switch (opcion) {
                case 1:
                    matriz = obx.crearTaboa(matriz);
                    break;
                case 2:
                    obx.amosaTodo(matriz, equipos, xornada);
                    break;
                case 3:
                    obx.ordenarEquipos(matriz, equipos);
                    break;
                case 4:
                    obx.consultar(equipos, xornada, matriz);
                    break;
                case 5:
                    obx.buscarCantidadGolesEnJornada(equipos, xornada, matriz);
                    break;

            }
        } while (opcion != 3);

    }
}
