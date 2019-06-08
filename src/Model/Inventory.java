/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Scott
 */
public class Inventory {
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();
    
    public static void addPart(Part part){
        allParts.add(part);
    }
    public static void addProduct(Product product){
        allProducts.add(product);
    }
    public static Part lookupPart(int partId){
        for(Part searchedPart : Model.Inventory.getAllParts()){
            if (searchedPart.getId() == partId) {
                System.out.println("Found");
                return searchedPart;
            }            
        }
        System.out.println("Not found");
        return null;
    }
    public Product lookupProduct(int productId){
        return null;
    }
    public ObservableList<Part> lookupPart(String partName){
        return null;
    }
    public ObservableList<Product> lookupProduct(String productName){
        return null;
    }
    public void updatePart(int index, Part part){
        
    }
    public void updateProduct(int index, Product product){
        
    }
    public static void deletePart(Part part){
        allParts.remove(part);
    }
    public void deleteProduct(Product product){
        
    }
    public static ObservableList<Part> getAllParts(){
        return allParts;
    }
    public static ObservableList<Product> getAllProducts(){
        return allProducts;
    }
}
