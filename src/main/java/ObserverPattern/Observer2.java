package ObserverPattern;

public class Observer2 implements Observer {
    private Subject subject;
    public Observer2(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(String msg) {
        System.out.println("Observer2 得到3D号码 -->"+msg);
    }
}