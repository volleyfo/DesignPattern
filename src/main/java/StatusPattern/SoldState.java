package StatusPattern;

public class SoldState implements State
{

    private VendingMachine machine;

    public SoldState(VendingMachine machine)
    {
        this.machine = machine;
    }

    public void insertMoney()
    {
        System.out.println("正在出货，请勿投币");
    }

    public void backMoney()
    {
        System.out.println("正在出货，没有可退的钱");
    }

    public void turnCrank()
    {
        System.out.println("正在出货，请勿重复转动手柄");
    }

    public void dispense()
    {
        machine.dispense();
        if (machine.getCount() > 0)
        {
            machine.setCurrentState(machine.getNoMoneyState());
        } else
        {
            System.out.println("商品已经售罄");
            machine.setCurrentState(machine.getSoldOutState());
        }
    }
}