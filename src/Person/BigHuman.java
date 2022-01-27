package Person;
import Enum.MoodEnum;
import core.PersonAbstract;

public class BigHuman extends PersonAbstract {

    public BigHuman(String name, int age, MoodEnum mood) {
        super(name,age,mood);

    }

    @Override
    public void walk() {
        System.out.println("Персонаж " + getName() + " пошел по делам.");
    }


}
