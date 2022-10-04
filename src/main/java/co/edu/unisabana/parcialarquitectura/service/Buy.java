package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.repository.Database;
import co.edu.unisabana.parcialarquitectura.repository.InversionDependencias;

public class Buy implements InversionDependencias {

  public void ventaProducto(Database database){
    database.makePurchase(1,1,"reloj");
  }

}
