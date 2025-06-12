package models;

public class ComboCompleto implements Servicio{

  private Banio banio = new Banio();
  private CortePelo corte = new CortePelo();
  private LimpiezaOidos limpieza = new LimpiezaOidos();

  @Override
  public void aplicarServicio(Mascota mascota) {
    banio.aplicarServicio(mascota);
    corte.aplicarServicio(mascota);
    limpieza.aplicarServicio(mascota);
  }

  @Override
  public double calcularPrecio(Mascota mascota) {
    return banio.calcularPrecio(mascota) +
        corte.calcularPrecio(mascota) +
        limpieza.calcularPrecio(mascota);
  }
}
