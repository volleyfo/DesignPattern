package SinglePattern;

public class SinglePattern3 implements java.io.Serializable {
    private static final class InstanceHolder{
        private static SinglePattern3 INSTANCE= new SinglePattern3();
    }
    public static SinglePattern3 getInstance(){
        return InstanceHolder.INSTANCE;
    }
    //反序列时直接返回当前INSTANCE
    private Object readResolve() {
        return InstanceHolder.INSTANCE;
    }
}
