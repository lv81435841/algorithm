package javaSE;

public class acwing32 {
    public void reOrderArray(int[] array) {
        int l=0,r=array.length-1;
        while(l<r) {
            while(array[l]%2==1 && l<r){
                l++;
            }
            while(array[r]%2==0 && l<r){
                r--;
            }
            if(l < r){
                int temp=array[l];
                array[l]=array[r];
                array[r]=temp;
            }
        }
    }
}
