package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public static void main(String[] args) {
        Error processNull = new Error();
        Error processInterrupted = new Error(false, 130, "Interrupted process");
        Error processError = new Error(true, 1, "ArrayIndexOutOfBoundsException");
        processNull.printInfo();
        processInterrupted.printInfo();
        processError.printInfo();
    }

    public void printInfo() {
        System.out.println("Exception: " + this.active);
        System.out.println("Process finished with exit code " + this.status);
        System.out.println("Info: " + this.message + "\n");
    }
}
