package models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LimpiezaOidos implements Servicio{

  public static final Logger Log=
      Logger.getLogger(LimpiezaOidos.class.getName());

  private int precio;

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public void aplicarServicio(Mascota mascota) {

    System.out.println("aplicando limpieza de oidos a "+mascota.getNombre());
    }

  @Override
  public double calcularPrecio(Mascota mascota) {
    return mascota instanceof Perro ? 15000:10000;
  }
}
