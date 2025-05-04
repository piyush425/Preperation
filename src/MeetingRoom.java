import java.io.*;
import java.util.*;

public class MeetingRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int[] people = new int[N];
        int[] start = new int[N];
        int[] end = new int[N];

        String[] peopleInput = br.readLine().trim().split(" ");
        String[] startInput = br.readLine().trim().split(" ");
        String[] endInput = br.readLine().trim().split(" ");

        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(peopleInput[i]);
            start[i] = Integer.parseInt(startInput[i]);
            end[i] = Integer.parseInt(endInput[i]);
        }

        System.out.println(solve(N, people, start, end));
    }

    public static int solve(int N, int[] people, int[] start, int[] end) {
        int[][] meetings = new int[N][3];  // Store (people, start, end)

        for (int i = 0; i < N; i++) {
            meetings[i][0] = people[i];
            meetings[i][1] = start[i];
            meetings[i][2] = end[i];
        }

        // Sort meetings by end time (if equal, sort by start time to maintain order)
        Arrays.sort(meetings, (a, b) -> a[2] == b[2] ? a[1] - b[1] : a[2] - b[2]);

        int lastEndTime = -1;  // Last scheduled meeting end time
        int missedPeople = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i][1] > lastEndTime) {
                // Schedule the meeting
                lastEndTime = meetings[i][2];
            } else {
                // Meeting conflicts, count missed people
                missedPeople += meetings[i][0];
            }
        }

        return missedPeople;
    }
}
