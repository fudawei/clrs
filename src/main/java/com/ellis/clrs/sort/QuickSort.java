package com.ellis.clrs.sort;

import com.ellis.clrs.util.PrintUtil;

/**
 * Created by fudw on 17-2-16.
 */
public class QuickSort {

   public void sort(int[] array, int left, int right) {
      if (left > right) {
          return ;
      }

      int i,j,tmp;
      tmp = array[left];
      i = left;
      j = right;

      while (i < j) {
          while (array[j] >= tmp && i < j) {
              j --;
          }
          while (array[i] <= tmp && i < j) {
              i ++;
          }
          if (i < j) {
              switchValue(array, i, j);
          }
      }
      System.out.println("start:" + left + " right:" + right);
      System.out.println("start:" + left + " right:" + (i-1));
      System.out.println("start:" + (j+1) + " right:" + right);
      System.out.println();


     switchValue(array, i, left);
      sort(array, left, i -1);
      sort(array, j + 1, right);
   }
  public void switchValue(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }


}
