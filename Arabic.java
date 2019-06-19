public class Arabic extends Arguments {
     
    public Arabic ( String arg1, String arg2 ) {
        super(arg1, arg2 );
    }
     
    Integer arg = null;
     
    @Override
    public int getFirstArg() {
        arg = Integer.parseInt(firstArg);
        if (arg < 1 || arg > 10 ) arg = null;
        return arg;     
    }
     
    @Override
    public int getSecondArg() {
        arg = Integer.parseInt(secondArg);
        if (arg < 1 || arg > 10 ) arg = null;
        return arg;     
    }
     
    public static void main(String[] args) {
     
     
    }   
 
}