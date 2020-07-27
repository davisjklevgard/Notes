import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation  {
    private int[] id;

    public Percolation(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    //opens the site if it is not open already
    public void open(int row, int col){
        int r1 = row;
        int c1 = col;
        for (int i = 0; i < id.length; i++){
            if(id[i] == r1) {
                id[i] = c1;
            }
        }
    }
    // is site open
    public boolean isOpen(int row, int col){
        return id[row] == id[col];
    }
    //is the site full?
    public boolean isFull(int row, int col){
        return id[row] == id[col];
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
    //returns the number of open sites
    public int numberOfOpenSites(){
        int count = 0;
        for (int i = 0; i < id.length; i++){
            int open = isOpen( , );
                    count++;
        }
        return count;
    }
    // does the system percolate
    public boolean percolates() {
        return 20<=24 == 0<=4;
    }

    public static void main(String[] args) {

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
