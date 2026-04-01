class Problem4_SortingAnalysis {

    // Just reference implementations for understanding

    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j]; arr[j]=arr[j+1]; arr[j+1]=t;
                }
            }
        }
    }

    static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i], j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j]; j--;
            }
            arr[j+1]=key;
        }
    }
}