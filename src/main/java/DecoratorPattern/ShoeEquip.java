package DecoratorPattern;

/**
 * 鞋子
 * 攻击力 5
 * @author zhy
 *
 */
public class ShoeEquip implements IEquip
{

    public int caculateAttack()
    {
        return 5;
    }

    public String description()
    {
        return "圣战靴子";
    }

}