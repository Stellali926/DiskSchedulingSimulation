public abstract class FCFS extends SSTF{
    static void fcfs(Disk disk){
        int count = 0;
        int head = disk.startPos;
        for(int i = 0 ; i < disk.numberOfRequest ; i++){
            if(head > disk.request[i]){
                count += head - disk.request[i];
            }else{
                count += disk.request[i] - head;
            }
            head = disk.request[i];
        }
        if( checkZero(disk))
            count = 0;

        int[] result = new int[disk.numberOfRequest+1];
        for(int i = 0; i < disk.numberOfRequest; ++i){
            result[i+1] = disk.request[i];
        }
        result[0] = disk.startPos;
        disk.request = result;
        calculate(disk,disk.request,count);
    }

    static boolean checkZero(Disk checkdisk){
        for(int i = 0 ; i < checkdisk.numberOfRequest; i++){
            if(checkdisk.request[0] != checkdisk.request[i]) {
                return false;
            }
        }
        return true;
    }
}