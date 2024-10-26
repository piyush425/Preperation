package IntervalDsa;

public class MeetingRom {
    int[][] nums = {{1, 10}, {8, 8}, {10, 12}, {13, 18}};


}





    //with priorityqueue

//    PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
//    Arrays.sort(nums, Comparator.comparingInt(a -> a[0]));
//
//        for (int[] num :nums){
//            if(priorityQueue.isEmpty()){
//                priorityQueue.add(num[1]);
//            }
//            else {
//                if (priorityQueue.peek()>num[0]){
//                    priorityQueue.add(num[1]);
//                }
//                else {
//                    priorityQueue.remove();
//                    priorityQueue.add(num[1]);
//                }
//            }
//        }
//        System.out.println(priorityQueue.size());



//    int[][] nums = {{1, 10}, {8, 8}, {10, 12}, {7, 8},{9,11}};
//
//    int[] startTimes = new int[nums.length];
//    int[] endTimes = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//        startTimes[i] = nums[i][0];
//        endTimes[i] = nums[i][1];
//    }
//
//        Arrays.sort(startTimes);
//        Arrays.sort(endTimes);
//
//    int startPointer = 0;
//    int endPointer = 0;
//    int meetingRooms = 0;
//    int maxRooms = 0;
//
//        while (startPointer < nums.length) {
//        // If a meeting is starting before the earliest ended meeting has ended
//        if (startTimes[startPointer] < endTimes[endPointer]) {
//            meetingRooms++;
//            startPointer++;
//        } else {
//            // A meeting has ended, so reduce the room count
//            meetingRooms--;
//            endPointer++;
//        }
//
//        // Track the maximum number of rooms needed at any time
//        maxRooms = Math.max(maxRooms, meetingRooms);
//    }
//
//        System.out.println("Minimum number of meeting rooms required: " + maxRooms);




//        for (int[] n:nums){
//            System.out.println(Arrays.toString(n));
//        }
//
//        int meeting = 1;
//        int lastMeet = nums[0][1];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i][0] >=lastMeet) {  // The next meeting can start after the last meeting ends
//                meeting++;
//                lastMeet = nums[i][1];
//            }
//        }
//        System.out.println(meeting);

