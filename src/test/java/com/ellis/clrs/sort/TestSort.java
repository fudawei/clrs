package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;
import org.junit.Test;

/**
 * Created by fudw on 17-2-16.
 */
public class TestSort {

    final int[] array = new int[]{87, 42, 22, 76, 3, 77, 79, 54, 81, 91, 37, 12, 24, 55, 77, 82, 3, 30, 84, 65 ,79, 47, 48, 4, 76, 11, 41, 57, 78, 24};

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
    }

    @Test
    public void testQuikSort(){
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);
        PrintUtil.PrintArray(array);
    }
}