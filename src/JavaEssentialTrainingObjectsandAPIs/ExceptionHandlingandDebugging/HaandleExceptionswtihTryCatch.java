package JavaEssentialTrainingObjectsandAPIs.ExceptionHandlingandDebugging;

public class HaandleExceptionswtihTryCatch {
    /*Try-Catch
        code that will be run goes into the try block braces, if there are
        no exception the code will execute one line at a time. If successful,
        the next block will be run, skipping the catch. Any error in the code however will
        run whatever is in the catch

     */
    public static void main(String [] args){
        try {
            System.out.println("try-catch");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
