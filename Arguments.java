public abstract class Arguments {
 
    protected String firstArg;
    protected String secondArg;
 
    public Arguments( String arg1, String arg2 ) {
    	this.firstArg = arg1;
    	this.secondArg = arg2;
    }
   
    public abstract int getFirstArg();
    public abstract int getSecondArg();
}
