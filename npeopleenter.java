import java.util.*;

class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
            temp.add(arr[i]);
        Arrays.sort(arr);
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.indexOf(arr[i]) + 1 + " ");
        }

    }

}
