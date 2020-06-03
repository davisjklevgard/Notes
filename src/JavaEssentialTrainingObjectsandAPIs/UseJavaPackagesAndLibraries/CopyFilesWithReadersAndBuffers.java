package JavaEssentialTrainingObjectsandAPIs.UseJavaPackagesAndLibraries;

public class CopyFilesWithReadersAndBuffers {
    /*
        You do not need t ogo to the root of a file system, as java will do that by default.
        FileReader: a class that makes it easy to read or write any text file.
        EX: FileReader fr = new FileReader(exampleFile1); code might throw an exception so wrap in try-catch

        BufferReader: allows you to read the file a little bit at a time.
        EX: Buffer Reader br = new BufferReader(fr); put in after the FileReader line.

        FileWriter: writes a new file
        EX: FileWriter writer = new FileWriter(exampleFile2);

        finally clause: used to execute at the end no matter i there where exceptions or not
        Android 7 allows you to close them automatically by moving the reader and writer classes between the try () brackets
        With these three classes you can read a file and copy it into a new file. So it may be helpful in creating
        backups of manuscripts so you dont forget what you had wrote.
     */
}
