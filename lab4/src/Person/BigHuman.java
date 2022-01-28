package Person;

import Enum.MoodEnum;
import core.PersonAbstract;




public class BigHuman extends PersonAbstract {
    public static int point = 100;
    public BigHuman(String name, int age, MoodEnum mood, String street, String house) {
        super(name, age, mood, street, house);
    }

    public static class Reputation {
        public static void checkReputation() {
            if (point < 100) {
                System.out.println("У взрослых плохая репутация");
            } else {
                System.out.println("У взрослых хорошая репутация");
            }

        }
        public static int lowPoints(){
            point = point - 20;
            return point;
        }
        public static int hightPoints(){
            point = point + 20;
            return point;
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


