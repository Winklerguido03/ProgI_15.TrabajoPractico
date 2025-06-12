package models;


public class Banio implements Servicio{

  @Override
  public void aplicarServicio(Mascota mascota) {

    System.out.println("Aplicando baño a "+mascota.getNombre());

  }

  @Override
  public double calcularPrecio(Mascota mascota) {
    return mascota instanceof Perro ? 30000:25000;
  }


}
