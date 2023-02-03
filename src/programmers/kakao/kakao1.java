package programmers.kakao;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kakao1 {
    public static void solution(String[] id_list, String[] report, int k) {
        // Create a map that maps each user to a set of users that have reported them
        Map<String, Set<String>> reportedUsers = new HashMap<>();
        for (String r : report) {
            // Split the report into the user and the reported user
            String[] parts = r.split(" ");
            String user = parts[0];
            String reported = parts[1];
            // Add the reported user to the set of users that have reported the user
            if (!reportedUsers.containsKey(user)) {
                reportedUsers.put(user, new HashSet<>());
            }
            reportedUsers.get(user).add(reported);
        }

        // Create a set of suspended users
        Set<String> suspended = new HashSet<>();

        // Count the number of times each user has been reported
        Map<String, Integer> reportCounts = new HashMap<>();
        for (String user : id_list) {
            reportCounts.put(user, reportedUsers.getOrDefault(user, new HashSet<>()).size());
            // If a user has been reported more than k times, add them to the set of suspended users
            if (reportCounts.get(user) > k) {
                suspended.add(user);
            }
        }

        // Determine the number of emails each user should receive
        int[] emails = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            int emailCount = 0;
            // If the user has been suspended, add 1 email for each user that reported them
            if (suspended.contains(user)) {
                emailCount += reportedUsers.get(user).size();
            }
            // Add 1 email for each suspended user that the user reported
            for (String reported : reportedUsers.getOrDefault(user, new HashSet<>())) {
                if (suspended.contains(reported)) {
                    emailCount += 1;
                }
            }
            emails[i] = emailCount;
        }

    }
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report  = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        solution(id_list, report, 2);
//        System.out.println(Arrays.toString());
    }
}
