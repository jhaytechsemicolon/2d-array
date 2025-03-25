import java.util.ArrayList;
public class ListOfItem{
  
   public static void main (String... args ){

   ArrayList<String> fruits = new ArrayList<>();
  fruits.add( "banana");
fruits.add( "mango");
fruits.add( "orange");
fruits.add(0, "cherry");
fruits.set(0, "apple");
fruits.remove(1);
fruits.remove("apple");
//fruits.clear();
fruits.size();
//System.out.println(fruits);
//System.out.println(fruits.get(2));

System.out.println(fruits);

  }

  }
      