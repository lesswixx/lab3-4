package Person;

import Interface.BreakAble;
import Interface.SwitchAble;

import java.util.Objects;


public class Door implements BreakAble {
    private boolean broken;
    private final String name;

    public Door(String name, boolean broken) {
        this.broken = broken;
        this.name = name;
    }

    @Override
    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    @Override
    public void broken(SwitchAble switchAble) {
        if (switchAble.isBroken()) {
            this.setBroken(true);
            System.out.println("Дверь сломана");
        } else {
            System.out.println("Дверь цела и невредима");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return broken == door.broken && Objects.equals(name, door.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broken, name);
    }
}
