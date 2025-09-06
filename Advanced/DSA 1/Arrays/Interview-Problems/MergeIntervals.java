import java.util.ArrayList;

// TC -> O(N)
// SC -> O(N)

public class MergeIntervals {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> res = new ArrayList<>();
        int idx = 0;

        while (idx < intervals.size() && newInterval.start > intervals.get(idx).end) {
            res.add(intervals.get(idx));
            idx++;
        }

        while (idx < intervals.size() && intervals.get(idx).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(idx).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(idx).end);
            idx++;
        }
        res.add(newInterval);

        while (idx < intervals.size()) {
            res.add(intervals.get(idx));
            idx++;
        }

        return res;
    }
}
