package programmers.styudy;

public class study64704 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        //요구사항 : 모든아파트에 전파를 전달하는 기지국을 설치하고 기지국의 갯수 리턴
        //1.아파트 시작위치
        int pos=1;
        //2. 설치된 기지국을 꺼내오기위한 인덱스변수
        int si=0;

        //3. 전체 아파트 범위 n 만큼 pos을 이동시킨다.
        while(pos <= n){
            //6. 설치된 기지국만꺼내오기위해서 length 길이값으로 제한
            //길이값제한을 하지않을 경우 stations[si] - w <= pos 전체 n 을 벗어나
            //out of index 발생
            //7. stations[si] - w 설치된기지국의 전파범위 왼쪽부터
            // pos 현재 위치가 작거나 같다는의미는 이미 설치되어있다는 의미이기때문에
            // pos 현재 위치를 전파범위 바깥으로 이동시켜준다.

            //8. 설치된 기지국을 확인했기때문에 인덱스변수 ++ 증가.
            if(si < stations.length && stations[si] - w <= pos){
                pos = stations[si] + w + 1;
                si++;
            } else{
                //4. 기지국설치
                answer+=1;
                //5. 기지국이 설치된이후에 pos 위치를 전파범위밖으로 이동시킨다.
                pos+= w * 2 + 1; //
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //expect 3
        System.out.println(solution(11, new int[]{4,11}, 1));
        //expect 3
        System.out.println(solution(16, new int[]{9}, 2));
    }
}
