package sort;
/*
插入排序
 */
public class Insertion {
    public static void sort(int[] a){
        //按照升序
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }
}
