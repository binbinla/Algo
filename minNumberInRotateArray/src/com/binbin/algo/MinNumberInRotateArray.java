package com.binbin.algo;

public class MinNumberInRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumberInRotateArray test = new MinNumberInRotateArray();
		int[] array1 = new int[]{18,24,45,80,5,7,10};
		int res =test.minNumberInRotateArray(array1);
		System.out.println(res);
	}
	public int minNumberInRotateArray(int [] array) {
    	int len = array.length;
        if(len == 0) return 0;
        if(len == 1) return array[0];
        for(int i = 0;i < len - 1;i++){
            if(array[i] > array[i+1])
               return array[i+1];
        }
        return 0;
    }
}
