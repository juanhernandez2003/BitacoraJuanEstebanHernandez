import java.util.*;
public class Box implements Item{
    private String name;
    private ArrayList<Item> items = new ArrayList<>();

    public Box(String name){
        this.name = name;
    }

    @Override
    public double getPrice(){
        double total = 0;
        for (Item c : items){
            total += c.getPrice();
        }
        return total;
    }

    public void add(Item item){
        items.add(item);
    }

    public void remove (Item item){
        try{
            items.remove(item);
        }
        catch (Exception e){
            System.out.println("Item no encontrado");
        }
    }
}
