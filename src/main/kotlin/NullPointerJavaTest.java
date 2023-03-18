public class NullPointerJavaTest {
    public static void main(String[] args) {
        JHelper jHelper = new JHelper();
        jHelper.M();
        System.out.println(JHelper.jF());
    }
}

class JHelper {
    public static JHelper jF() {
        return null;
    }

    public void M() {
    }
}
