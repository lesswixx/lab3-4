package Person;

import Interface.SwitchAble;

import java.util.Objects;


public class Drill implements SwitchAble {
    private final String name;
    private boolean type;

    public Drill(String name, boolean type) {
        this.type = type;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public boolean isBroken() {
        return type;
    }

    public void setType() {
        if (isBroken()) {
            System.out.println("Дрель включена");
        } else {
            System.out.println("Дрель выключена");
        }

    }

    @Override
    public void on() {
        this.type = true;
        System.out.println(name + " включена");

    }

    @Override
    public void off() {
        this.type = false;
        System.out.println(name + " выключена");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drill drill = (Drill) o;
        return type == drill.type && Objects.equals(name, drill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
