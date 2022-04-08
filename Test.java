import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();

        t.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int middle = 0;
        int curr = 0;
        int posOne = 0;
        int posTwo = 0;
        ArrayList<Integer> rel = new ArrayList<>();

        int length = nums1.length + nums2.length;

        middle = length / 2 + 1;

        while (curr < middle) {
            if (posOne == nums1.length) {
                rel.add(curr, nums2[posTwo]);
                posTwo++;
                curr++;
                break;
            }

            if (posTwo == nums2.length) {
                rel.add(curr, nums1[posOne]);
                posOne++;
                curr++;
                break;
            }

            if (nums1[posOne] > nums2[posTwo]) {
                rel.add(curr, nums2[posTwo]);
                posTwo++;
            } else if (nums1[posOne] < nums2[posTwo]) {
                rel.add(curr, nums1[posOne]);
                posOne++;
            } else {
                rel.add(curr, nums1[posOne]);
                curr++;
                rel.add(curr, nums2[posTwo]);

                posOne++;
                posTwo++;
            }

            curr++;
        }

        if ((length & 1) == 1) {
            return (double) rel.get(middle - 1);
        } else {
            return (rel.get(middle - 1) + rel.get(middle - 2)) / 2.0;
        }
    }
}
