import java.util.List;
public class Assert {
    
    private static void rangeAssert() {
        assert PyUtils.range(4, 20, 2).equals(List.of(4, 6, 8, 10, 12, 14, 16, 18));
        assert PyUtils.range(0, 5).equals(List.of(0, 1,2,3, 4));
        assert PyUtils.range(10).equals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        
    }

    public static void main(String[] args) {
        rangeAssert();
    }
}
