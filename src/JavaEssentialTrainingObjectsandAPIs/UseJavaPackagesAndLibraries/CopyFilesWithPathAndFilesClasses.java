package JavaEssentialTrainingObjectsandAPIs.UseJavaPackagesAndLibraries;

public class CopyFilesWithPathAndFilesClasses {
    /*
        From Java 7 there are easier ways to copy files

        Path: represents a file or a directory
        EX: Path exampleFile = Paths.get("files", "example.txt");
        files is where the text will be located, and then the name of the file
        this can be used to find and make a file.

        Files.copy(exampleFile, exampleFile2, StandardCopyOption.REPLACE_EXISTING);
        Replace will overwrite any file that has the same name as the one that you wish to make

        this is all found in the new io classes for java
     */
}
