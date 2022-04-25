package workerPackage;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}