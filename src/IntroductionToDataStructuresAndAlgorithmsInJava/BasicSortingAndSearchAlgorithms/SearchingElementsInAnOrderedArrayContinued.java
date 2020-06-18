package IntroductionToDataStructuresAndAlgorithmsInJava.BasicSortingAndSearchAlgorithms;

public class SearchingElementsInAnOrderedArrayContinued {
    /*
        It is a similar approach to find an element in an ordered array. You start at the midpoint of the array,
        the middle index,
        finding the middle can be used by this formula: max index of teh array plus minimum index of the remaining array
        divided by 2.
        if there is a decimal in the number, you round down. or have the number be an int in the program

        Using this formula, you can block out part of the array that is not going to be searched, like the left or right
        part.

        This search is called Binary search
            every time we are reducing the search space by half

        Worst case time complexity is O(log to the base 2 of n)
            This is a really fast algorithm
     */
}
