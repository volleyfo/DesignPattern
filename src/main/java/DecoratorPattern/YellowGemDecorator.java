package DecoratorPattern;

/**
 * 黄宝石装饰品
 * 每颗攻击力+10
 * @author zhy
 *
 */
public class YellowGemDecorator implements IEquipDecorator
{
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }

    public int caculateAttack()
    {
        return 10 + equip.caculateAttack();
    }

    public String description()
    {
        return equip.description() + "+ 黄宝石";
    }

}