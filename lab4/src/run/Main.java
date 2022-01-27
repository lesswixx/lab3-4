package run;

import Enum.MoodEnum;
import Interface.GrowingInterface;
import Person.*;

public class Main {

    public static void main(String[] args) {

        BigHuman Ulisse = new BigHuman("Юлиус", 30, MoodEnum.ANGRY, "Пушкина","Колотушкина");
        BigHuman Bok = new BigHuman("Фрекен Бок", 40, MoodEnum.HAPPY, "Пушкина","Колотушкина");
        LittleHuman Baby = new LittleHuman("Малыш", 10, MoodEnum.RELAX, "Пушкина", "Колотушкина");
        Door door = new Door("Дверь", false);
        Drill drill = new Drill("Дрель", false);
        Ulisse.says("Закрой дверь с той стороны, щенок!!!");
//        Ulisse.setMood(MoodEnum.RELAX);
        Bok.says("Хахахаха");
        Ulisse.walk();
        Bok.walk();
        Karlson karlson = new Karlson("Карлсон", 20, MoodEnum.HAPPY, true , "Красная" , "Крыша");
        Karlson.Battery battery = new Karlson.Battery();
//        battery.charge(0);
        battery.chekCharge(40);
        karlson.start();
        karlson.conditional();
        karlson.fly();
        Baby.think();
        Baby.says("Карлсон, зачем тебе дрель ?");
        Baby.getMood();
        drill.on();
        karlson.says("держись, Малыш, им крышка !!!");

        door.broken(drill);
        drill.off();
        GrowingInterface BigBaby = new GrowingInterface() { // Анонимный класс
            @Override
            public void growing() {
                System.out.println(Baby.getName() + " повзрослел, увидив это зрелище");

            }
        };

        BigBaby.growing();
        Baby.walk();
//        Baby.setMood(MoodEnum.ANGRY);
//        Ulisse.setMood(MoodEnum.HAPPY);
//        Ulisse.getMood();
        System.out.println(" ");
        Ulisse.getLocation();
//        Baby.setMood(MoodEnum.HAPPY);

//        Class<BigHuman> clss = BigHuman.class;
//        Field[] fields = clss.getDeclaredFields();
//        for (Field field: fields) {
//            System.out.println(field.getName());
//            System.out.println(field.getModifiers());
//            System.out.println(field.getType());
//        }
    }
}