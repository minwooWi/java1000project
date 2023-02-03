package programmers.level2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class lessons155651 {
    public static int solution(String[][] book_time) {
        int answer = 0;
        int n = book_time.length;
        int[] start_times = new int[n];
        int[] end_times = new int[n];

        for (int i = 0; i < n; i++) {
            start_times[i] = convertToMinutes(book_time[i][0]);
            end_times[i] = convertToMinutes(book_time[i][1]) + 10;
        }
        // {"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}
        Arrays.sort(start_times);
        Arrays.sort(end_times);

        Queue<Integer> end_queue = new PriorityQueue<>();

        for (int i = 0, j = 0; i < n; i++) {
            while (j < n && start_times[j] <= end_times[i]) {
                end_queue.offer(end_times[j]);
                j++;
            }

            end_queue.poll();

            answer = Math.max(answer, end_queue.size());
        }

        return answer;
    }

    private static int convertToMinutes(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        return hours * 60 + minutes;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}));
    }
}