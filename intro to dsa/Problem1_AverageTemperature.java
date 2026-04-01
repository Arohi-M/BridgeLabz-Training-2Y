class Problem1_AverageTemperature {

    // Correct Algorithm A
    static double averageA(int[] temp){
        int total = 0;
        for(int i=0;i<temp.length;i++){
            total += temp[i];
        }
        return (double) total / temp.length;
    }

    // Incorrect Algorithm B (for demonstration)
    static double averageB(int[] temp){
        double sum = temp[0];
        for(int i=1;i<temp.length;i++){
            sum += temp[i];
        }
        for(int i=0;i<temp.length;i++){
            sum = sum / temp.length; // WRONG LOGIC
        }
        return sum;
    }
}