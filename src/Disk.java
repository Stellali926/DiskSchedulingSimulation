public class Disk {

    int cylinder;
    int startPos;
    int numberOfRequest;
    int[] request;

    public Disk(){
    }

    /**
     * Initialize all variables
     * @param size Cylinder size
     * @param position Current header position
     * @param numOfReq Number of requests
     * @param request_array All requests
     */
    public Disk(int size, int position,int numOfReq,int[] request_array) {
        cylinder = size;
        startPos = position;
        numberOfRequest = numOfReq;
        request = new int[numOfReq];
        request = request_array;
    }
}