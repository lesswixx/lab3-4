package Person;

import Enum.MoodEnum;
import Interface.FlyAble;
import core.ConditionalAbstract;
import exception.BatteryException;

public class Karlson extends ConditionalAbstract implements FlyAble {
    private Vint vint = new Vint();
    private Battery battery = new Battery();

    public Karlson(String name, int age, MoodEnum mood, boolean conditional, String street, String house) {
        super(name, age, mood, conditional, street, house);

    }

    private class Vint {     // Вложенный нестатический класс(non-static)
        public void startVint() {
            System.out.println(Karlson.this.getName() + " запустил пропеллер");
        }

    }

    public void start() {
        vint.startVint();
    }

    private class Battery {      // Вложенный нестатический класс(non-static)
        public int charge(int percent) {
            for (; percent + 20 <= 100; percent = percent + 20) {
                System.out.println("Батарея заряжается, уровень заряда: " + percent + " %");
            }
            System.out.println("Батарея имеет максимальный заряд: " + percent + " %");
            return percent;
        }

        public void chekCharge(int percent) throws BatteryException {
            if ((charge(percent) > 100)) {
                throw new BatteryException("Батарея не может иметь заряд больше 100%");
            }
        }
    }

    public void Charge(int percent) {
        battery.chekCharge(percent);
    }


    @Override
    public void conditional() {
        if (getConditional()) {
            System.out.println(getName() + " болтает ножками в воздухе");
        } else {
            System.out.println(getName() + " стоит кайфует");
        }
    }

    @Override
    public void walk() {
        System.out.println(getName() + " пошел по делам");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " взлетает в воздух");
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
