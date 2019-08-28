package designpatterns.Creational;

public class AbstarctFactoryDesignPattern {
    public static void main(String[] args) {
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Land").getAnimalType("Tiger").speak());
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Land").getAnimalType("Duck").speak());
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Land").getAnimalType("Horse").speak());
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Sea").getAnimalType("Whale").speak());
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Sea").getAnimalType("Fish").speak());
       System.out.println(AnimalAbstractFactory.createAnimalFactory("Sea").getAnimalType("Turtle").speak());


    }

}
interface AnimalKingdom {
    public String speak();
}

class Duck implements AnimalKingdom {
    @Override
    public String speak() {
        return "Bark Bark";
    }
}

class Tiger implements AnimalKingdom {
    @Override
    public String speak() {
        return "Roar";
    }
}

class Horse implements AnimalKingdom {
    @Override
    public String speak() {
        return "Neigh";
    }
}

class Fish implements AnimalKingdom {
    @Override
    public String speak() {
        return "Fish Fish";
    }
}

class Turtle implements AnimalKingdom {
    @Override
    public String speak() {
        return "Turtle";
    }
}

class Whale implements AnimalKingdom {
    @Override
    public String speak() {
        return "No Sound";
    }
}

class LandAnimalFactory extends AnimalAbstractFactory {

    public AnimalKingdom getAnimalType(String animalType) {
        switch (animalType) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            case "Horse":
                return new Horse();
            default:
                return null;
        }
    }

}

class SeaAnimalFactory  extends AnimalAbstractFactory{

    public AnimalKingdom getAnimalType(String animalType) {
        switch (animalType) {
            case "Fish":
                return new Fish();
            case "Whale":
                return new Whale();
            case "Turtle":
                return new Turtle();
            default:
                return null;
        }
    }
}

abstract  class AnimalAbstractFactory{
    protected abstract AnimalKingdom getAnimalType(String animalType);
    public static AnimalAbstractFactory createAnimalFactory(String animalFactory){
        switch (animalFactory){
            case "Land": return new LandAnimalFactory();
            case "Sea": return new SeaAnimalFactory();
            default: return null;
        }

    }
}