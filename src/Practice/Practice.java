package Practice;

import java.sql.Timestamp;
import java.util.*;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        Map<String,Config> congigMap=new HashMap<>();
        congigMap.put("Info",new Config(1000,20,10));
        congigMap.put("Warning",new Config(1000,20,10));
        congigMap.put("Critical",new Config(1000,20,10));
        congigMap.put("Blocker",new Config(1000,20,10));

        String[] types={"Critical","Blocker","Warning","Info"};

        Map<String, List<String>> userSubscription=new HashMap<>();
        userSubscription.put("Info",Arrays.asList("user1","user2"));
        userSubscription.put("Warning",Arrays.asList("user1","user2"));
        userSubscription.put("Critical",Arrays.asList("user1","user2"));
        userSubscription.put("Blocker",Arrays.asList("user1","user2"));

        long currentTimeStamp=  (System.currentTimeMillis()/1000);

        Logprocessing logprocessing=new Logprocessing(congigMap,userSubscription);



        Random random=new Random();

        for(int i=0;i<50;i++){
            long timestamp=currentTimeStamp+i;
            String type=types[random.nextInt()];

            logprocessing.processing(timestamp,type);

            Thread.sleep(4000);

        }



    }

    static class Config{

        private int frequency;
        private int duration;
        private int waitTime;

        public Config(int frequency,int duration, int waitTime){
            this.frequency=frequency;
            this.duration=duration;
            this.waitTime=waitTime;
        }


        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getWaitTime() {
            return waitTime;
        }

        public void setWaitTime(int waitTime) {
            this.waitTime = waitTime;
        }
    }


    static class Logprocessing{

        Map<String,Config> congigMap;
        Map<String, List<String>> userSubscription;
        Map<String,Deque<Long>> eventWindow;
        Map<String,Long> timedWait;




        public Logprocessing(Map<String,Config> congigMap, Map<String, List<String>> userSubscription){

            this.congigMap=congigMap;
            this.userSubscription=userSubscription;
            this.eventWindow=new HashMap<>();
            this.timedWait=new HashMap<>();
        }

        public void processing(long timestamp, String type){

            eventWindow.putIfAbsent(type,new LinkedList<>());

            Config config=congigMap.get(type);

            Deque<Long> window=eventWindow.get(type);
            window.addLast(timestamp);

            if(window.size()>config.frequency){
                notify();
                window.clear();
            }

        }


    }


}
