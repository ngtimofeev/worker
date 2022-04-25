package workerPackage;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}