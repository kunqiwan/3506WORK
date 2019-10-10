import java.util.Queue;

public class Algorithms {

    /**
     * Given a queue and sort it from small to big.
     * To solve this problem, firstly, we loop the whole queue and find the max number,
     * and we put it on the end of the queue.
     * Then we loop n-1 time and find the second max number, then put it on the end of queue.
     * Finally, you can get the sorted queue automatically.
     *
     * @param queue the queue to sort
     */
    public static <T extends Comparable <T>> void sortQueue(Queue <T> queue) {
        //current -the first element in the queue,use to compare with the max number
        T current;
        // the max number in the queue
        T max;
        // prepared variable -  use to exchange the value between current and max
        T tem;
        // number- the number of element which is already sorted
        int number;
        // n - the size of the queue
        int n = queue.size();
        number = 1;
        max = queue.poll();
        if (n == 1) {
            queue.offer( max );
        } else {
            while (number < n) {
                for (int c = 0; c < n - number; c++) {
                    current = queue.poll();
                    if (current.compareTo( max ) > 0) {
                        tem = max;
                        max = current;
                        current = tem;
                        queue.offer( current );
                    } else if (current.compareTo( max ) < 0) {
                        queue.offer( current );
                    } else if (current.compareTo( max ) == 0) {
                        queue.offer( current );
                    }
                }
                queue.add( max );
                for (int z = 0; z < number - 1; z++) {
                    queue.add( queue.poll() );
                }

                number++;
                if (number != n) {
                    max = queue.poll();
                }
            }
        }
    }


    /**
     * Given an arithmetic sequence and finding the missing number of this list.
     * To solve this problem, we use a binary search method.
     * Firstly, we calculate the difference of this list.
     * Then we pick the mid position of this list.
     * Compare two number's difference to find the missing number.
     * find is a iterate function here.
     * @param numbers the arithmetic sequence
     * @return the missing number in the sequence
     */
    public static int findMissingNumber(int[] numbers) {
        //len -the length of the list
        int len = numbers.length;
        //l-left position
        int l = 0;
        //r-rightmost position of this list
        int r = len - 1;
        //diff-the difference of this list
        int diff = (numbers[r] - numbers[l]) / len;
        // missing- the missing number
        int missing = find( l, r, diff, numbers );
        return missing;
    }

    public static int find(int l, int r, int diff, int[] numbers) {
        int mid = l + (r - l) / 2;
        if (numbers[l] == numbers[r]) {
            return numbers[l];
        }
        if (l <= r) {
            if (numbers[mid] - numbers[l] == (mid - l) * diff) {
                if (numbers[mid + 1] - numbers[mid] == diff) {
                    l = mid + 1;
                    return find( l, r, diff, numbers );
                } else {
                    r = mid + 1;
                    if (diff < 0) {
                        return numbers[r] - diff;
                    } else {
                        return numbers[r] - diff;
                    }
                }
            } else {
                r = mid;
                if (diff < 0) {
                    return numbers[r - 1] + diff;

                } else {
                    return numbers[r] - diff;
                }
            }
        } else {
            if (diff < 0) {
                return numbers[r] - diff;
            } else {
                return numbers[r] - diff;
            }
        }
    }
}










