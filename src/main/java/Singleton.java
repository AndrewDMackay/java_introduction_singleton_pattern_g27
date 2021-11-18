
public class Singleton {

    private static Singleton instance = null;
    private String data;

    private Singleton(){
        this.data = "Hello, I am part of the singleton class.";
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getData(){
        return data;
    }

    public void setData(String newData){
        this.data = newData;
    }
}
