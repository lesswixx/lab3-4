package core;
import Enum.MoodEnum;
import java.util.Objects;

public abstract class ConditionalAbstract extends PersonAbstract {
    private boolean conditional;

    public ConditionalAbstract(String name, int age,MoodEnum mood, boolean conditional) {
        super(name, age, mood);
        this.conditional = conditional;
    }


    public  boolean getConditional(){
        return conditional;
    }
    public abstract void conditional();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConditionalAbstract that = (ConditionalAbstract) o;
        return conditional == that.conditional;
    }

    @Override
    public  MoodEnum getMood() {
        return super.getMood();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conditional);
    }
}
