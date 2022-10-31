package rogger.guia.app.mavenarchivo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import rogger.guia.app.mavenarchivo.entity.Empleado;

/**
 *
 * @author Kennedy Rogger Curisinche Guia
 */
public class Archivo {

        private final String URL = "D:\\";
        private final String ARCHIVO = URL + "empleado.txt";

        public List<Empleado> listar() {
                List<Empleado> empleados = new ArrayList<>();

                try {
                        BufferedReader br = new BufferedReader(new FileReader(new File(ARCHIVO)));
                        String linea = "";
                        String data[] = new String[4];
                        while ((linea = br.readLine()) != null) {                                
                                data = linea.split(";");
                                empleados.add(new Empleado(data[0], data[1], data[2], Integer.parseInt(data[3])));
                        }
                } catch (IOException e) {
                        System.out.println("No se cargo archivo");
                }

                return empleados;
        }

        public void guardar(Empleado empleado) {
                try {
                        PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, true));
                        StringBuffer linea = new StringBuffer();
                        linea.append(empleado.getCodigo()).append(";");
                        linea.append(empleado.getNombre()).append(";");
                        linea.append(empleado.getApellido()).append(";");
                        linea.append(empleado.getSueldo());
                        pw.println(linea);

                        pw.close();
                } catch (IOException e) {
                        System.out.println("No se cargo archivo");
                }
        }
}
