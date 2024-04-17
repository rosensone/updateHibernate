package org.example;

import java.util.Date;

public class Alumno {
    private int ID;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private Date FechaNacimiento;

    public Alumno() {
    }
    public Alumno(int ID, String nombre, String apellidos, int edad, Date fechaNacimiento) {
        this.ID = ID;
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        FechaNacimiento = fechaNacimiento;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        return "Alumno{" +
                "ID=" + ID +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Edad=" + Edad +
                ", FechaNacimiento=" + FechaNacimiento +
                '}';
    }
}
