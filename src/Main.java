public class Main extends CLOOK{
    private final static int cylinder_size = 5000;
    private final static int num_request = 10;
    private final static int current_pos = 2255;
    private final static int[] request_array = {2055, 1175, 2304, 2700, 513, 1680, 256, 1401, 4922, 3692};

    public static void main(String[] args) {
        Disk disk = new Disk(cylinder_size, current_pos, num_request, request_array);
        System.out.println("************************************" + "\nWe have default value of:\ncylinder size: 5000" +
                "\ncurrent position: 2255\nnext request array: 2055, 1175, 2304, 2700, 513, 1608, 256, 1401, 4922, " +
                "3692\n************************************");
        for (int i = 0; i < 6; i++) {
            System.out.println("=================================================================");
            select_algorithms(copyDisk(disk), i);
        }

        System.out.println("=================================================================");
    }

    private static void select_algorithms(Disk disk, int algorithm_num) {
        switch (algorithm_num) {
            case 0:
                System.out.println("First Come First Serve:");
                fcfs(disk);
                break;
            case 1:
                System.out.println("Shortest Seek Time First:");
                sstf(disk);
                break;
            case 2:
                System.out.println("SCAN: Elevator Algorithm:");
                scan(disk);
                break;
            case 3:
                System.out.println("CSCAN: Similar to SCAN but severing in one direction only:");
                cscan(disk);
                break;
            case 4:
                System.out.println("LOOK:"
                );
                look(disk);
                break;
            case 5:
                System.out.println("C-LOOK:");
                clook(disk);
                break;
        }
    }

    private static Disk copyDisk(Disk disk) {
        Disk newDisk = new Disk();
        newDisk.cylinder = disk.cylinder;
        newDisk.startPos = disk.startPos;
        newDisk.numberOfRequest = disk.numberOfRequest;
        newDisk.request = new int[disk.request.length];
        for (int i = 0; i < disk.request.length; i++) {
            newDisk.request[i] = disk.request[i];
        }

        return newDisk;
    }
}