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
    Servicio servicioBanio = new Banio();
    Servicio servicioCortePelo = new CortePelo();
    Servicio servicioLimpiezaOidos = new LimpiezaOidos();
    Servicio servicioComboCompleto = new ComboCompleto();
    Servicio servicio5 = new Banio();

    //TURNOS
    System.out.println("\nTurno 1:");
    Turno turno1 = new Turno(perro1, duenio1, servicioBanio, LocalDate.of(2025, 6, 19));
    turno1.confirmarTurno();
    turno1.mostrarDetalle();

    System.out.println("\nTurno 2:");
    Turno turno2 = new Turno(perro2, duenio2, servicioCortePelo, LocalDate.of(2025, 7, 1));
    turno2.confirmarTurno();
    turno2.mostrarDetalle();

    Turno turno3 = new Turno(perro3, duenio3, servicioLimpiezaOidos, LocalDate.of(2025, 6, 18));
    turno3.confirmarTurno();
    turno3.mostrarDetalle();

    //APLICAR SERVICIOS Y MOSTRAR COSTOS
    servicioBanio.aplicarServicio(perro1);
    System.out.println("Precio del servicio:"+servicioBanio.calcularPrecio(perro1));
    servicioCortePelo.aplicarServicio(perro1);
    System.out.println("Precio del servicio:"+servicioCortePelo.calcularPrecio(perro1));
    servicioLimpiezaOidos.aplicarServicio(perro1);
    System.out.println("Precio del servicio:"+servicioLimpiezaOidos.calcularPrecio(perro1));
    servicioComboCompleto.aplicarServicio(perro2);
    System.out.println("Precio del servicio:"+servicioComboCompleto.calcularPrecio(perro2));

    //SOBRECARGA
  Turno turnoViernes=new Turno(perro3,servicioCortePelo,LocalDate.of(2025,6,13));
  Turno turnoMartes=new Turno(duenio1,LocalDate.of(2025,6,17));

    //SOBRESCRITURA
    System.out.println("Perro 1:");
   perro1.mostrarFicha();
    System.out.println("Perro 2:");
   perro2.mostrarFicha();

   //FINAL ID
    System.out.println("\nPerro 1 id:"+perro1.getId());

    //POLIMORFISMO CON INTERFAZ SERVICIO
    Servicio[] servicios = {
        new Banio(),
        new CortePelo(),
        new LimpiezaOidos(),
        new ComboCompleto()
    };

    for (int i=0;i< servicios.length;i++){
      servicios[i].aplicarServicio(perro1);
      System.out.println("Costo: $" + servicios[i].calcularPrecio(perro1));
      System.out.println("---------------------");
    }



  }
}