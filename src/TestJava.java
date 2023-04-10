import java.util.*;
import java.util.stream.Collectors;

public class TestJava {
    public static void main (String[] args) {
        int arr[][] = {{4,10},{3,4,12},{0,8,9,10,13},{1,5,7},{2,6},{9,4,10,11,12},{11,13}};
        EventPacking ob = new EventPacking();
        ob.solve(arr);
    }

}

