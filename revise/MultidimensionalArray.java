public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("hi");
        int nums[][] = new int[3][4];
        System.out.println(nums[0][0]);
        for(int i = 0 ; i < nums.length ; i ++){
           for(int j = 0 ; j <  nums[i].length;j++){
             System.out.print(nums[i][j]);
           }
           System.out.println();
        }
    }
}
