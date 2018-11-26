package DecoratorPattern;

/**
 * 戒指
 * 攻击力 5
 * @author zhy
 *
 */
public class RingEquip implements IEquip
{

    public int caculateAttack()
    {
        return 5;
    }

    public String description()
    {
        return "圣战戒指";
    }

}