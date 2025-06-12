package models;

import java.time.LocalDate;

public class Turno {

  Mascota mascota;
  Duenio duenio;
  Servicio servicio;
  LocalDate fecha;

  public Turno(){}

  public Turno(Mascota mascota,Duenio duenio, Servicio servicio,LocalDate fecha){
    this.mascota=mascota;
    this.duenio=duenio;
    this.servicio=servicio;
    this.fecha=fecha;
  }

  public Turno(Mascota mascota, Servicio servicio,LocalDate fecha){
    this.mascota=mascota;
    this.servicio=servicio;
    this.fecha=fecha;
  }

  public Turno(Duenio duenio,LocalDate fecha){
    this.duenio=duenio;
    this.fecha=fecha;
  }


  public void confirmarTurno(){
    System.out.println("Turno confirmado para "+mascota.getNombre()+" el "+fecha);
  }

  public void mostrarDetalle(){
    System.out.println(toString());
  }

  public String toString(){
    return "Turno:"+
           "\nMascota:"+mascota.getNombre()+
           "\nDueño:"+duenio.getNombre()+
           "\nServicio:"+servicio.getClass().getName()+
           "\nFecha:"+fecha;
   }

}
