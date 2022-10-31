package rogger.guia.app.mavenarchivo.entity;

/**
 *
 * @author Kennedy Rogger Curisinche Guia
 */
public class Empleado {

        private String codigo;
        private String nombre;
        private String apellido;
        private Integer sueldo;

        public Empleado() {
        }

        public Empleado(String codigo, String nombre, String apellido, Integer sueldo) {
                this.codigo = codigo;
                this.nombre = nombre;
                this.apellido = apellido;
                this.sueldo = sueldo;
        }

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public Integer getSueldo() {
                return sueldo;
        }

        public void setSueldo(Integer sueldo) {
                this.sueldo = sueldo;
        }

}
