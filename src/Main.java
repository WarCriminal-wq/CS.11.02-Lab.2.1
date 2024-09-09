

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jonathan
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(12,13, 26, 42)); //huzzah, it works
        System.out.println(morningGreeting("idiot"));
        System.out.println(afternoonGreeting("idiot"));
        System.out.println(triple("meh"));
        System.out.println(half(62.7));
        System.out.println(roundPositiveValueToNearestInteger(42.9)); //wot
        System.out.println(roundNegativeValueToNearestInteger(-1.2));
        //everything's good
    }

    // 1. add
    public static int add(int a, int b) {
        return(a + b);
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return(add(a,b) + add(c,d) );
    }
    // 3. morningGreeting
    public static String morningGreeting(String morning){
        return("早上好, " + morning + "!");
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String afternoon){
        return("下午好, "+ afternoon + "!");
    }
    // 5. triple
    public static String triple(String meh){
        return(meh + meh + meh);
    }
    // 6. half
    public static double half(double why){
        return(why/2);
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double didTheNameReallyHaveToBeThatLong){
        return (int) (didTheNameReallyHaveToBeThatLong + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double whyIsItSoLong){
        return (int) (whyIsItSoLong - 0.5);
    }
}
