package ObserverPattern;

public class Observer1 implements Observer {
    private Subject subject;
    public Observer1(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(String msg) {
        System.out.println("Observer1 得到3D号码 -->"+msg);
    }
}
