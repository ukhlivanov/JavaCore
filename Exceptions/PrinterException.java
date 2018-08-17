package Exceptions;



public class PrinterException extends  Exception{
    private int errorCodeA;
    private int errorCodeB;
    private String document;

    public PrinterException(int errorCodeA, int errorCodeB, String document) {
        this.errorCodeA = errorCodeA;
        this.errorCodeB = errorCodeB;
        this.document = document;
    }

    public PrinterException(Throwable t, int errorCodeA, int errorCodeB, String document) {
        super(t);
        this.errorCodeA = errorCodeA;
        this.errorCodeB = errorCodeB;
        this.document = document;
    }

    public int getErrorCodeA() {
        return errorCodeA;
    }



    public int getErrorCodeB() {
        return errorCodeB;
    }



    public String getDocument() {
        return document;
    }

}
