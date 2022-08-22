import test.intellij.delete.TimePass;

public class MainTestClass {
    private static int i;

    public static void main(String[] args) {
        System.out.println("Timepass...");

        int i = 0;
        boolean b =false;
        MainTestClass test = new MainTestClass();
        test.testMethod(b,i);
        new TimePass().getName();
    }

    public void testMethod(boolean bDetail, int a){
        final String test_string = "Test String";
    }
}
