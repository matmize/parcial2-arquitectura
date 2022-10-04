package co.edu.unisabana.parcialarquitectura.repository;
import co.edu.unisabana.parcialarquitectura.repository.InversionDependencias;


public class Database implements InversionDependencias {



  public void GuardarBD(Database database){

    database.GuardarBD(1,"Reloj");
   }
}
