package models;

public class Perro extends Mascota{

  private int peso;

  public Perro(String idd){
    super(idd);
  }

  public Perro(String nombre,int edad,String raza,String comportamiento,String id,int peso){
    super(nombre,edad,raza,comportamiento,id);
    this.peso=peso;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  @Override
  public String tipoMascota() {
    return "Perro";
  }

  @Override
  public void mostrarFicha(){
    super.mostrarFicha();
  }


}
