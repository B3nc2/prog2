public class Test {
    private static void absAssert() {
    assert Math.abs(-5) == 5;
    assert Math.abs(5) == 5;
    assert Math.abs(0) == 0;
    }
    private static void maxAssert() {
        assert Math.max(20, 10) == 20;
    }
    private static void duplazAssert() {
        assert MyUtils.duplaz(6) == 12;
        assert MyUtils.duplaz(0) == 0;
    }
    

    private static void strlenAssert() {
        assert MyUtils.strlen("hellóka") == 7;
        assert MyUtils.strlen("") == 0;
        
    }
    public static void main(String[] args) {
        absAssert();
        maxAssert();
        duplazAssert();
        strlenAssert();
    }
}
