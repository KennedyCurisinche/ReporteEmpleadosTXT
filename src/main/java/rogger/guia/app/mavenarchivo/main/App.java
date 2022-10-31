package rogger.guia.app.mavenarchivo.main;

import java.util.List;
import rogger.guia.app.mavenarchivo.entity.Empleado;
import rogger.guia.app.mavenarchivo.service.Archivo;

/**
 *
 * @author Kennedy Rogger Curisinche Guia
 */
public class App {

        public static void main(String[] args) {
                //instanciamos la clase servicio
                Archivo archivo = new Archivo();
                // Insertar en el archivo
//                Empleado empleado = new Empleado("AT003", "jorge", "soto", 1562);
//                archivo.guardar(empleado);
                // Imprimir el registro de empleados en el archivo
//                List<Empleado> empleados = archivo.listar();
//                
//                empleados.forEach(x -> {
//                        System.out.format("Codigo: %s - Nombre: %s - Apellido: %s - Sueldo: %d\n", 
//                                x.getCodigo(), x.getNombre(), x.getApellido(), x.getSueldo());
//                });
        }

}
