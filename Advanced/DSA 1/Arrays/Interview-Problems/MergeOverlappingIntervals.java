import java.util.ArrayList;
import java.util.Collections;

// TC -> O(N log N)
// SC -> O(N)

public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        Collections.sort(intervals, (a, b) -> a.start - b.start);
        ArrayList<Interval> res = new ArrayList<>();
        Interval curr = intervals.get(0);
        res.add(curr);

        for (Interval interval : intervals) {

            if (interval.start <= curr.end) {
                curr.start = Math.min(curr.start, interval.start);
                curr.end = Math.max(curr.end, interval.end);
            }

            else {
                res.add(interval);
                curr = interval;
            }
        }

        return res;
    }
}
