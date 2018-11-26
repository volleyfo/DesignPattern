package ObserverPattern;


import java.util.Observable;
import java.util.Observer;

public class Observer3 implements Observer
{

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg)
    {
        if (o instanceof SubjectFor3d)
        {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ)
        {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}