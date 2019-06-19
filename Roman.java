public class Roman extends Arguments {
     
    public Roman ( String arg1, String arg2 ) {
        super(arg1, arg2 );
    }
     
    public int convertNumber(String str) {
        Integer arg = null;
         
        switch (str.toUpperCase()) {
        case "I":
            arg = 1;
            break;
        case "II":
            arg = 2;
            break;
        case "III":
            arg = 3;
            break;
        case "IV":
            arg = 4;
            break;
        case "V":
            arg = 5;
            break;
        case "VI":
            arg = 6;
            break;
        case "VII":
            arg = 7;
            break;
        case "VIII":
            arg = 8;
            break; 
        case "IX":
            arg = 9;
            break;
        case "X":
            arg = 10;
            break;   
      }
      return arg;   
    }
     
    @Override
    public int getFirstArg() {
        int arg = convertNumber(firstArg);
        return arg;     
    }
     
    @Override
    public int getSecondArg() {
        int arg = convertNumber(secondArg);
        return arg;     
    }
     
    public static void main(String[] args) {
     
     
    }
}