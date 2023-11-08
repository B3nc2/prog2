public class Assert {
    private static void uresAssert() {
        Verem v1 = new Verem();
        assert v1.size() > 0 == false;
    }

    private static void sizeAssert() {
        Verem v1 = new Verem();
        v1.append(5);
        v1.append(7);
        assert v1.size() == 2;
    }

    public static void main(String[] args) {
        uresAssert();
        sizeAssert();
    }
}
