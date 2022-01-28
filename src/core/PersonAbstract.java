package core;
import Interface.ThinkInterface;
import Interface.SaysInterface;
import java.util.Objects;
import Enum.MoodEnum;
public abstract class PersonAbstract implements ThinkInterface, SaysInterface {
    private final String name;
    private final int age;
    private MoodEnum mood;
    public PersonAbstract(String name, int age,MoodEnum mood){
        this.name = name;
        this.age = age;
        this.mood = mood;

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

    public MoodEnum getMood() {
        System.out.println(name + " " + mood);
        return null;
    }

    public void setMood(MoodEnum mood) {
        this.mood = mood;
    }

    @Override
    public String toString() {
        return  name;
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
