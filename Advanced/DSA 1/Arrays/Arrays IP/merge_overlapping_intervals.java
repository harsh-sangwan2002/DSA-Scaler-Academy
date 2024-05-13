import java.util.ArrayList;
import java.util.Collections;

public class merge_overlapping_intervals {

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if (intervals.size() == 1)
            return intervals;

        Collections.sort(intervals, (a, b) -> a.start - b.start);

        ArrayList<Interval> res = new ArrayList<>();
        Interval current = intervals.get(0);
        res.add(current);

        for (int i = 1; i < intervals.size(); i++) {

            Interval temp = intervals.get(i);

            if (temp.start <= current.end) {
                current.start = Math.min(current.start, temp.start);
                current.end = Math.max(current.end, temp.end);
            }

            else {

                res.add(temp);
                current = temp;
            }
        }

        return res;
    }
}
