package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {
    @Test
    public void testEmptyPop() {
        IntLinkedList linkedList = new IntLinkedList();
        int result = linkedList.pop();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testEmptyTop() {
        IntLinkedList linkedList = new IntLinkedList();
        int result = linkedList.top();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList linkedList = new IntLinkedList();
        boolean result = linkedList.isEmpty();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList linkedList = new IntLinkedList();
        boolean result = linkedList.isFull();
        Assert.assertFalse(result);
    }

    @Test
    public void testPushPop() {
        IntLinkedList linkedList = new IntLinkedList();
        int expectedValue = 4;
        linkedList.push(expectedValue);
        int result = linkedList.pop();
        Assert.assertEquals(expectedValue, result);
    }

    @Test
    public void testMultiPushPop() {
        IntLinkedList linkedList = new IntLinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        int result = linkedList.pop();
        Assert.assertEquals(4, result);
    }

}
