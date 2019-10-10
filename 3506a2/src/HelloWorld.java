public class HelloWorld {

    public static void main(String[] args) {
        int[]numbers={20,10,0,-20,-30,-40};
        int len = numbers.length;
        int l = 0;
        int r = len - 1;
        int diff = (numbers[r] - numbers[l]) / len;
        System.out.println( diff );
        find(l,r,diff,numbers);

}
    public static int find(int l, int r,int diff, int[] numbers) {
        int mid = l+(r-l)/2;
        if (l <= r) {
            if (numbers[mid] - numbers[l] == (mid - l) * diff) {
                if (numbers[mid + 1] - numbers[mid] == diff) {

                    l = mid + 1;
                    find( l, r, diff, numbers );
                }
                else{
                    System.out.println( "cnm" );
                    r=mid+1;
                    if (diff < 0) {
                        System.out.println( r +"bm");
                        System.out.println( numbers[r] - diff );
                        return numbers[r] - diff;
                    } else {
                        System.out.println( r +"nm");
                        System.out.println(numbers[r - 1] - diff);
                        return numbers[r - 1] - diff;
                    }
                }


            } else {
                r = mid;
                find(l,r,diff,numbers);

            }
        }
        else{
            if (diff < 0) {
                System.out.println( r +"bm");
                System.out.println( numbers[r] - diff );
                return numbers[r] - diff;
            } else {
                System.out.println( r +"nm");
                System.out.println(numbers[r - 1] - diff);
                return numbers[r - 1] - diff;
            }
        }
        if (diff < 0) {
            System.out.println( r +"bm");
            System.out.println( numbers[r] - diff );
            return numbers[r] - diff;
        } else {
            System.out.println( r +"nm");
            System.out.println(numbers[r - 1] - diff);
            return numbers[r - 1] - diff;
        }
    }


}