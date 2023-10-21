package ClassPractice;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    private String name;
    private String sound;

    // constructor
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getSound() {
        return sound;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Doge", "Bark");
        System.out.println(myAnimal.getName());
    }
}
