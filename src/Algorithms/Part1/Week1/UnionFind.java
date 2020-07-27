package Algorithms.Part1.Week1;

public class UnionFind {
    /*

       Steps to developing a usable algorithm
            Model the problem
            Find an algorithms to solve it
            Fast enough? fits in memory?
            If not, Figure out why.
            Find a way to address the problem
            Iterate until satisfied

        Dynamic Connectivity
            is there a connection between two objects
            the problem is to find whether there is a connection between two objects

        Applications involve manipulating objects of all types
            pixels in a digital photo
            computers in a network
            elements in a mathematical set
        when programming
            name objects 0 to N-1
            use integers as an array index
            Suppress details not relevant to union-find

        Modeling the connections
            Assume connected to is an equivalence relation
                Reflexive: p is connected to p
                Symmetric: if p is connected to q, then q is connected to p
                Transitive: if p is connected to q and q is connected to r, then p is connected to r

            Connected Components
                Maximal set of Objects that are mutually connected.
        Implementing the operations
            Find query: Check if two objects are in the came component
            Union command: Replace components containing two objects with their union
        Union-Find Data Type
            Goal: Design efficient data structure for union-find
                Number of objects N can be huge
                Number of operations < can be huge
                Find queries and union commands may be intermixed
     */
}
