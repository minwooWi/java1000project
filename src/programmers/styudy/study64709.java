package programmers.styudy;

public class study64709 {
    public static long solution(int goal, int[] durations) {
        int maxDuration = 0; // 가장 오래 걸리는 시간
        for (int d : durations) maxDuration = Math.max(maxDuration, d);

        long hours = finishHours(goal, durations, maxDuration);
        return calcPay(hours, durations, maxDuration);
    }

    private static long finishHours(int goal, int[] durations, int maxDuration) {
        long min = 0;
        // 최대로 걸리는 시간은 모든 작업자가 가장 오래 걸리는 시간만큼 작업하는 경우
        // 목표량을 작업자 수로 나누면 소수점 버림이 생기니까 1을 더해 넉넉한 최대값을 만들어 줌
        long max = maxDuration * (goal / durations.length + 1L);

        while (min < max) {
            long mid = (min + max) / 2;

            int count = 0;
            for (int d : durations) count += mid / d;

            if (count < goal) min = mid + 1;
            else max = mid;
        }

        return max;
    }

    private static long calcPay(long hours, int[] durations, int maxDuration) {
        // 가장 적은 인형의 개수는 작업시간이 가장 오래 걸리는 작업자가 만든 경우
        long minCount = hours / maxDuration;

        long incentive = 0;
        for (int d : durations) {
            incentive += hours / d - minCount;
        }
        return incentive * 10_000L; // 개 당 10,000원;
    }

    public static void main(String[] args) {
        System.out.println(solution(43,new int[]{5,3,7,6,4}));
    }
}
