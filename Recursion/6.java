class JumpGame{

    public static void main(String[] args) {
        int[] array = {3,0,8,2,0,0,1};
        System.out.println(JG(array,0));
    }

    public static boolean JG(int[] nums, int index){
        int value = 1;
        boolean bool = false ;
        
        if(index >= (nums.length-1) || nums.length == 1)
            return true ;
        else{
            while(value <= nums[index]){
                bool = JG(nums, index+value) || bool ;
                value++;
            }
            return bool ;
        }
    }

}