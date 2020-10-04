class PreSufSum {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,2,8,4,7,5,9,2,5};
        int n = a.length;
        int sum=0;
        int[] presum = new int[n];
        int[] sufsum = new int[n];
        for ( int i = 0 ; i < n ; i++ ) {
            sum = sum + a[i];
            presum[i] = sum;
        }
        sum = 0;
        int k=0;
        for ( int i = n-1 ; i >=0 ; i-- ) {
            sum = sum + a[i];
            sufsum[k++] = sum;
        }
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print(presum[i] + " ");
        }
        System.out.print("\n");
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print(sufsum[i] + " ");
        }
    }
}