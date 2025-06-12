package models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CortePelo implements Servicio{

  private int precio;

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public void aplicarServicio(Mascota mascota) {
    System.out.println("aplicando corte de pelo a "+ mascota.getNombre());
    }

  @Override
  public double calcularPrecio(Mascota mascota) {
    return mascota instanceof Perro ? 20000:15000;
  }
}
