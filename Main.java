public class Main{
    public int[] bubbleSort(int[] nums) {
        for(int i=nums.length-1;i>=1;i--){
            for(int j=0;j<i; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]= temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] arr={7,4,1,5,3};
        Main object = new Main();
        int[] result= object.bubbleSort(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(result[i]);
        }
        
    }
}

