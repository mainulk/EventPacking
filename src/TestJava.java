import java.util.*;
import java.util.stream.Collectors;

public class TestJava {
    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        list = new ArrayList<>(set);
        Map<String, Integer> map = new HashMap<>();
        List<String> listt = map.keySet().stream().sorted().filter(key -> key.startsWith("")).collect(Collectors.toList());

        String str = "hello world";
        System.out.println(str);
        int arr[] = new int[]{1,2,3,4};
    }

}

