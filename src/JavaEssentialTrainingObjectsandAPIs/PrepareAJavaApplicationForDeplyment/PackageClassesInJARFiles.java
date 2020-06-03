package JavaEssentialTrainingObjectsandAPIs.PrepareAJavaApplicationForDeplyment;

public class PackageClassesInJARFiles {
    /*
        JAR file: a Java archive, that contains one or more Java classes precompiled into BI code.
        also includes an application manifest that tells how it should be run.
        used to package up applications and libraries so the they can be easily shared.

        Native code: code built with C++ or another native language

        IntelliJ calls the JAR file and artifact
        How to create an artifact:
            go to project structure, choose artifacts and click + JAR and the second option:
            from modules with dependencies.
            This makes a JAR from an existing module

        IntelliJ modules are a collection of code and other resource files.

        After creating the artifact, go to directory, META-INF, and within that go to file named MANIFEST.MF
        then go to menu, select build, and select build artifacts, Select JAR files, JAR, and build. Then it is found in
        out directory.
     */
}
