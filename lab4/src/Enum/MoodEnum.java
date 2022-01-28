package Enum;


public enum MoodEnum {
    HAPPY("Довольный"), ANGRY("Злой"), RELAX("Спокойный") ;

    private final String name;

    MoodEnum(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



    @Override
    public String toString() {
        return name;
    }

}
