/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemrobertmorales;

import Model.InhousePart;
import Model.Inventory;
import Model.Product;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Robert Scott Morales
 */
public class InventorySystemRobertMorales extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/mainScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("SMorales Inventory");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         InhousePart part1 = new InhousePart(1, "poop", 12.95, 19, 10, 20, 452);
         InhousePart part2 = new InhousePart(2, "pee", 14.95, 6, 3, 15, 419);
         InhousePart part3 = new InhousePart(3, "Urine", 200.01, 100, 99, 1000, 3);
         
         Product prod1 = new Product(1, "lolly", 1002.30, 50, 40, 100);
         Product prod2 = new Product(2, "pop", 1232.51, 40, 20, 600);
         Product prod3 = new Product(3, "cramo", 10.05, 10, 400, 1000);
         
         Inventory.addProduct(prod1);
         Inventory.addProduct(prod2);
         Inventory.addProduct(prod3);
         
         Inventory.addPart(part1);
         Inventory.addPart(part2);
         Inventory.addPart(part3);
        
        launch(args);
    }
    
}

//observable list and table views III ended at 0:36:52