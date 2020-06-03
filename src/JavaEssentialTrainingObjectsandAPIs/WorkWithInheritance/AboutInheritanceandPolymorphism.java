package JavaEssentialTrainingObjectsandAPIs.WorkWithInheritance;

public class AboutInheritanceandPolymorphism {
    /*
        Inheritance: defines a relationship between classes that lets one inherit or extend functionality, like Parent/child
        EX: a super class would be the bug class, where subclasses would be ants and bees, with each having a subclass
        of their own.

        Java only supports single inheritance, meaning each class can only extend from one other class.
        C++ can allow a class to have multiple inheritance
        Java does allow for multiple interfaces.

        Superclasses dont need special code
        all classes are derived from Object class
        if a class isn't final, iut can be extended EX: public class final Test
        Fields and methods are inherited unless marked private from superclass to subclass
        Getter and setter methods can make private data accessible

        private String size;
        public String getSiz() {
            return size;
        }

        public void setSize(String size){
            this.size = size;
        }

        public class Hat extends ClothingItem (extends keyword creates the inheritance)
        @Override (an annotation, improves readability, helps catch errors,)


        Polymorphism: the ability for a object to take on multiple forms, when a parent class reference is used to
        refer to a child class object. Can call inherited methods without knowing the exact type,

        EX: ClothingItem item = new Hat();
        declared with the supertype and initialized with the sub-type.
     */
}
