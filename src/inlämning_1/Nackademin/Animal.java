package inlämning_1.Nackademin;

public class Animal implements IAnimal {

    // inkapslad privat variabel som bara går att nås från senare metod "getName".
    private Names animalName;
    int divider;
    String food;

    Animal(String nameInput) {
        this.animalName = Names.valueOf(nameInput);
    }

    public int getFoodAmount() {
        return ((this.animalName.weight * 1000) / divider);
    }

    public String getName() {
        return this.animalName.toString().substring(0, 1) + this.animalName.toString().substring(1).toLowerCase();
    }

    public String getFoodType() {
        return food;
    }
}

class Dog extends Animal {
    Dog(String nameInput) {
        super(nameInput);
        this.divider = 100;
        this.food = "hundfoder";
    }
}

class Cat extends Animal {
    Cat(String nameInput) {
        super(nameInput);
        this.divider = 150;
        this.food = "kattfoder";
    }
}

class Snake extends Animal {
    Snake(String nameInput) {
        super(nameInput);
        this.food = "ormpellets";
    }

    /* en polymorfisk metod för att ändra vad "getFoodAmount" gör ifall djuret är en orm.
    * Den har alltså samma namn som en metod i klassen "Animal" men överskuggar den.*/
    @Override
    public int getFoodAmount() {
        return 20;
    }
}