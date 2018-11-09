public abstract class Result {

    static double calculate(Disk disk, int[] request, int movement){
        float avg = (float) movement/request.length;
        float percent = (avg/(disk.cylinder-1));

        for(int i = 0; i < request.length ; i++)
            System.out.print(request[i] + " ");
        System.out.println("");
        System.out.println("Total Head Movement Distance: " + movement);
        System.out.println("Average: " + avg);
        System.out.println("Disk Load: "+percent*100+"%");
        return percent;
    }

}