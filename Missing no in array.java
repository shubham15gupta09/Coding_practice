class Solution {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		    int t;
		    t=in.nextInt();
		    while(t-->0)
		    {
				int n=in.nextInt();
				int a[]=new int[n-1];
				int sum =0;
				for(int i=0;i<n-1;i++){
					a[i]=in.nextInt();
					sum+=a[i];
				}
				 System.out.println(((n*(n+1))/2)-sum);
			}
	}
}