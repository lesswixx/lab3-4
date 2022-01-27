package run;

import Enum.MoodEnum;
import Person.*;

public class Main {

    public static void main(String[] args) {
        BigHuman Ulisse = new BigHuman("Юлиус", 30, MoodEnum.ANGRY);
        BigHuman Bok = new BigHuman("Фрекен Бок", 40, MoodEnum.HAPPY);
        LittleHuman Baby = new LittleHuman("Малыш", 10,MoodEnum.RELAX);
        Door door = new Door("Дверь", false);
        Drill drill = new Drill("Дрель", false);
        Ulisse.says("Закрой дверь с той стороны, щенок!!!");
        Ulisse.setMood(MoodEnum.ANGRY);
        Bok.says("Хахахаха");
        Ulisse.setMood(MoodEnum.HAPPY);
        Ulisse.walk();
        Bok.walk();
        Karlson karlson = new Karlson("Карлсон", 20,MoodEnum.HAPPY, true);




        Baby.think();
        Baby.says( "Карлсон, зачем тебе дрель ?");
        Baby.setMood(MoodEnum.RELAX);
        drill.on();

        karlson.says( "держись, Малыш, им крышка !!!");

        door.broken(drill);
        drill.off();

        karlson.conditional();
        Baby.walk();
        Ulisse.getMood();
        Baby.getMood();
        karlson.getMood();


    }
}