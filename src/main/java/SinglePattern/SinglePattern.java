package SinglePattern;

public class SinglePattern {
    public static SinglePattern instance;

    public static SinglePattern getInstance() {
        if(instance==null){
            synchronized (SinglePattern.class){
                if (instance==null){
                    instance = new SinglePattern();
                }
            }
        }
        return instance;
    }
}
