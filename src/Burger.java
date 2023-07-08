public class Burger {
    String bun;
    String meat;
    String cheese;
    String lettuce;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        System.out.println("Дієтичний бургер: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ".");
    }

    public Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise, String doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + meat + ", " + cheese + ", " + lettuce + ", " + mayonnaise + ", " + doubleMeat + ".");
    }
}
