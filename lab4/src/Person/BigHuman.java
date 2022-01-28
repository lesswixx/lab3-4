package Person;

import Enum.MoodEnum;
import core.PersonAbstract;




public class BigHuman extends PersonAbstract {
    private static int point = 100;
    public BigHuman(String name, int age, MoodEnum mood, String street, String house, int point) {
        super(name, age, mood, street, house);
        this.point = point;


    }
    public static class Reputation{
        public int points(){
            return point;
        }
        public int lowPoints(){
            return point - 20;
        }
        public int hightPoints(){
            return point + 20;

        }
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
    public String getHouse() {
        return house;
    }

    @Override
    public String getStreet() {
        return street;
    }

}


