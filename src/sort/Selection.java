package sort;
/*
选择排序
 */
public class Selection {
    public static void sort(int[] a){
        //假设按照升序排列
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i;j<N;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
