package behaviorType.memento;

import java.util.Stack;

public class MementoTest {
    public static void main(String[] args) {
        Stack<StarMemento> states = new Stack<>();
        Star star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star.toString());
        states.add(star.getMemento());

        star.timePass();
        System.out.println(star.toString());
        states.add(star.getMemento());

        star.timePass();
        System.out.println(star.toString());
        states.add(star.getMemento());

        star.timePass();
        System.out.println(star.toString());
        states.add(star.getMemento());

        star.timePass();
        System.out.println(star.toString());
        states.add(star.getMemento());

        star.timePass();

        while (states.size() > 0) {
            star.setMemento(states.pop());
            System.out.println(star.toString());
        }
    }
}
