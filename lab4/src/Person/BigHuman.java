package Person;

import Enum.MoodEnum;
import core.PersonAbstract;


public class BigHuman extends PersonAbstract {

    public BigHuman(String name, int age, MoodEnum mood, String street, String house) {
        super(name, age, mood, street, house);


    }


    @Override
    public void walk() {
        System.out.println("Персонаж " + getName() + " пошел по делам.");
    }

    @Override
    public void says(String phrase) {
        System.out.println(phrase);
    }

    @Override
    public void getHouse() {

    }

    @Override
    public void getStreet() {

    }

}


