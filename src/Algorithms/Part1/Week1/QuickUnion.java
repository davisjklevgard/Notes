package Algorithms.Part1.Week1;

public class QuickUnion {
    /*
        Quick-union (lazy approach)
            Data structure
                Integer array id[] of size N
                Interpretation: id[i] is parent of i
                Root of i is id[id[....id[i]...]]] (keep going until it doesn't change(algorithm ensures no cycles))
            Find
                Check if p and q have the same root
            Union
                to merge components containing p and q, set id of p's root to the id of q's root
            Cost model
                Initialize: N
                Union: N
                Find: N

            Quick-find defect
                union too expensive
                trees are flat but too expensive to keep them flat

            Quick-union defect
                trees can get tall
                find too expensive
     */

    //example code
    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    // finds the parent root
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union (int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
