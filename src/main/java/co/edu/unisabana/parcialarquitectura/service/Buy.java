package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.repository.Database;

import javax.xml.crypto.Data;

public class Buy {


  public String makePurchase(int vendorCode, int buyerCode, String item) {

    public void ventaProducto(Database database) {
      Database database = new Database();
      if (buyerCode == vendorCode) {
        throw new IllegalSaleException(vendorCode, buyerCode);
      }
      int result = database.savePurchase(buyerCode, item);
      if (result == 1) {
        return "Product sold";
      }
      return "Sorry :( the sale was canceled in the last minute, try again";
    }

  }
}
