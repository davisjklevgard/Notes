package Algorithms.Part1.Week1;

public class QuickFind {
    /*

        Data Structure
            integer array id[] of size N
            Interpretation: p and q are connected iff (if and only if) they have the same id.
        Find
            Check if p and q hae the same id

        Union
            to merge components containing p and q, change all entries whose id equals id[p] to id[q]

        Cost model
            number of array accesses (for read or write)
            Order of Growth
                Initialize: N
                Union: N
                Find: 1
        Quick-find defect
            Union is too expensive

     */

    //example code
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union (int p, int q){
        int pid = p;
        int qid = q;
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid) {
                id [i] = qid;
            }
        }
    }
}
