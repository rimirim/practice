package ArrayTest;

import ArrayTest.DoubleArray;
import ArrayTest.TripleArray;

public class WhatArray {
    int dimension;
    DoubleArray DA;
    TripleArray TA;

    public void initarray (int dim) {
        dimension = dim;

        if (dim == 2) {
            DA = new DoubleArray();
            DA.initMatrix();
            DA.printMatrix();
        } else if (dim == 3) {
            TA = new TripleArray();
            TA.initMatrix();
            TA.printMatrix();
        }

    }

}

