
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public Product test1(){
        StockManager  manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        // Show details of all of the products.
        manager.printProductDetails();
        // Take delivery of 5 items of one of the products.
        manager.delivery(132, 5);

        manager.printProductDetails();

        manager.StockManager(5);
        manager.StockManager(8);

        manager.addProduct(new Product(23,  "caca Oven"));
        manager.printProductDetails();

        return manager.findProduct("Mobile Phone");

    }
}
