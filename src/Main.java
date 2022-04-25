import workerPackage.OnTaskDoneListener;
import workerPackage.OnTaskErrorListener;
import workerPackage.Worker;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener linester = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        Worker worker = new Worker(linester, errorListener);

        worker.start();

    }
}