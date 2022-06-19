package LeetCode.medium_difficulty.random_medium_tasks;

import java.util.*;
import java.util.List;

public class T_973_K_Closest_Points_to_Origin {
    // https://leetcode.com/problems/k-closest-points-to-origin/
    // Comparator Comparable CompareTo PriorityQue PQ Deque Queue
    public static void main(String[] args) {
        T_973_K_Closest_Points_to_Origin obj = new T_973_K_Closest_Points_to_Origin();

        int[][] input = {{9997, 9997},
                {9996, 9998}
        };
        int k = 1;
        int[][] expected = {{9997, 9997}};
        System.out.println(Arrays.deepToString(obj.kClosest(input, k)));
        System.out.println(Arrays.deepToString(expected));
    }

    // 35% speed (Merge sort)
    private int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        Arrays.sort(points, Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
        System.arraycopy(points, 0, result, 0, k);
        return result;
    }

    // This doesn't work for the same SUM, since Map keys cannot be equal
    private int[][] kClosest_var2(int[][] points, int k) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        int[][] result = new int[k][2];
        for (int i = 0; i < points.length; i++)
            treeMap.put(points[i][0] * points[i][0] + points[i][1] * points[i][1], i);
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            result[index] = points[entry.getValue()];
            index++;
            if (index == k) break;
        }
        return result;
    }

    // 66% speed.
    public int[][] kClosest_var3(int[][] points, int K) {
        if (points == null || points.length < 1 || points.length < K) return null;
        PriorityQueue<Point> queue = new PriorityQueue<>((p1, p2) -> p1.getEucilideanDistance() - p2.getEucilideanDistance());
        for (int[] ints : points) {
            int x = ints[0];
            int y = ints[1];
            queue.add(new Point(x, y));
        }
        int[][] result = new int[K][2];
        for (int j = 0; j < K; j++) {
            Point point = queue.remove();
            result[j][0] = point.x;
            result[j][1] = point.y;
        }
        return result;
    }

    // HeapSort - 50% speed
    public int[][] kClosest_var4(int[][] points, int K) {
        if (points == null || points.length < 1 || points.length < K) return null;
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                Comparator.comparingInt(p -> p[0] * p[0] + p[1] * p[1]));
        queue.addAll(Arrays.asList(points));
        int[][] result = new int[K][2];
        for (int j = 0; j < K; j++) result[j] = queue.remove();
        return result;
    }

    // 70% speed
    private int[][] kClosest_var5(int[][] points, int K) {
        List<SumPlace> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            int tmp = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            list.add(new SumPlace(i, tmp));
        }

        list.sort(new Comparator<SumPlace>() {
            public int compare(SumPlace d1, SumPlace d2) {
                return d1.val - d2.val;
            }
        });

        int[][] arr = new int[K][2];
        for (int i = 0; i < K; i++) {
            int idx = list.get(i).index;
            arr[i][0] = points[idx][0];
            arr[i][1] = points[idx][1];
        }
        return arr;
    }

    // speed  84.33%
    private int[][] kClosest_var6(int[][] points, int K) {
        if (points == null || points.length <= K) return points;
        int N = points.length;
        int i;
        int[][] result = new int[K][2];
        PriorityQueue<Point> queue = new PriorityQueue<>();
        for (i = 0; i < N; i++) queue.offer(new Point(points[i][0], points[i][1]));
        Point current;
        for (i = 0; i < K; i++) {
            current = queue.poll();
            result[i][0] = current.x;
            result[i][1] = current.y;
        }
        return result;
    }

    // Speed 68%
    public int[][] kClosest_var7(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });
        for (int[] point : points) {
            int dis = point[0] * point[0] + point[1] * point[1];
            pq.offer(new int[]{dis, point[0], point[1]});
            if (pq.size() > K) pq.poll();
        }
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            int[] temp = pq.poll();
            res[i][0] = temp[1];
            res[i][1] = temp[2];
        }
        return res;
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getEucilideanDistance() {
            return (x * x) + (y * y);
        }

        public int compareTo(Point p) {
            return (this.x * this.x + this.y * this.y) - (p.x * p.x + p.y * p.y);
        }

        @Override
        public int hashCode() {
            // Szudzik Pairing function
            if (this.x >= this.y) return this.x * this.x + this.x + this.y;
            else return this.x + this.y * this.y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Point)) return false;
            Point p = (Point) obj;
            return (this.x == p.x) && (this.y == p.y);
        }
    }
}

class SumPlace {
    int index;
    int val;

    SumPlace(int index, int val) {
        this.index = index;
        this.val = val;
    }
}



