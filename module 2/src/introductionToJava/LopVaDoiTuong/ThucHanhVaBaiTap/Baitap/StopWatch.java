package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.Baitap;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {

    }

    public long start() {
        return this.startTime = System.currentTimeMillis();

    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.getEndTime() -this.getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int arr[] = {2, 3, 6, 8, 9, 10, 25, 56, 955, 2336, 225, 444, 55, 223, 0};
        System.out.println("Time Start:" + stopWatch.start());
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("mảng sau khi đc sắp xếp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.printf("\n");
        System.out.println("Time Stop:" + stopWatch.stop()+"\n");
        long timelocal=stopWatch.getElapsedTime();
        System.out.println("Time ="+timelocal);

    }
}
