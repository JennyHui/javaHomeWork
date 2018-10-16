package SegmentTree;

public class SegmentTree {
    Node root;
    /*
     * 外部接口
     * 建立一棵线段树
     * */
    public void build(int left,int right){
        root = new Node(left, right);
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
            Node rightNode = new Node(mid , right);
            root.leftChild = leftNode;
            root.rightChild = rightNode;
//        递归的创建左右子树
            build(leftNode);
            build(rightNode);
        }
    }

    /*
     * 插入一条线段[c,d]的外部接口
     * c为左端点
     * d为右端点
     * root 为此线段树的根节点
     * */
    public void insert(int c, int d) {
        insert(c,d,root);
    }
    /*
     * 插入一条线段[c,d]的内部接口
     * c为左端点
     * d为右端点
     * root 为此线段树的根节点
     * */
    private void insert(int c, int d, Node node) {
        if(node==null||c<node.left||d>node.right){
            System.out.println("输入的参数不合法!"+"c:"+c+" "+"d:"+d);
            System.out.println("root:"+node.left+" "+node.right);

            return ;
        }
        int mid=(node.left+node.right)>>1;
        if(d<=mid){
            insert(c,d,node.leftChild);
        }

        else if(c>=mid)
            insert(c,d,node.rightChild);
        else {
            insert(c,mid,node.leftChild);
            insert(mid,d,node.rightChild);
        }
    }

    //    线段树的树节点
    class Node {
        int left, right;//左右区间的值
        Node leftChild;
        Node rightChild;

        Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        SegmentTree segmentTree = new SegmentTree();
        segmentTree.build(1, 30);
        System.out.println(segmentTree.root);
    }
}