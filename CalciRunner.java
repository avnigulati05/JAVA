public class CalciRunner {

    public static void main ( String arg[]) {
        Calci c = new Calci ();
        c.Sub();
        Calci.Sum();
    }
}
class Calci{
    
    public static void Sum (){
     System.out.println("Welcome to Sum");
    }

    public  void Sub (){
     System.out.println("Welcome to Sub");
    }

}


