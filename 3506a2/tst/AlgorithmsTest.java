//import org.junit.Test;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;
//
//public class AlgorithmsTest {
//
//    @Test(timeout=1000)
//    public void testSortQueueExample1() {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(3);
//        queue.add(5);
//        queue.add(4);
//        queue.add(2);
//        Algorithms.sortQueue(queue);
//        assertEquals(1, (int)queue.remove());
//        assertEquals(2, (int)queue.remove());
//        assertEquals(3, (int)queue.remove());
//        assertEquals(4, (int)queue.remove());
//        assertEquals(5, (int)queue.remove());
//        assertEquals(0, queue.size());
//    }
//
//    @Test(timeout=1000)
//    public void testSortQueueOnly1elements() {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//
//
//        Algorithms.sortQueue(queue);
//        assertEquals(3, (int)queue.remove());
//
//        assertEquals(0, queue.size());
//    }
//    @Test(timeout=1000)
//    public void testSortQueueOnly2elements() {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(1);
//
//        Algorithms.sortQueue(queue);
//        assertEquals(1, (int)queue.remove());
//        assertEquals(3, (int)queue.remove());
//        assertEquals(0, queue.size());
//    }
//
//
//    @Test(timeout=1000)
//    public void testSortQueueExampleEmpty() {
//        Queue<Integer> queue = new LinkedList<>();
//        Algorithms.sortQueue(queue);
//        //assertEquals(null,queue.remove());
//        assertEquals(0, queue.size());
//    }
//
//    @Test(timeout=1000)
//    public void testSortQueueExample2() {
//        Queue<String> queue = new LinkedList<>();
//        queue.add("a");
//        queue.add("b");
//        queue.add("c");
//        queue.add("b");
//        queue.add("a");
//        Algorithms.sortQueue(queue);
//        assertEquals("a", queue.remove());
//        assertEquals("a", queue.remove());
//        assertEquals("b", queue.remove());
//        assertEquals("b", queue.remove());
//    }
//}
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AlgorithmsTest {

    @Test(timeout=1000)
    public void testSortQueueExample1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(4);
        queue.add(2);
        Algorithms.sortQueue(queue);
        assertEquals(1, (int)queue.remove());
        assertEquals(2, (int)queue.remove());
        assertEquals(3, (int)queue.remove());
        assertEquals(4, (int)queue.remove());
        assertEquals(5, (int)queue.remove());
        assertEquals(0, queue.size());
    }

    @Test(timeout=1000)
    public void testSortQueueOnly1elements() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);


        Algorithms.sortQueue(queue);
        assertEquals(3, (int)queue.remove());

//        assertEquals(0, queue.size());
    }
    @Test(timeout=1000)
    public void testSortQueueOnly2elements() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);

        Algorithms.sortQueue(queue);
        assertEquals(1, (int)queue.remove());
        assertEquals(3, (int)queue.remove());

        assertEquals(0, queue.size());
    }


    @Test(timeout=1000)
    public void testSortQueueExampleEmpty() {
        Queue<Integer> queue = new LinkedList<>();
        Algorithms.sortQueue(queue);
        //assertEquals(null,queue.remove());
        assertEquals(0, queue.size());
    }

    @Test(timeout=1000)
    public void testSortQueueExample2() {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("b");
        queue.add("a");
        Algorithms.sortQueue(queue);
        assertEquals("a", queue.remove());
        assertEquals("a", queue.remove());
        assertEquals("b", queue.remove());
        assertEquals("b", queue.remove());
        assertEquals("c", queue.remove());
    }

    @Test(timeout=1000)
    public void testFindMissingNumberExample1() {
        int[] arr = {2,4,6,8,10,12,14,16,20,22,24};
        assertEquals(18, Algorithms.findMissingNumber(arr));
    }

    @Test(timeout=1000)
    public void testFindMissingNumberExampleReversedSmall() {
        int[] arr = {4, 1, -5};
        assertEquals(-2, Algorithms.findMissingNumber(arr));

    }

    @Test(timeout=1000)
    public void testFindMissingNumberExampleReversedMinimal() {
        int[] arr = {1, -5};
        assertEquals(-2, Algorithms.findMissingNumber(arr));

    }

    @Test(timeout=1000)
    public void testFindMissingNumberExampleMinimal() {
        int[] arr = {6, 8};
        assertEquals(7, Algorithms.findMissingNumber(arr));

    }


    @Test(timeout=1000)
    public void testFindMissingNumberAllSame() {
        int[] arr = {7, 7, 7,7};
        assertEquals(7, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberAllSameNegative() {
        int[] arr = {-7, -7, -7,-7};
        assertEquals(-7, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberReverseLarge() {
        int[] arr = {40,30,20,10,0,-20,-30,-40};
        assertEquals(-10, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberReverseLarge2() {
        int[] arr = {-6,-3,3,6,9,12};
        assertEquals(0, Algorithms.findMissingNumber(arr));

    }

    @Test(timeout=1000)
    public void testFindMissingNumberVeryLargeValues() {
        int[] arr = {-3000,0,3000,6000,12000};
        assertEquals(9000, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberVeryLargeValues2() {
        int[] arr = {21000,17500,10500,7000,3500,0,-3500};
        assertEquals(14000, Algorithms.findMissingNumber(arr));

    }

    @Test(timeout=1000)
    public void testFindMissingNumberReverseLarge3() {
        int[] arr = {5,3,1,-1,-3,-5,-9,-11};
        assertEquals(-7, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberReverseLarge4() {
        int[] arr = {10,5,0,-10};
        assertEquals(-5, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberReverseLarge5() {
        int[] arr = {10,2,-2};
        assertEquals(6, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testFindMissingNumberAllZero() {
        int[] arr = {0,0,0};
        assertEquals(0, Algorithms.findMissingNumber(arr));

    }
    @Test(timeout=1000)
    public void testSortQueueExample3() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(1);
        queue.add(5);
        queue.add(2);
        queue.add(2);
        Algorithms.sortQueue(queue);
        assertEquals(1, (int)queue.remove());
        assertEquals(1, (int)queue.remove());
        assertEquals(2, (int)queue.remove());
        assertEquals(2, (int)queue.remove());
        assertEquals(5, (int)queue.remove());
        assertEquals(0, queue.size());
    }
    @Test(timeout=1000)
    public void testSortQueueExampleProvided() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(4);
        queue.add(2);
        Algorithms.sortQueue(queue);
        assertEquals(1, (int)queue.remove());
        assertEquals(2, (int)queue.remove());
        assertEquals(3, (int)queue.remove());
        assertEquals(4, (int)queue.remove());
        assertEquals(5, (int)queue.remove());
        assertEquals(0, queue.size());
    }

    @Test(timeout=1000)
    public void testSortQueueExampleProvided2() {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("b");
        queue.add("a");
        Algorithms.sortQueue(queue);
        assertEquals("a", queue.remove());
        assertEquals("a", queue.remove());
        assertEquals("b", queue.remove());
        assertEquals("b", queue.remove());
        assertEquals("c", queue.remove());
    }

    @Test(timeout=1000)
    public void testFindMissingNumberExampleProvided() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 18, 20};
        assertEquals(16, Algorithms.findMissingNumber(arr));
    }

    @Test(timeout=1000)
    public void testFindMissingNumberExampleProvided2() {
        int[] arr = {4, 1, -5};
        assertEquals(-2, Algorithms.findMissingNumber(arr));
    }


}