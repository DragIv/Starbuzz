public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .20;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost();
    }
}


// Bad decision
// 1)нарушается принцип инкапсуляции
//предназначена для изоляции контрактных обязательств абстракции (протокол/интерфейс) от их реализации
//2) Нарушается принцип предпочтения композиции перед наследованием
// тк классы наследуются от базового абстрактного класса



//public class Mocha extends Beverage {
//
//    public double cost() {
//        return cost() + .20;
//    }
//}

