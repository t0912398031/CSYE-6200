package neu.edu.csye6200;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Item extends AbstractItemAPI  { 
    public Integer id;
    public String name;
    public Double price;

    public Item() {
        super();
        init (1, "item", 1.0);
    }

    public Item(Integer id, String name, Double price) {
        super();
        init(id, name, price);
    }

    public void init(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String info() {
    	return String.valueOf(this.getId()) +", "+ this.getName() +", "+ String.valueOf(this.getPrice());
    }

    /*
     * Fill in the blank to complete the sortItems() method in the following code fragment.
     * Use a single stream and lambdas to sort Items by price:
     * 1. lowest price first;
     * 2. exclude any item which cost greater than $3;
     * 3. display resulting list on console, horizontally on a single line separated by a single space.
     */
    public void sortItems() {
        List<Item> list = new ArrayList<Item>(Arrays.asList( 
                new Item(3, "OJ", 1.49),
                new Item(1, "Bread", 2.49),
                new Item(2, "Milk", 3.49),
                new Item(6, "Cheese", .89),
                new Item(4, "Cookies", 12.49),
                new Item(5, "Coffee", 7.49),
                new Item(9, "Tea", 5.49),
                new Item(7, "Rice", 4.49),
                new Item(8, "Apples", .99)
                    ));
        list.stream().sorted((o1, o2) -> o1.getPrice().compareTo(o2.getPrice())).filter((o)->o.getPrice()<=3).forEach(System.out::println);

        System.out.println();
    }
    
    public static void demo() {
    	Item i = new Item();
    	i.sortItems();  	
    }
    
    @Override
    public String toString() {
        return "Item " + this.info();
    }
}

