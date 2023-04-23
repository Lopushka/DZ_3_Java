package EX_1;

import java.util.Arrays;

/**
 * EX_1
 */
public class EX_1 {

    public static int[] mergSort(int[] sortArray) {
        int [] buf1 = Arrays.copyOf(sortArray, sortArray.length);
        int [] buf2 = new int[sortArray.length];
        int [] result = mergSortInner(buf1, buf2, 0, sortArray.length);
        return result;

    }

    public static int[] mergSortInner( int[] buf1, int [] buf2, int strIn, int endIn){
        if (strIn>=endIn-1) {
            return buf1;
            
        }
        int mid = strIn+(endIn-strIn)/2;
        int[] sort1 = mergSortInner(buf1, buf2, strIn, mid);
        int[] sort2 = mergSortInner(buf1, buf2, mid, endIn);
        int ind1 = strIn;
        int ind2 = mid;
        int destIn = strIn;
        int[] result = sort1 == buf1?buf2:buf1;
        while (ind1<mid&& ind2<endIn) {
            result[destIn++] = sort1[ind1]< sort2[ind2]?sort1[ind1++]:sort2[ind2++];
            
        }
        while(ind1<mid){
            result[destIn++]=sort1[ind1++];
        }
        while (ind2<endIn) {
            result[destIn++]= sort2[ind2++];
        }
        return result;

    }
    public static void main(String[] args) {
        int[] sortArr =new int[8];
        for (int index = 0; index < sortArr.length; index++) {
            sortArr[index]=(int)Math.round(Math.random()*100);
        }
        System.out.println("Random arr: " + Arrays.toString(sortArr));
        int[]result = mergSort(sortArr);
        System.out.println("Sort merg: "+Arrays.toString(result));
    }
}