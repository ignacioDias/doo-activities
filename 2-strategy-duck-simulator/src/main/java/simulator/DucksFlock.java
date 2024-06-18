package simulator;
import java.util.ArrayList;
public class DucksFlock extends Duck {
    private List<Duck> ducks;

    public DucksFlock(ArrayList<Duck> ducks) {
        this.ducks = ducks;
    }
    public void display() {
        System.out.println("Ducks Flock");
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        for(Duck currentDuck : this.ducks)
            currentDuck.setBehavior(flyBehavior);
    }
    public void setQuackBehavior(int duck, QuackBehavior quackBehavior) { //para todos
        for(Duck currentDuck : this.ducks)
            currentDuck.setQuackBehavior(quackBehavior);
    }
    public void performFly() {
        for(Duck currentDuck : this.ducks)
            currentDuck.performFly();
    }
    public void performQuack() {
        for(Duck currentDuck : this.ducks)
            currentDuck.performQuack();
    }
    public void performFly() {
        for(Duck duck : ducks) {
            duck.performFly();
        }
    }
    public Duck getDuck(int duck) {
        return ducks.get(duck);
    }
    public void swim(int duck) {
        for(Duck currentDuck : this.ducks)
            currentDuck.swim();
    }

    public int cantDucks() {
        return ducks.size();
    }
}
