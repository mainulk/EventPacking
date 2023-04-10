import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventPacking {
    public void solve(int[][] meetings) {

        boolean[] flags = new boolean[100];
        int max = Integer.MIN_VALUE;
        List<Integer> maxIndexes = new ArrayList<>();
        for (int k = 0; k < meetings.length; k++) {
            List<Integer> indexes = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < meetings.length; i++) {
                if ( i != k) {
                    boolean doublePick = false;
                    for (int j = 0; j < meetings[i].length; j++) {
                        if (flags[meetings[i][j]]) {
                            doublePick = true;
                            break;
                        }
                    }
                    if (!doublePick) {
                        for (int j = 0; j < meetings[i].length; j++) {
                            flags[meetings[i][j]] = true;
                        }
                        count += meetings[i].length;
                        indexes.add(i);
                    }
                }
            }
            if (count > max) {
                max = count;
                maxIndexes.clear();
                maxIndexes.addAll(indexes);
                indexes.clear();
            }
        }
        System.out.println(max);
        maxIndexes.forEach(System.out::println);
    }
}
