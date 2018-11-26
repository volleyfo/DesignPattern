package StatusPattern;

public class VendingMachine {
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;
    private State winnerState ;

    private int count = 0;
    private State currentState = noMoneyState;


    public VendingMachine(int count)
    {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (count > 0)
        {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public void insertMoney()
    {
        currentState.insertMoney();
    }

    public void backMoney()
    {
        currentState.backMoney();
    }

    public void turnCrank()
    {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState)
            currentState.dispense();
    }

    public void dispense()
    {
        System.out.println("发出一件商品...");
        if (count != 0)
        {
            count -= 1;
        }
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public State getCurrentState() {
        return currentState;
    }
}
