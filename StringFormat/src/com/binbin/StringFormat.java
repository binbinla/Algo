package com.binbin;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ts = "dgv%s%sA";
		char[] tx = new char[]{'A','C','D'};
		StringFormat sf = new StringFormat();
		System.out.println(sf.formatString(ts, 8, tx, 3));
	}

	public String formatString(String A, int n, char[] arg, int m) {
		// write code here

		if (n > 500 || n < m)
			return null;
		for (int i = 0; i < n; i++) {
			char t = A.charAt(i);
			if (!((t >= 'a' && t <= 'z') || (t >= 'A' && t <= 'Z') || t == '%'))
				return null;
		}
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '%') {
				sb.append(arg[j++]);
				i++;
			} else {
				sb.append(A.charAt(i));
			}
		}
		while (m > j) {
			sb.append(arg[j++]);
		}
		return sb.toString();

	}
}
