package Sorting;

public class MergeSortCourse {
    public static void main(String[] args) {
        int arr[] = {2,4,3,9,6,7};
        mergeSort(arr,0,arr.length-1);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    public static void mergeSort(int []arr, int start , int end){
        if (start>=end ){
            return;
        }

        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end,mid);

    }
    public static void merge(int arr[], int start, int end , int mid){
        int[] temp = new int [end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;


        while(i<=mid && j<=end){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of the first sorted part
        while(i<=mid){
            arr[k++] = arr[i++];
        }
        //for leftover elements of the second sorted part
        while(j<=end){
            arr[k++] = arr[j++];
        }
        //copy the temp arr to original array
        for (k = 0, i = start; k<temp.length  ; k++ ,i++) {
            arr[i]=temp[k];
            
        }



    }
}
