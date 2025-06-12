package models;

import java.sql.SQLOutput;

public class Gato extends Mascota{

  private int peso;

  public Gato(String idd){
    super(idd);
  }

  public Gato(String nombre,int edad,String raza,String comportamiento,String id,int peso){
    super(nombre,edad,raza,comportamiento,id);
    this.peso=peso;
  }

  public int getPeso(){
    return peso;
  }

  public void setPeso(int peso){
    this.peso=peso;
  }

  @Override
  public String tipoMascota() {
    return "Gato";
  }

  @Override
  public void mostrarFicha(){
    super.mostrarFicha();
  }

}
