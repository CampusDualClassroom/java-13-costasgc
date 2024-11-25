package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad es: " + getActualFuel());
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
  public void setActualFuel(int valor){
    if (valor < 0)
    {
      System.out.println("No se permiten valores negativos");
    }
    else
    {
      actualFuel = valor;
    }
  }
}


