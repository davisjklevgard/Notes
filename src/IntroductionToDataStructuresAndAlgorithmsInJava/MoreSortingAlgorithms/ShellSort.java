package IntroductionToDataStructuresAndAlgorithmsInJava.MoreSortingAlgorithms;

public class ShellSort {
    /*
        Shell Sort
            Invented by Donald Shell
            An improved insertion sort algorithm
            works well for medium sized arrays
                having elements up to a few thousands
            made to fix a problem in Insertion sort
                you have to move a lot of elements to make place for a new element to be inserted.
                so if a small number is at the end of a long array, a lot of time will be used moving each element down
                the line to make space for the small number element
            Solution
                only fix part of the array; every fifth element, and pretend the rest does not exist yet
                you then move the index by one and sort those numbers only
                keep doing this till you are done with the first pass
                for the next round the number to be sorted is reduced to every fourth element, then third and so on
                till you only have every element to check. But that will also mean that all small numbers will be closer
                to the beginning of the array
            Knuth Sequence
                How to choose the interval between elements
                use this recursive expression: h = 3h + 1
                    h = 1
                    h = 4
                    h = 13
                    ...
                    h < data.length
                these intervals are chosen in the reverse order
                    the gaps are to be large initially, progressing smaller as the algorithm works
     */
}
