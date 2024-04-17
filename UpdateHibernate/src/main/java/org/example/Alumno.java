package org.example;


import jakarta.persistence.*;

/**
 * Con @Entity marcamos que esta clase será una entidad de la base de datos.
 * Con @Table indicamos el nombre de la tabla de la base de datos con la que se va a trabajar
 * IMPORTANTE --> el nombre de este parámetro debe ser IDENTICO al de nuestra base de datos, de lo contrario, no funcionará o creará una tabla nueva.
 */
@Entity
@Table (name = "alumno")
public class Alumno {

    /**
     * Con @Id marcamos que este atributo sera el identificador de la tabla.
     * Con @GeneratedValue indicamos que este atributo será autoincremental.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * Con @Column hacemos referencia al nombre de la columna de la tabla de la base de datos, como hemos dicho antes, este nombre
     * deberá ser IDENTICO al de nuestra base de datos.
     */
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellidos")
    private String apellidos;
    @Column(name = "edad")
    private int edad;


    /**
     * CONSTRUCTOR VACÍO
     */
    public Alumno() {
     this.id = 0;
     this.nombre = "";
     this.apellidos = "";
     this.edad = 0;
    }

    /**
     *
     * @param id del alumno
     * @param nombre del alumno
     * @param apellidos del alumno
     * @param edad del alumno
     */
    public Alumno(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //GETTER & SETTER
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * METODO TO STRING
     * @return clase Alumno en formato String (NO IMPRIME).
     */
    @Override
    public String toString() {
        return "Alumno{" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", Edad=" + edad +
                ", FechaNacimiento=" +
                '}';
    }
}
