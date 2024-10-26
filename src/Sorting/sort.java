package Sorting;

public class sort {
}

//Hashmap Sorting
//Map<String,Integer> map=new HashMap<>();
//        map.put("piyush",26);
//                map.put("Ranjan",29);
//                map.put("Badal",33);
//                map.put("Chotu",28);
//
//                Map<Integer,String> reverseMap=new HashMap<>();
//        TreeMap<String,Integer> tre=new TreeMap<>(map);
//
//        for (Map.Entry<String,Integer> itr:tre.entrySet()){
//        System.out.println(itr.getKey()+"-"+itr.getValue());
//        reverseMap.put(itr.getValue(),itr.getKey());
//        }
//        System.out.println("________________________________________");
//        TreeMap<Integer,String> treeMap=new TreeMap<>(reverseMap);
//
//        for (Map.Entry<Integer,String> result:treeMap.entrySet()){
//        System.out.println(result.getValue()+"-"+result.getKey());
//        }

//    Map<String,Integer> map=new HashMap<>();
//        map.put("piyush",26);
//                map.put("Ranjan",29);
//                map.put("Badal",33);
//                map.put("Chotu",28);
//
//                List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//@Override
//public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//        return o1.getValue().compareTo(o2.getValue());
//        }
//        });
//
//        LinkedHashMap<String,Integer> linkedHashmap=new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> itr:list){
//        System.out.println(itr.getKey()+"-"+itr.getValue());
//        linkedHashmap.put(itr.getKey(),itr.getValue());
//        }
//
//        for (Map.Entry<String,Integer> result:linkedHashmap.entrySet()){
//        System.out.println(result.getValue());
//        }



//******************************merge sort******************************************
//    private static void sortNums(int[] nums, int left, int right) {
//
//        if (left<right){
//            int mid=left + (right - left) / 2;
//
//            sortNums(nums,left,mid);
//            sortNums(nums,mid+1,right);
//            mergeSorts(nums,left,mid,right);
//        }
//    }
//    private static void mergeSorts(int[] nums, int left, int mid, int right) {
//
//        int n1=mid-left+1;
//        int n2=right-mid;
//
//        int[] L1=new int[n1];
//        int[] L2=new int[n2];
//
//        for(int i=0;i<n1;i++){
//            L1[i]=nums[left+i];
//        }
//        for(int j=0;j<n2;j++){
//            L2[j]=nums[mid+1+j];
//        }
//
//        int i=0;
//        int j=0;
//        int k=left;
//
//        while (i<n1 && j<n2){
//            if(L1[i]<=L2[j]){
//                nums[k]=L1[i];
//                i++;
//            }
//            else{
//                nums[k]=L2[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i<n1){
//            nums[k]=L1[i];
//            i++;
//            k++;
//        }
//        while(j<n2){
//            nums[k]=L2[j];
//            j++;
//            k++;
//        }
//
//    }


//******Linklidlist sort

//    public ListNode sortList(ListNode head) {
//
//        if(head.next==null || head==null){
//            return head;
//        }
//
//        ListNode middle=getMiddle(head);
//        ListNode rightNode=middle.next;
//        middle.next=null;
//
//        ListNode left=sortList(head);
//        ListNode right=sortList(rightNode);
//
//        return mergeSorts(left,right);
//
//    }
//
//    private ListNode getMiddle(ListNode head) {
//        if (head==null || head.next==null){
//            return head;
//        }
//        ListNode slow=head;
//        ListNode fast=head;
//
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//
//        }
//        return  slow;
//    }
//
//    private ListNode mergeSorts(ListNode left, ListNode right) {
//
//        ListNode newNode=new ListNode(0);
//        ListNode temp=newNode;
//
//        while (left!=null && right!=null){
//            if(left.val<right.val){
//                temp.next=left;
//                left=left.next;
//            }
//            else{
//                temp.next=right;
//                right=right.next;
//            }
//            temp=temp.next;
//        }
//
//        if(left!=null){
//            temp.next=left;
//        }
//        if(right!=null){
//            temp.next=right;
//        }
//        return newNode.next;
//
//
//
//    }

//*****************************  QUICK  SORT **************************
//public class Main {
//    public static void main(String[] args) {
//
//        int[] arr={7,9,6,4,10,5};
//        quickSort(arr,0,arr.length-1);
//        for (int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
//    private static void quickSort(int[] arr, int low, int high) {
//
//        if (low<=high){
//            int paviot=getPaviotValue(arr,low,high);
//            quickSort(arr,low,paviot-1);
//            quickSort(arr,paviot+1,high);
//        }
//    }



//    private static int getPaviotValue(int[] arr, int low, int high) {
//
//        int paviot=arr[high];
//        int i=low-1;
//
//        for(int j=low;j<high;j++){
//            if(arr[j]<=paviot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        i++;
//        int temp=arr[i];
//        arr[i]=arr[high];
//        arr[high]=temp;
//        return i;
//    }


