package JavaEssentialTrainingObjectsandAPIs.UseJavaPackagesAndLibraries;
//import jdk.incubator.http.HttpClient;

public class IncludePackagesWithModules {
    /*
        API modularity: concept in Java 9, known as project Jigsaw, helps to break down you app into units known as
        modules.

        There are some packages that must be specifically included; they are part of modules.
        Some may be included in th4e Java API libraries and then dont need to be specific in their including.
        Others though may not be included, and that is where you need to be specific.
        You will go to make something new in the package, and scroll down till you see module. That is what you will
        probably need.
        See module-info.java

        Builder Object: a design pattern that lets you chain-together method calls to build an object you want
        always start with a builder by getting a referenced  to a builder object

        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(new URI(DATA_URL) )
                .GET()
                .build();

        JetBrains and a few other sources can help in understanding Java modules
     */

}
