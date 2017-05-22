
public class MiniDuckSimulator {
	public void duckTest(){
        Duck mallardDuck=new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}
