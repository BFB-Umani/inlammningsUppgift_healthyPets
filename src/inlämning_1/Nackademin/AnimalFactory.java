package inlämning_1.Nackademin;

public class AnimalFactory {
    private IAnimal animal;
    void getAnimal(String nameInput){

        // Kollar enumeration för att se vilken typ djuret vars namn användaren skriver in har.
        if(Names.valueOf(nameInput).type == 1){
            animal = new Dog(nameInput);
        }
        else if(Names.valueOf(nameInput).type == 2){
            animal = new Cat(nameInput);
        }
        else if(Names.valueOf(nameInput).type == 3){
            animal = new Snake(nameInput);
        }
    }
    public String feed(){
        return animal.getName() + " skall ha " + animal.getFoodAmount() + " gram " + animal.getFoodType();
    }
}