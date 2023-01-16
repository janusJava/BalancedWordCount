public class Test extends BalancedWordsCounter{

    public static void main(String[] args) throws Exception {

        System.out.println("TESTS!");

        System.out.println("TEST | 1");
        int answerOne = count("aabbabcccba");
        System.out.println(answerOne);

        System.out.println("TEST | 2");
        int answerTwo = count("");
        System.out.println(answerTwo);

        System.out.println("TEST | 3");
        int answerThree = count("abababa1");
        System.out.println(answerThree);

        System.out.println("TEST | 4");
        int answerFour = count(null);
        System.out.println(answerFour);
    }
}