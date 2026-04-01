class CountingSort {
    public static void sort(int[] arr){
        int max=0;
        for(int x:arr) if(x>max) max=x;
        int[] count=new int[max+1];
        for(int x:arr) count[x]++;
        int idx=0;
        for(int i=0;i<count.length;i++){
            while(count[i]-- > 0){
                arr[idx++]=i;
            }
        }
    }
}