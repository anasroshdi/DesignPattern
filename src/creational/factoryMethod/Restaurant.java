package creational.factoryMethod;

//IFactory
public abstract class Restaurant {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        System.out.println(burger);
        return burger;
    }

    public abstract Burger createBurger();
}
