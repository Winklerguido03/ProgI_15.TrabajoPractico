import models.*;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static final Logger Log =
      Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {

    //PERROS
    Mascota perro1 = new Perro("Bobi", 2, "Pastor aleman", "Inquieto", "1", 30);
    Mascota perro2 = new Perro("Ben", 6, "Bulldog", "Tranquilo", "2", 30);
    Mascota perro3 = new Perro("Max", 3, "Golden retriever", "Jugueton", "3", 40);

    //GATOS
    Mascota gato1 = new Gato("Luna", 3, "Siberiano", "Dormilon", "4", 18);
    Mascota gato2 = new Gato("Tom", 5, "siames", "Agresivo", "5", 20);

    //DUEÑOS
    Duenio duenio1 = new Duenio("Juan", "3482123456");
    Duenio duenio2 = new Duenio("Pedro", "3482990022");
    Duenio duenio3 = new Duenio("Maria", "3482112233");
    Duenio duenio4 = new Duenio("Marta", "3482224466");
    Duenio duenio5 = new Duenio("Juana", "3482001122");

    duenio1.agregarMascota(perro1);
    duenio2.agregarMascota(perro2);
    duenio3.agregarMascota(perro3);
    duenio4.agregarMascota(gato1);
    duenio5.agregarMascota(gato2);

    //SERVICIOS
    Servicio servicio1 = new Banio();
    Servicio servicio2 = new CortePelo();
    Servicio servicio3 = new LimpiezaOidos();
    Servicio servicio4 = new ComboCompleto();
    Servicio servicio5 = new Banio();

    //TURNOS
    System.out.println("\nTurno 1:");
    Turno turno1 = new Turno(perro1, duenio1, servicio1, LocalDate.of(2025, 6, 19));
    turno1.confirmarTurno();
    turno1.mostrarDetalle();

    System.out.println("\nTurno 2:");
    Turno turno2 = new Turno(perro2, duenio2, servicio2, LocalDate.of(2025, 7, 1));
    turno2.confirmarTurno();
    turno2.mostrarDetalle();

    Turno turno3 = new Turno(perro3, duenio3, servicio3, LocalDate.of(2025, 6, 18));
    turno3.confirmarTurno();
    turno3.mostrarDetalle();

    //SOBRECARGA



    //SOBRESCRITURA
    System.out.println("\nPerro1:");
    perro1.mostrarFicha();
    System.out.println("\nGato1:");
    gato1.mostrarFicha();


  }
}