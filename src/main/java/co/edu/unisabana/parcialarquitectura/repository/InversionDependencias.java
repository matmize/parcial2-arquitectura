package co.edu.unisabana.parcialarquitectura.repository;

import co.edu.unisabana.parcialarquitectura.service.IllegalSaleException;
import co.edu.unisabana.parcialarquitectura.repository.Database;
import co.edu.unisabana.parcialarquitectura.service.Buy;


public interface InversionDependencias {

    static int GuardarBD(int buyerCode, String item){
        Database database = new Database();
        if (buyerCode == 0 || item == null || item.isEmpty()) {
            return 0;
        }
        return 1;
    }

     default String makePurchase(int vendorCode, int buyerCode, String item) {

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
