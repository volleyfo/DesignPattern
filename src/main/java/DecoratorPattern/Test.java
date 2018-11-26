package DecoratorPattern;

public class Test {
    public static void main(String[] args) {

        System.out.println(" 一个镶嵌1颗红宝石，1颗黄宝石，1颗蓝宝石的靴子");
        IEquip iEquip = new RedGemDecorator(new YellowGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        System.out.println("武器的攻击力为："+iEquip.caculateAttack());
        System.out.println("武器的描述为："+iEquip.description());
    }
}
