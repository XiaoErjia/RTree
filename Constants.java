package rtree;

import rtree.RTNode;

public class Constants {
    public static final int MAX_NUMBER_OF_ENTRIES_IN_NODE = 20;
    public static final int MIN_NUMBER_OF_ENTRIES_IN_NODE = 8;

    public static final int RTDataNode_Dimension = 2;

    public static final int RTREE_LINEAR = 0;
    public static final int RTREE_QUADRATIC = 1;
    public static final int RTREE_EXPONENTIAL = 2;
    public static final int RSTAR = 3;

    public static final int NIL = -1;
    public static final RTNode NULL = null;
}