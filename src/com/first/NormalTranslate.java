package com.first;

public class NormalTranslate {
    public static void main(String[] args) {
        NormalTranslate nt = new NormalTranslate();
        nt.testDouble();
        nt.testInt();
        nt.testStringToInt();
        nt.testMath();
        nt.MathProject();
    }

    public void testDouble() {
        double m = 78.5;
        String str1 = Double.toString(m);
        String str2 = String.valueOf(m);
        String str3 = m + "";
        System.out.println(str1+ " " + str2 + " " + str3);
    }
    public void testInt() {
        int c = 10;
        String str1 = Integer.toString(c);
        String str2 = String.valueOf(c);
        String str3 = c + "";
        System.out.println(str1+ " " + str2 + " " + str3);
    }

    public void testStringToInt() {
        String str = "100";
        int str1 = Integer.parseInt(str);
        int str2 = Integer.valueOf(str);
        double str3 = Double.parseDouble(str);
        System.out.println(str1+ " " + str2 + " " + str3 );
    }

    public void testMath() {
        double a = 12.81;
        int b = (int) a;
        System.out.println("强制转换类型: " + b);
        long c = Math.round(a);// 调用round方法，进行四舍五入
        System.out.println("四舍五入:" + c);
        int d = (int) Math.floor(a);// 调用floor方法，返回小于参数的最小整数
        System.out.println("d = " + d);
        double e = Math.ceil(a);// 调用floor方法，返回大于参数的最小整数
        System.out.println("e = " + e);
        double x = Math.random();
        System.out.println("x = " + x);
        int y = (int) (Math.random() * 99);// 返回[0, 99)之间的随机数
        System.out.println("y = " + y);
        
    }

    public void MathProject() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int x = (int) (Math.random() * 10);
            nums[i] = x;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
