package programmers.test1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem1 {
    static class Customer {
        final int arrivedAt;
        final String name;

        Customer(String name, String arrivedAt) {
            this.name = name;
            this.arrivedAt = parseTime(arrivedAt);
        }

        private int parseTime(String time) {
            // 시간(String)을 분(Int)으로 변경
            String[] s = time.split(":");
            return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
        }
    }
    static class Solution {
        public static String[] solution(String[][] booked, String[][] unbooked) {
            // Convert to Customer objects
            Queue<Customer> bookedCustomers = new LinkedList<>();
            for (String[] customer : booked) {
                bookedCustomers.offer(new Customer(customer[1], customer[0]));
            }
            Queue<Customer> unbookedCustomers = new LinkedList<>();
            for (String[] customer : unbooked) {
                unbookedCustomers.offer(new Customer(customer[1], customer[0]));
            }

            List<String> answer = new LinkedList<>();

            // Start time is the arrival time of the earliest customer
            int currentTime = Math.min(bookedCustomers.peek().arrivedAt, unbookedCustomers.peek().arrivedAt);

            while (!bookedCustomers.isEmpty() || !unbookedCustomers.isEmpty()) {
                if (bookedCustomers.isEmpty()) {
                    // Add remaining unbooked customers and exit
                    for (Customer c : unbookedCustomers) answer.add(c.name);
                    break;
                }
                if (unbookedCustomers.isEmpty()) {
                    // Add remaining booked customers and exit
                    for (Customer c : bookedCustomers) answer.add(c.name);
                    break;
                }

                final Customer bookedCustomer = bookedCustomers.peek();
                final Customer unbookedCustomer = unbookedCustomers.peek();

                if (currentTime >= bookedCustomer.arrivedAt) {
                    // Serve booked customer immediately if current time is after the arrival time
                    answer.add(bookedCustomers.poll().name);
                    currentTime += 10; // Next evaluation time is 10 minutes after end of the call
                } else if (currentTime >= unbookedCustomer.arrivedAt) {
                    // Serve unbooked customer immediately if current time is after the arrival time
                    answer.add(unbookedCustomers.poll().name);
                    currentTime += 10; // Next evaluation time is 10 minutes after end of the call
                } else {
                    Customer c;
                    // Serve the earliest customer, either booked or unbooked
                    if (bookedCustomer.arrivedAt < unbookedCustomer.arrivedAt) {
                        c = bookedCustomers.poll();
                    } else {
                        c = unbookedCustomers.poll();
                    }
                    // Next evaluation time is 10 minutes after the end of the call
                    currentTime = c.arrivedAt + 10;
                    answer.add(c.name);
                }
            }
            return answer.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(new String[][]{}, new String[][]{}));
    }
}
