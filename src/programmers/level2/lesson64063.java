package programmers.level2;

import java.util.*;

public class lesson64063 {
    public static String solution(long k, long[] room_number) {
        int n = room_number.length;
        long[] allocatedRooms = new long[n];
        Set<Long> roomOccupancy = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            long roomRequest = room_number[i];
            Long roomToAllocate = roomRequest;
            while (roomOccupancy.contains(roomToAllocate)) {
                roomToAllocate++;
            }
            roomOccupancy.add(roomToAllocate);
            allocatedRooms[i] = roomToAllocate;
        }
        return Arrays.toString(allocatedRooms);
    }

    public static void main(String[] args) {

        System.out.println(solution(10 , new long[]{1,3,4,1,3,1}));
    }

}

