package binary_trees;

import java.awt.*;
import java.util.Scanner;

public class BinaryTreeUse {

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//
//        root.left = rootLeft;
//        root.right = rootRight;
//
//        BinaryTreeNode<Integer> leftOne = new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> rightOne = new BinaryTreeNode<>(5);
//        rootLeft.right = leftOne;
//        rootRight.left = rightOne;
        BinaryTreeNode <Integer> root = takeInputBetter(true,0,false);
//        printTree(root);
//        System.out.println();

        printTreeDetailed(root);
        System.out.println(numNodes(root));
        System.out.println(sumNodes(root));
        System.out.println("Left Sum: " + leftSum(root));
    }
//  Normal Print
    public static void printTree (BinaryTreeNode <Integer> root){
        if(root==null){
            return;
        }

        System.out.print(root.data);
        printTree(root.left);
        printTree(root.right);
    }

//    Detailed Tree Print
    public static void printTreeDetailed(BinaryTreeNode <Integer> root){
        if(root==null){
            return;
        }

        System.out.print(root.data + ": ");

        if(root.left!=null){
            System.out.print("L" + root.left.data +",");
        }

        if(root.right!=null){
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static BinaryTreeNode <Integer> takeInput(){
        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode <Integer> leftChild = takeInput();
        BinaryTreeNode <Integer> rightChild = takeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.print("Enter root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc  = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }

        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode <Integer> leftChild = takeInputBetter(false, rootData,true);
        BinaryTreeNode <Integer> rightChild = takeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1+ leftNodeCount + rightNodeCount;
    }

    public static int sumNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int smallSum = sumNodes(root.left) + sumNodes(root.right);
        return root.data + smallSum;
    }

    public static int leftSum (BinaryTreeNode <Integer> root){
        if(root==null){
            return -1;
        }

        if(root.right!=null){
            return 0;
        }

        int smallSum = leftSum(root.left) + leftSum(root.right);
        return smallSum + root.data;
    }
}
