
public class Runner {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getData());
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setData("The data has changed..");
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3.getData());
    }
}
