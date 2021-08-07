import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class AddTwoNumberTest {
    private static AddTwoNumber addTwoNumber = new AddTwoNumber();
    private static ListNodeHelper listNodeHelper;
    private static AddTwoNumber.Solution solution;

    private class ListNodeHelper {
        public AddTwoNumber.ListNode toListNode(Collection numbers) {
            AddTwoNumber.ListNode current = null;
            for (Object number : numbers) {
                AddTwoNumber.ListNode node = addTwoNumber.new ListNode((Integer) number, current);
                current = node;
            }
            return current;
        }

        public void listNodeEquals(AddTwoNumber.ListNode head, List numbers) {
            int j = 0;
            while (head != null) {
                Object expectedNumber = numbers.get(j);
                assertEquals(head.val, expectedNumber);

                head = head.next;
                j++;
            }
            assertEquals(j, numbers.size());
        }
    }

    @Before
    public void init() {
        listNodeHelper = new ListNodeHelper();
        solution = addTwoNumber.new Solution();
    }

    @Test
    public void test1() {
        /*Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.*/
        AddTwoNumber.ListNode l1 = listNodeHelper.toListNode(List.of(2, 4, 3));
        AddTwoNumber.ListNode l2 = listNodeHelper.toListNode(List.of(5, 6, 4));

        AddTwoNumber.ListNode headNode = solution.addTwoNumbers(l1, l2);
        listNodeHelper.listNodeEquals(headNode, List.of(7, 0, 8));
    }

    @Test
    public void test2() {
        /*Input: l1 = [0], l2 = [0]
        Output: [0]*/
        AddTwoNumber.ListNode l1 = listNodeHelper.toListNode(List.of(0));
        AddTwoNumber.ListNode l2 = listNodeHelper.toListNode(List.of(0));

        AddTwoNumber.ListNode headNode = solution.addTwoNumbers(l1, l2);
        listNodeHelper.listNodeEquals(headNode, List.of(0));
    }

    @Test
    public void test3() {
        /*Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]*/
        AddTwoNumber.ListNode l1 = listNodeHelper.toListNode(List.of(9,9,9,9,9,9,9));
        AddTwoNumber.ListNode l2 = listNodeHelper.toListNode(List.of(9,9,9,9));

        AddTwoNumber.ListNode headNode = solution.addTwoNumbers(l1, l2);
        listNodeHelper.listNodeEquals(headNode, List.of(8,9,9,9,0,0,0,1));
    }
}
