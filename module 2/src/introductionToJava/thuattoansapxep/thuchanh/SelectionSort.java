package introductionToJava.thuattoansapxep.thuchanh;

import java.util.Collections;

public class SelectionSort {
     static double[] list={1,3,0};
    public static void slectionSort(double[] list){
        for (int i = 0; i <list.length-1 ; i++) {
            double currentMin=list[i];
            int currentMinIndex=i;
            for (int j = i+1; j <list.length ; j++) {
                if(currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!= i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }

    }

    public static void main(String[] args) {
        slectionSort(list);
        for (double liste:list) {
            System.out.println(liste+" ");
        }
    }
}
