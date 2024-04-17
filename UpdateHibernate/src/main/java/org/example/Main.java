package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();

        // Seleccionamos la clase(Tabla) sobre la que se trabaja, en nuestro caso, Alumno.
        configuration.addAnnotatedClass(Alumno.class);

        // Indicamos el fichero de configuracion de hibernate.
        configuration.configure("hibernate.cfg.xml");

        // Creacion del objeto de tipo SessionFactory, que será el encargado de leer el fichero de configuración de Hibernate.
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // La sesión creada anteriormente, se albergará en esta variable de tipo Session, sobre esta trabajaremos con Hibernate.
        Session session = sessionFactory.openSession();

        // Indicamos que vamos a comenzar una transacción llamando al método beginTransation()
        session.beginTransaction();

        // El objeto que vamos a actualizar, pasando por referencia la clase Alumno y el ID a actualizar (deben haber datos ya en la tabla).
        Alumno alumno = session.get(Alumno.class, 7);

        // Como ya sabemos, utilizamos el set para darle un nuevo valor al Alumno que se quiera actualizar.
        alumno.setNombre("Mateo");
        alumno.setApellidos("Fuster Aleman");
        alumno.setEdad(18);

        // Acutualizamos el registro alumno, con los valores introducidos anteriormente por los setters.
        session.merge(alumno);

        // Confirmamos la transacción, es importante asegurarte de confirmar la transacción utilizando .commit(), esto nos garantiza la consistencia
        // de los datos y evita problemas de concurrencia.
        session.getTransaction().commit();

        // Cerramos Session y SessionFactory, como dice Gaspar "Lo ultimo que abro es lo primero que cierro..." la cabra si me preguntan.
        session.close();
        sessionFactory.close();
    }
}