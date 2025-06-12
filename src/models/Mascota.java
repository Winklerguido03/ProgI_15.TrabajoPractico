package models;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Mascota {

  private String nombre;
  private int edad;
  private String raza;
  private String comportamiento;
  private final String id;

  protected Mascota(String idd){
    id = idd;
  }

  protected Mascota(String nombre,int edad,String raza,String comportamiento,String id){
    this.nombre=nombre;
    this.edad=edad;
    this.raza=raza;
    this.comportamiento=comportamiento;
    this.id=id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getComportamiento() {
    return comportamiento;
  }

  public void setComportamiento(String comportamiento) {
    this.comportamiento = comportamiento;
  }

  public String getId() {
    return id;
  }

  public void mostrarFicha(){
    System.out.println(toString());
  }

  abstract String tipoMascota();

  @Override
  public String toString(){
    return "Nombre:"+nombre+
           "\nedad:"+edad+
           "\nraza:"+raza+
           "\ncomportamiento:"+comportamiento+
           "\nid:"+id;
  }
}
