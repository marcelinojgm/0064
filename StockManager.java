import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
            //cantidad en stock del elemnto con id solicitada, en caso de no existir es cero
        Product product = null;
        //false elemento no encontr
        boolean found = false;
        int index = 0;
        //recorrido de stock en busca del producto con id solicitado
        while(stock.size()> index && !found)
        {
            product = stock.get(index);
            //si concide la id macar como encontrado
            if(product.getID() == id)
            {
                found = true;
            }
            index++;
        }

        if(!found)
        {
            product = null;
        }

        return product;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
       int quantity = 0;
        Product product = findProduct(id);
        if (product != null) 
        {
            quantity = product.getQuantity();
        }
        return quantity;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
        
        //mientras haya elementos en la coleccion
        if (stock.size() > 0)
        {
            //impresion de info de cada eleemento
            for (Product product : stock)
            {
                System.out.println(product.toString());
            }
        }
    }
}
