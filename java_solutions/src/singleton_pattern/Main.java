package singleton_pattern;

class Singleton{
    private static Singleton instance;
    public String str;
    
    private Singleton(){
    }
    
    public static Singleton getSingleInstance(){
        if(instance == null){
            return new Singleton();
        }
        
        return instance;
    }
}

public class Main {

	public static void main(String[] args) {
	}

}
