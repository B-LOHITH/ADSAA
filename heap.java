import java.util.*;

class heap {
    public static void insert(int a[],int n){
        int t=a[n-1];
        int i=n-1;
        while(t>a[(i-1)/2] && i>0){
            a[i]=a[(i-1)/2];
            i=(i-1)/2;
        }
        a[i]=t;
    }
    public static void delmax(int a[], int n) {
        int item = a[n - 1];
        int ka=a[0]; 
        a[0] = a[n - 1]; 
        int i = 0;
        int k = 0;
        while (i < n / 2) { 
            int l= 2 * i + 1;
            int r = 2 * i + 2;
            if (r<n && a[l] < a[r]) {
                k = r;
            } else {
                k = l;
            }
            if (a[k] > item) {
                a[i] = a[k];
                i = k;
            } else {
                break; 
            }
        }
        a[i] = item;
        a[n-1]=ka;
    }
    static void sort(int a[],int n){
        for(int i=n;i>0;i--){
            delmax(a,i);
        }
    }
    public static void main(String args[]) {
        int n;
        int a[] = {16, 14, 10, 8,7,9,3,2,4,19};
        n=a.length;
        insert(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        sort(a,n);
        System.out.println("after sorting");
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");


        }
    }
}
