public class StarBuzzCoffe {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}

//Декоратор: добавляю в архитектуру много мелких классов, и разобраться в ней становится весьма непросто.

//иерархии, построенные с использованием этого паттерна, часто
// состоят из множества мелких классов, в которых трудно разобраться разработ-
// чику, пытающемуся использовать API.

