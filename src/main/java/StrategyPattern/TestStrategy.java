package StrategyPattern;

public class TestStrategy {

    public static void main(String[] args) {

        Role roleA = new RoleA("A");

        roleA.setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new Display1())
                .setRunBehavior(new RunJCTQ());
        System.out.println("角色"+roleA.name+":");
        roleA.display();
        roleA.attack();
        roleA.run();
        roleA.defend();
    }
}
