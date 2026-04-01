class CircularTour {
    static int tour(int[] p,int[] d){
        int start=0, surplus=0, deficit=0;
        for(int i=0;i<p.length;i++){
            surplus += p[i]-d[i];
            if(surplus<0){
                start=i+1;
                deficit+=surplus;
                surplus=0;
            }
        }
        return (surplus+deficit>=0)?start:-1;
    }
}