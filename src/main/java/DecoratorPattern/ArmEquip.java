package DecoratorPattern;

/**
 * 武器
 * 攻击力20
 * @author zhy
 *
 */
public class ArmEquip implements IEquip
{

    public int caculateAttack()
    {
        return 20;
    }

    public String description()
    {
        return "屠龙刀";
    }

}