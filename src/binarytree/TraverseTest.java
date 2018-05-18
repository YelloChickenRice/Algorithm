package binarytree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * created by IDEA
 *
 * @author: jinze
 * @Date: 18-5-8
 * @Time: 下午2:51
 */
public class TraverseTest {

    @org.junit.Test
    public void preOrderTraversal() {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        node1.right=node2;
        node2.left=node3;
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        assertEquals(result,new Traverse().preOrderTraversal(node1));

    }

    @Test
    public void inOrderTraversal() {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        node1.right=node2;
        node2.left=node3;
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(2);
        assertEquals(result,new Traverse().inOrderTraversal(node1));
    }
}