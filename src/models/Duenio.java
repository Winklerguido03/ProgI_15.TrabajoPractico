package models;


public class Duenio {

  private String nombre;
  private String telefono;
  Mascota[] mascotas;
  private int cantidadDeMascotas;


  public Duenio(){}

  public Duenio(String nombre,String telefono){
    this.nombre=nombre;
    this.telefono=telefono;
    this.mascotas=new Mascota[4];
    this.cantidadDeMascotas=0;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Mascota[] getMascotas() {
    return mascotas;
  }

  public void setMascotas(Mascota[] mascotas) {
    this.mascotas = mascotas;
  }

  public int getCantidadDeMascotas() {
    return cantidadDeMascotas;
  }

  public void setCantidadDeMascotas(int cantidadDeMascotas) {
    this.cantidadDeMascotas = cantidadDeMascotas;
  }

  public void agregarMascota(Mascota m){
  if (cantidadDeMascotas<4){
     mascotas[cantidadDeMascotas]=m;
     cantidadDeMascotas++;
  }else {
    System.out.println("No se pueden agregar mas de 4 mascotas");
  }
  }

  public void mostrarMascotas(){
    System.out.println("Mascota de "+nombre+":");
      for (int i=0;i<cantidadDeMascotas;i++){
        mascotas[i].mostrarFicha();
      }
    }

  }

