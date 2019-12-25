package com.it.java.array;

/**
 * @author ljh
 * @create 2019-12-25 9:54
 */
public class YanghuiTest {
    public static void main(String[] args) {
        /**
         * 使用二维数组打印一个10行杨辉三角。
         *
         * 【提示】1.第一行有1个元素,第n行有n个元素
         *        2.每一行的第一个元素和最后一个元素都是1
         *        3.从第三行开始,对于非第一个元素和最后一个元素的元素即：
         *        yanghui[i][j]=yanghui[y-1][j-1]+yanghui[i-1][j];
         *
         */
        //1.声明并初始化数组-动态
        int [][] yanghui=new int[10][];
        //2.给数组赋值
        for (int i = 0; i <yanghui.length ; i++) {
            yanghui[i]=new int[i+1];
            //2.1给首末元素赋值
            yanghui[i][0]=yanghui[i][i]=1;
            //2.2给每行的非首末元素赋值
            if(i>1){
                for (int j=1;j<yanghui[i].length-1;j++){
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }

        }
        //3.遍历二维数组
        for (int i = 0; i <yanghui.length ; i++) {
            for (int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("======================================");
        /**
         * 定义一个int型的一维数组,包含18个元素,
         *      分别赋一些随机整数·然后求出所有元素的
         *      最大值,最小值,和值,平均值,并输出出来。
         *  要求:所有随机数都是两位数。
         */
        int[] arr =new int[10];
        System.out.print("随机数为：");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(int)(Math.random()*(99-10+1)+10);
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        //求数组元素最大值
        int maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        System.out.println("最大值为："+maxValue);
        //求数组元素最小值
        int minVale=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(minVale >arr[i]){
                minVale=arr[i];
            }
        }
        System.out.println("最小值为："+minVale);
        //求数组元素和值
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println("总和为:"+sum);
        //求数组元素平均值
        int avgVale=sum/arr.length;
        System.out.println("平均数为："+avgVale);
        System.out.println("===========================");
        /**
         * 使用简单数组
         * (1)创建一个名为ArrayTest的类,在main()方法中声明array1和array2两个变量,
         * 他们是int[]类型的数组。
         * (2)使用大括号{},把array1初始化为8个素数: 2,3,5,7,11,13, 17,19.
         * (3)显示array1的内容。
         * (4)赋值array2变量等于array1,修改array2中的偶索引元素,
         * 使其等于索引值(如array [0]=0, array [2]=2)。打印出array1.
         *
         * 思考: array1和array2是什么关系?
         *  拓展:修改题目,实现array2对array1数组的复制
         */
        int[] array1,array2;
        //显示array1的内容
        array1= new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+"\t");
        }

        //赋值array2变量等于array1
        array2=array1;
        // 修改array2中的偶索引元素
        for (int i = 0; i <array2.length ; i++) {
            if (i %2==0){
                array2[i]=i;
            }
        }
        System.out.println();
        //打印array1
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+"\t");
        }
        System.out.println();
        String[] array3=new String[]{"HH","GG","FF","DD","SS","AA"};
        //复制数组
        String[] array4=new String[array3.length];
        for (int i = 0; i <array3.length ; i++) {
            array4[i]=array3[i];
            System.out.print(array4[i]+" ");
        }
        System.out.println("愿你乘风而去！");
    
    }
}
