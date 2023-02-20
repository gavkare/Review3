package Review3;
import java.util.Arrays;
import java.util.Scanner;

public class CountOfSmallerElet {

    public static void main(String[] args) {
        int[] array ={1,1,6,8,1, 6 ,2,3,2,1};
        int  min=array[0];
        int count=0;
        for(int i=1;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("minimum element is " +min);
        for(int i=0;i< array.length;i++){
            if(array[i]==min){
                count = count+1;
            }
        }
        System.out.println("the elemnt appeared "+ count+" times");
    }
}