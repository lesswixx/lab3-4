package Person;
import Enum.MoodEnum;
import Interface.LocationInterface;
import core.PersonAbstract;
import exception.MoodException;

public class LittleHuman extends PersonAbstract implements LocationInterface {

    public LittleHuman(String name, int age, MoodEnum mood, String street, String house) {
        super(name, age, mood, street, house);

    }

    @Override
    public void walk() {
        System.out.println("Персонаж " + getName() + " пошел заниматься своими детскими делами");

    }

    @Override
    public void setMood(MoodEnum mood) {
        if (super.mood != mood){
            try{
                throw new MoodException("Этому персонажу нельзя менять настроение");
            }catch (MoodException e){
                e.printStackTrace();
            }
        }
        super.mood = mood;
    }


    @Override
    public void getHouse() {

    }

    @Override
    public void getStreet() {

    }
}
