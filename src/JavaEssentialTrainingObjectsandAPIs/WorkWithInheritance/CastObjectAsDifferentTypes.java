package JavaEssentialTrainingObjectsandAPIs.WorkWithInheritance;

public class CastObjectAsDifferentTypes {
    /*
        if there are fields and methods created in a subclass, those will not be available in the superclass.
        such as pattern plaid for a shirt is not in the class ClothingItem.

        You can identify an object as the superclass while using a subclass for its uniqueness.
        ClothingItem reallyAShirt = new Shirt;

        So with this the object will be a ClothingItem but will be able to use the methods and fields in the Shirt Class

        getClass.getSimpleName() will get the class that the object is really from.
        Up casting: treating a subclass as a superclass
        Shirt shirt2 = (Shirt) reallyAShitrt;

     */
}
