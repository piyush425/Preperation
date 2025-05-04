package BinaryTree;


import java.util.LinkedList;
import java.util.Queue;


public class Tree {
    static class Node{
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }


    public static void preOrder(Node root){

        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    /**
     *      1
     *      / \
     *     2   3
     *    / \   \
     *   4   5   6
     */
    public static void  inOrder(Node root){

        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    /**
     *      1
     *      / \
     *     2   3
     *    / \   \
     *   4   5   6
     */
    public static void  postOrder(Node root){

        if (root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }

    public static Integer countOfNodes(Node node){
        if(node==null){
            return 0;
        }

        int leftNode=countOfNodes(node.left);
        int rightNode=countOfNodes(node.right);

        return leftNode+rightNode+1;
    }

    public static Integer sumOfNodes(Node node){
        if(node==null){
            return 0;
        }

        int leftSumNode=sumOfNodes(node.left);
        int rightSumNode=sumOfNodes(node.right);

        return leftSumNode+rightSumNode+node.data;
    }

    public static Integer maxHeightOfNodes(Node node){
        if(node==null){
            return 0;
        }
        int leftHeightNode=maxHeightOfNodes(node.left);
        int rightHeightNode=maxHeightOfNodes(node.right);

        int maxHeight=Math.max(leftHeightNode,rightHeightNode)+1;

        return maxHeight;

    }


    public static Integer diameter(Node node){
        if (node==null){
            return 0;
        }

        int diam1=diameter(node.left);
        int diam2=diameter(node.right);
        int diam3=maxHeightOfNodes(node.left)+maxHeightOfNodes(node.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    /**
     *      1
     *      / \
     *     2   3
     *    / \   \
     *   4   5   6
     */


    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currentNode=q.remove();
            if (currentNode==null){
                if (q.isEmpty()){
                    break;
                }
                else {
                    System.out.println();
                    q.add(null);
                }

            }
            else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if (currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
    }

    public  static  class BinaryTree{

        int idx=-1;
        public  Node binaryCalculation(int[] Node){
            idx++;

            if(Node[idx]==-1){
                return null;
            }
            Node node=new Node(Node[idx]);
            node.left=binaryCalculation(Node);
            node.right=binaryCalculation(Node);

            return node;

        }
    }

    public static void main(String[] args) {

        /**
         *      1
         *      / \
         *     2   3
         *    / \   \
         *   4   5   6
         */
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree=new BinaryTree();
        Node root= binaryTree.binaryCalculation(nodes);
        System.out.println(root.data);
        System.out.println();
        System.out.println("PRE-------------------ORDER");
        preOrder(root);
        System.out.println();
        System.out.println("IN--------------------ORDER");
        inOrder(root);
        System.out.println();
        System.out.println("POST------------------ORDER");
        postOrder(root);
        System.out.println();
        System.out.println("LEVEL-----------------ORDER");
        levelOrder(root);
        System.out.println();
        System.out.println("COUNT-----------------NODES");
        System.out.println(countOfNodes(root));
        System.out.println("SUM-------------------NODES");
        System.out.println(sumOfNodes(root));
        System.out.println("HEIGHT----------------NODES");
        System.out.println(maxHeightOfNodes(root));
        System.out.println("DIAMETER--------------NODES");
        System.out.println(diameter(root));
        System.out.println();
        System.out.println();
        System.out.println("**--------**END**--------**");
    }
}
