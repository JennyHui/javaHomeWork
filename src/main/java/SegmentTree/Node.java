package SegmentTree;

public class Node {
    private int left, right;//左右区间的值
    private boolean cover;//表示是否被覆盖
    private int count;//表示此节点表示的线段区间出现的次数（被覆盖的次数），默认为0
    private Node leftChild;
    private Node rightChild;

    public Node(int left, int right) {
        this.left = left;
        this.right = right;
        cover = false;
        count = 0;
    }

    /*
     * 外部接口
     * 建立一棵线段树
     * */
    public void build(int left, int right) {
        Node root = new Node(left, right);
        build(root);
    }

    /*
     * 内部接口
     * 建立一棵线段树
     * */
    private void build(Node root) {
        int left = root.left;
        int right = root.right;
        //root节点为叶子节点
        if (right - left == 1) {
            return;
        } else if (right - left > 1) {
            int mid = (left + right) >> 1;////将左右区间平分
            Node leftNode = new Node(left, mid);
            Node rightNode = new Node(mid, right);
            root.leftChild = leftNode;
            root.rightChild = rightNode;
//        递归的创建左右子树
            build(leftNode);
            build(rightNode);
        }
    }
}
