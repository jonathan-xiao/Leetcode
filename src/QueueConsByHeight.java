import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class QueueConsByHeight {
    void main(String[] args){

    }

    public int[][] reconstructQueue(int[][] people){
        Arrays.sort(people, (a, b) -> {
            if (a[0] != b[0]) return b[0] - a[0];
            return a[1] - b[1];
        });
        List<int[]> res = new ArrayList<>();
        for (int[] person : people) {
            res.add(person[1], person);
        }
        return res.toArray(new int[people.length][2]);
    }
}
