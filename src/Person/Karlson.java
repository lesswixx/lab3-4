package Person;

import Interface.PropellerInterface;
import core.ConditionalAbstract;
import Enum.MoodEnum;
public class Karlson extends ConditionalAbstract implements PropellerInterface {

    public Karlson(String name, int age, MoodEnum mood, boolean conditional) {
        super(name, age, mood, conditional);
    }


    @Override
    public void conditional(){
        if (getConditional()){
            System.out.println(getName() + " болтает ножками в воздухе");
        }else {
            System.out.println(getName() + " стоит кайфует");
        }
    }

    @Override
    public void walk() {
        System.out.println(getName() + " пошел по делам");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " болтает ногами в воздухе");
    }

}