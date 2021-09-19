class app {
    public static void main(String[] args) {
        int m = 0, n = 0;

        int[] arr = new int[m + n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++)
            arr1[i] = arr[i];

        for (int j = n; j < n + m; j++)
            arr2[j] = arr[j];

        Arrays.fil(arr, 0);
    }

int f(int N, int[] arr1, int[] arr2, int i){
    if(i == N-1)
        return 0;
     if(arr1[i]>=arr1[i+1] && arr2[i]>=arr2[i+1])return -1;
    if(arr1[i]>=arr1[i+1] || arr2[i]>=arr2[i+1]){
        int m, n;
        swap(arr1[i], arr2[i]);
        m = f(N, arr1, arr2, i+1);
        swap(arr1[i], arr2[i]);
        swap(arr1[i+1, arr2[i+1]);
        n = f(N, arr1, arr2, i+1);
        if(m == -1 && n==-1)return -1;
        if(m==-1)return n;
        if(n==-1)return m;
        return min(m, n);
    }
    return f(N, arr1, arr2, i+1);
 }

int minSwaps(int N, int *arr1, int *arr2){
    return f(N, arr1, arr2, 0);
}
}