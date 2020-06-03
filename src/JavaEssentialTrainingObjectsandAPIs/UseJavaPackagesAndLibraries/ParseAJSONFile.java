package JavaEssentialTrainingObjectsandAPIs.UseJavaPackagesAndLibraries;

public class ParseAJSONFile {
    /*
        You can download many opens source libraries and have your code do more than if you were just using java.

        JSON was made by google and you can find it on github under gson
        It will come as a jar file, and there are two ways to add it as a library.
        One is the way I was able to do so before, the other is to have the jar as a file, right click and go to
        Add as Library

        Gson is a class that is a member of the package com.google.gson
        Gson gson = new Gson();

        Objects that have a close method will be put into a try-catch method in () after try, It is called
        try-with-resources syntax. and these objects must have a close method

        using JSONReader
        FileReader fileReader = new FileReader(fileName);
        JsonReader reader = new JsonReader(fileReader);

        to Parse in JSON
        Example[] ex = gson.fromJson(reader, Example[].class);
     */
}
