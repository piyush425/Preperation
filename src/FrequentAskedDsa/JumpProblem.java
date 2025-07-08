package FrequentAskedDsa;

public class JumpProblem {


        public int jump(int[] nums) {

            int jump=1;
            int canJump=nums[0];
            int max=nums[0];
            if(nums.length==1){
                return 0;
            }
            for(int i=1;i<nums.length;i++){
                if(i==nums.length-1){
                    return jump;
                }
                max=Math.max(max,nums[i]+i);
                if(i==canJump){
                    canJump=max;
                    jump++;
                }
            }
            return jump;

        }

}
