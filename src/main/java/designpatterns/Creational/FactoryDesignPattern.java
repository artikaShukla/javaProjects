package designpatterns.Creational;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.println(animalFactory.getAnimalInstance("Dog").speak());
        System.out.println(animalFactory.getAnimalInstance("Cat").speak());
        System.out.println(animalFactory.getAnimalInstance("Lion").speak());
    }


}

interface Animal {
    public String speak();
}

class Dog implements Animal {
    @Override
    public String speak() {
        return "Bark Bark";
    }
}

class Cat implements Animal {
    @Override
    public String speak() {
        return "Meow";
    }
}

class Lion implements Animal {
    @Override
    public String speak() {
        return "Roar";
    }
}

class AnimalFactory {

    public Animal getAnimalInstance(String animalType) {
        switch (animalType) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Lion":
                return new Lion();
            default:
                return null;
        }
    }
}