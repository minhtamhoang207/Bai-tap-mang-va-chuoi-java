import java.util.Scanner;

public class Bai2 {

    public static void function1(String[] athletes, int[] result1, int[] result2, int[] result3) {
        for (int i = 0; i < athletes.length; i++) {
            System.out.println(athletes[i] + " || lan 1: " + result1[i] + "kg" + " || " + " lan 2: " + result2[i] + "kg" + " || " +
                    " lan 3: " + result3[i] + "kg" + " || "
                    + " tong thanh tich: " + (result1[i] + result2[i] + result3[i]));
        }
    }

    public static void function2(String[] athletes, int[] result1, int[] result2, int[] result3) {
        int c = 0;
        int[] total = new int[10];

        for (int i = 0; i < athletes.length; i++) {
            int sum = 0;
            sum = result1[i] + result2[i] + result3[i];
            total[c] = sum;
            c++;
        }

////        for (int i=0; i< athletes.length; i++){
////            System.out.print(total[i]+ " ");
//        }
        //System.out.println("\n");
        int max = total[0];
        int maxLocate = 0;
        for (int i = 0; i < athletes.length; i++) {
            if (total[i] > max) {
                max = total[i];
                maxLocate = i;
            }
        }
        //System.out.println(maxLocate);
        System.out.println(athletes[maxLocate] + " dat tong thanh tich " + total[maxLocate] + "kg" + " ||top 1 server");

    }

    public static void function3(String[] athletes, int[] result1, int[] result2, int[] result3){
        int c=0;
        int[] total= new int[10];

        for (int i=0; i<athletes.length; i++){
            int sum=0;
            sum= result1[i] + result2[i]+ result3[i];
            total[c]= sum;
            c ++;
        }
        int max=total[0];
        int maxLocate=0;
        for(int i=0; i< athletes.length; i++){
            if (total[i]>max){
                max=total[i];
                maxLocate=i;
            }
        }
        System.out.println(athletes[maxLocate]+ " dat tong thanh tich "+  total[maxLocate]+ "kg"+" ||top 1 server");

        int max1=total[0];
        int maxLocate1=0;
        for(int i=0; i< athletes.length; i++){
            if (total[i]>max1 && total[i] < max){
                max1=total[i];
                maxLocate1=i;
            }
        }
        System.out.println(athletes[maxLocate1]+ " dat tong thanh tich "+  total[maxLocate1]+ "kg"+" ||top 2 server");

        int max2=total[0];
        int maxLocate2=0;
        for(int i=0; i< athletes.length; i++){
            if (total[i]>max2 && total[i] < max && total[i]< max1){
                max2=total[i];
                maxLocate2=i;
            }
        }
        System.out.println(athletes[maxLocate2]+ " dat tong thanh tich "+  total[maxLocate2]+ "kg"+" ||top 3 server");
    }

    public static void function4(String[]athletes){
        for (int i = 0; i < athletes.length; i++) {
            String[] arrStr = athletes[i].split("\\ ");
            if (arrStr[2].startsWith("T")) System.out.println(athletes[i] + " ||co ten bat dau voi chu T");
        }
    }

    public static void function5(String[]athletes){
        for (int i = 0; i < athletes.length; i++) {
            String[] arrStr = athletes[i].split("\\ ");
            if (arrStr[2].contains("an")) System.out.println(athletes[i] + " ||tên có vần \"an\" ");
        }
    }

    public static void function6(String[] athletes, int[] result3){
        // lan cu ta thu 3 thap nhat;
        int min=result3[0];
        for (int i=0; i<athletes.length; i++){
            if(result3[i] < min){
                min=result3[i];
            }
        }
        //System.out.println(min);

        for (int i=0; i<athletes.length; i++){
            if(result3[i]==min){
                System.out.println(athletes[i] +" ||có thành tích thấp nhất ở lượt 3:  "+min+"kg" );
            }

        }
    }

    public static void function7(String[]athletes, int[] result3){
        int maxValue=result3[0];
        for (int i=0; i<athletes.length; i++){
            if(result3[i] > maxValue){
                maxValue=result3[i];
            }
        }
        //System.out.println(maxValue);

        for (int i=0; i<athletes.length; i++){
            if(result3[i]==maxValue){
                System.out.println(athletes[i] +" ||có thành tích cao nhất ở lượt 3 - "+ maxValue+"kg");
            }

        }
    }
    public static void function8(String[] athletes, int[] result1, int[] result2, int[] result3){
        int c = 0;
        int[] total = new int[10];

        for (int i = 0; i < athletes.length; i++) {
            int sum = 0;
            sum = result1[i] + result2[i] + result3[i];
            total[c] = sum;
            c++;
        }

        String temp = "Null";
        int temp1= 0;
        for (int i=0; i< athletes.length; i++){
            for(int j=i+1; j<athletes.length; j++){
                if(athletes[i].substring(athletes[i].lastIndexOf(" ")).compareTo(athletes[j].substring(athletes[j].lastIndexOf(" "))) > 0){
                    temp = athletes[i];
                    athletes[i]= athletes[j];
                    athletes[j]= temp;

                    temp1= total[i];
                    total[i]= total[j];
                    total[j]= temp1;
                }
            }
        }
        for (int i=0; i<athletes.length; i++){
            System.out.println(athletes[i]+" ||dat thanh tich "+total[i]+"kg");
        }
    }



    public static void main(String[] args) {
        String[] athletes = {"Truong Tuan Tu", "Luong Xuan Truong", "Bui Kim Quyen", "Duong Hoai Phuong",
                "Nguyen Van Tanh", "Vuong Thu Anh", "Mai Khanh Van", "Lam Ngoc Linh", "Cao Minh Truong", "Nguyen Van Khan"};
        int[] result1 = {20, 20, 20, 40, 60, 60, 70, 80, 20, 55};
        int[] result2 = {20, 20, 20, 40, 60, 60, 64, 69, 20, 96};
        int[] result3 = {20, 20, 20, 40, 60, 60, 55, 70, 20, 70};

        Scanner sc = new Scanner(System.in);

        int loop = 1;

        do {
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    function1(athletes, result1, result2, result3);
                    break;
                case 2:
                    function2(athletes, result1, result2, result3);
                    break;
                case 3:
                    function3(athletes, result1, result2, result3);
                    break;
                case 4:
                    function4(athletes);
                    break;
                case 5:
                    function5(athletes);
                    break;
                case 6:
                    function6(athletes, result3);
                    break;
                case 7:
                    function7(athletes, result3);
                    break;
                case 8:
                    function8(athletes, result1, result2, result3);
                    break;
            }
        }
        while (loop == 1);
    }
}
































