package ObserverPattern;

public class TestObserver {
    public static void main(String[] args) {
//        ObjectFor3D objectFor3D = new ObjectFor3D();
//        Observer1 observer1 = new Observer1(objectFor3D);
//        Observer2 observer2 = new Observer2(objectFor3D);
//        objectFor3D.setMsg("20181123的3D号码是：127" );
//        objectFor3D.setMsg("20181124的3D号码是：128" );
        SubjectFor3d subjectFor3d = new SubjectFor3d() ;
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ() ;

        Observer3 observer3 = new Observer3();
        observer3.registerSubject(subjectFor3d);
        observer3.registerSubject(subjectForSSQ);


        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }
}
