package edu.hw2.task4;

@SuppressWarnings("MagicNumber")
public record CallingInfo(String className, String methodName) {
    public static CallingInfo callingInfo() {
        Thread current = Thread.currentThread();
        StackTraceElement[] stackTraceElements = current.getStackTrace();
        if (stackTraceElements.length >= 3) {
            StackTraceElement caller = stackTraceElements[2];
            String className = caller.getClassName();
            String methodName = caller.getMethodName();
            return new CallingInfo(className, methodName);
        }
        return null;
    }
}
