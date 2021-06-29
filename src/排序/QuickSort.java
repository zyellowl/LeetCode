package 排序;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 6, 1, 7, 3};
        quick(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] a,int l,int r){
        if(l>=r)
            return;
        int p=p(a, l, r);
        quick(a,0,p-1);
        quick(a,p+1,r);
    }

    public static int p(int[] a, int l, int r) {
        while (l < r) {
            while (l < r && a[l] <= a[r]) {
                r--;
            }
            if (l < r) {
                swap(a, l, r);
            }
            while (l < r && a[l] <= a[r]) {
                l++;
            }
            if (l < r) {
                swap(a, l, r);
            }
        }
        return l;
    }

    private static void swap(int[] a, int l, int r) {
        int t=a[l];
        a[l]=a[r];
        a[r]=t;
    }
}
