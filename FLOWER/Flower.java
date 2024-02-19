
/**
 * Program Description: to create an inventory for Floral Bliss
 * Programmer: Mell
 * Date: 19/2/2024
 */
import java.util.Scanner;

public class Flower 
{
    //declaration of instance variables
    private String name;
    private String color;
    private double price;
    private int quantity;

    //definition of instance variables
    //constructor without param
    public Flower() 
    {
        this.name = "";
        this.color = "";
        this.price = 0.0;
        this.quantity = 0;
    }//end of this constructor

    //constructor with param
    public Flower(String name, String color, double price, int quantity) 
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }//end of this contructor

    //accessor for name
    public String getName() 
    {
        return name;
    }

    //mutator for name
    public void setName(String name) 
    {
        this.name = name;
    }

    //accessor for color
    public String getColor() 
    {
        return color;
    }

    //mutator for color
    public void setColor(String color) 
    {
        this.color = color;
    }

    //accessor for price
    public double getPrice() 
    {
        return price;
    }

    //mutator for price
    public void setPrice(double price) 
    {
        this.price = price;
    }

    //accessor for quantity
    public int getQuantity() 
    {
        return quantity;
    }

    //mutator for quantity
    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    //@override
    //toString() method that display all information
    public String toString() 
    {
        return "Flower [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

