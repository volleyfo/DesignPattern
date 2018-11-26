package DecoratorPattern;

/**
 * 护腕
 * 攻击力 5
 * @author zhy
 *
 */
public class WristEquip implements IEquip
{

    public int caculateAttack()
    {
        return 5;
    }

    public String description()
    {
        return "圣战护腕";
    }

}