// Task 2
package Task2;

public class Main {

    public static void main(String[] args) {
      Cafe cafe = new Cafe();
      cafe.loadMenuData();
      for (int i = 0; i < cafe.coffeeMenu.size(); i++) {
        String coffee = cafe.coffeeMenu.get(i);
        System.out.println(coffee);
      }
    }
}
