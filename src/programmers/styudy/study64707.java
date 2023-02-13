package programmers.styudy;

public class study64707 {
    public static int solution(int storey) {
        return elevator(storey);
    }

    private static int elevator(int floor) {
        if(floor <= 1) return floor;

        int under10 = floor % 10;
        int rest = floor / 10;

        int c1 = under10 + elevator(rest);
        int c2 = (10 - under10) + elevator(rest + 1);
        return Math.min(c1, c2);
    }


    public static void main(String[] args) {
        //expect 6
        System.out.println(solution(16));
        //expect 16
        System.out.println(solution(2554));
    }
}
