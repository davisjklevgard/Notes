package IntroductionToDataStructuresAndAlgorithmsInJava.Recursion;

public class MergeStepPseudocode {
    /*MERGE
        Merge(A, start, mid, end)
            n1 = mid - start + 1
            n2 = end - mid
            LetLeft[0...n1] and right[0...n2] //new temp arrays
            for i = 0 to n1-1
                left [i] = A [start + i]
            for j = 0 to n2 - 1
                right [j] = A[mid +1 +j]
            i, j = 0
            for k = start to end
                if left [i] <= right[j]
                    A[k] = left[i]
                    i = i + 1
                else A[k] = right[j]
                    j = j + 1
     */
}
