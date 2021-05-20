
package ajj.iat1;
//Enumeration with Constructor, instance variable and Method
enum Menu
{
FriedShrimp(10), BakedYam(9), FrenchFries(12), SteamedVeggies(15);
// variable
    int price;
    Menu(int p) // Constructor
    {
    price = p;
    }
//method
    int getPrice()
    {
    return price;
    }
}
public class enumRestaurant{

    public enumRestaurant(){

        Menu ap;
        // Display price of FriedShrimp.
        System.out.println("FriedShrimp costs " + Menu.FriedShrimp.getPrice() + " cents.\n");
        System.out.println(Menu.BakedYam.price);
        // Display all items and prices.
        System.out.println("All item prices:");
        for(Menu a : Menu.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }
}

