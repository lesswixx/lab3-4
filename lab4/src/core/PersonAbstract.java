package core;
import Interface.*;


import java.util.Objects;
import Enum.MoodEnum;

public abstract class PersonAbstract  implements ThinkInterface, SaysInterface, LocationInterface {
    private final String name;
    private final int age;
    public MoodEnum mood;
    private final String street;
    private final String house;
    public PersonAbstract(String name, int age,MoodEnum mood, String street, String house){

        this.name = name;
        this.age = age;
        this.mood = mood;
        this.house = house;
        this.street = street;
    }

    public void getLocation(){
        class PersonLocation implements LocationInterface{   // Локальный класс
            final String street = PersonAbstract.this.street;
            final String house = PersonAbstract.this.house;
            @Override
            public void getHouse() {
                System.out.println("Дом " + house);
            }
            @Override
            public void getStreet() {
                System.out.println("Улица " + street );
            }
            public void getFullAddress(){
                getStreet();
                getHouse();
            }
        }
        PersonLocation personLocation = new PersonLocation();
        personLocation.getFullAddress();
    }
    public String getName(){
        return name;
    }
    public abstract void walk();
    @Override
    public void think(){
        System.out.println(name + " думает...");
    }
    @Override
    public void says(String phrase){
        System.out.println(name + " говорит - " + phrase);
    }

    public void getMood() {
        System.out.println(name + " " + mood);
    }

    public void setMood(MoodEnum mood) {
        this.mood = mood;
    }


    @Override
    public String toString() {
        return  name + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonAbstract person = (PersonAbstract) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }


}
