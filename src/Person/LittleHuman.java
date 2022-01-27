package Person;
import Enum.MoodEnum;
import core.PersonAbstract;

public class LittleHuman extends PersonAbstract {
    public LittleHuman(String name, int age, MoodEnum mood) {
        super(name,age,mood);

    }

    @Override
    public void walk() {
        System.out.println("Персонаж " + getName() + " пошел заниматься своими детскими делами");

    }
}
