public class Assert {
    private static void productAssert() {
        assert Main.product() == 1;
        assert Main.product(2) == 2;
        assert Main.product(2, 5) == 10;
        assert Main.product(2, 5, 10) == 100;
        assert Main.product(2, 5, 10, 3) == 300;

    }

    public static void main(String[] args) {
        productAssert();
    }
}
 
