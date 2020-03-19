import java.util.Scanner;

public class BaiSo1 {
    public static void function1(String[] a, int[] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Ho " + a[i] + " dung " + (b[i] * 1600) + "đ");
        }
    }

    public static void function2(String[]infor, int[] kwh){
        int max=kwh[0];
        int max2=kwh[0];
        int max3=kwh[0];
        int maxLocate =0;
        int maxLocate2 =0;
        int maxLocate3 =0;
        int n= infor.length;
        for (int i = 0; i< n; i++){
            if (kwh[i] > max){
                max=kwh[i];
                maxLocate=i;
            }
        }

        for (int i = 0; i< n; i++){
            if (kwh[i] > max2 && kwh[i] < max){
                max2=kwh[i];
                maxLocate2 = i;
            }
        }

        for (int i = 0; i< n; i++){
            if (kwh[i] > max3 && kwh[i]<max && kwh[i] < max2){
                max3=kwh[i];
                maxLocate3=i;
            }
        }

        String abc= infor[maxLocate], xyz=infor[maxLocate2], xxx=infor[maxLocate3];
        System.out.println("ho dai gia nhat: "+ abc);
        System.out.println("ho dai gia nhi: "+ xyz);
        System.out.println("hộ dai gia ba: "+ xxx);
    }

    public static void function3(String[] infor, int[] kwh){
        int n= infor.length;
        for (int i=0; i< n; i++){
            String[] arrStr = infor[i].split("\\ ");
            if (arrStr[2].equals("Truong")) System.out.println(infor[i]+ " no day");
        }
    }

    public static void function4(String[] infor){
        int n= infor.length;
        String temp = "Null";
        for (int i=0; i< n; i++){
            for(int j=i+1; j<n; j++){
                if(infor[i].substring(infor[i].lastIndexOf(" ")).compareTo(infor[j].substring(infor[j].lastIndexOf(" "))) > 0){
                    temp = infor[i];
                    infor[i]= infor[j];
                    infor[j]= temp;
                }
            }
        }

        for (int i=0; i<n; i++){
            System.out.println(infor[i]);
        }

    }


    public static void main(String[] agrs) {

        String[] infor = {"Truong Tuan Tu", "Luong Xuan Truong", "Bui Kim Quyen", "Duong Hoai Phuong",
                "Nguyen Van Anh", "Vuong Thu Hien", "Mai Khanh Van", "Lam Ngoc Linh", "Cao Minh Truong", "Nguyen Van Khai",
                "Ngo Kim Dung"};// danh sach cac ho

        int[] kwh = {10, 20, 30, 40, 50, 60, 70, 80, 45, 55, 87};// so kwh su dung
        System.out.println("CHAO MUNG ACE\n MENU GOM CO 4 CHUC NANG\n1.In ra ten va so kwh su dung cua tung ho\n" +
                "2.In ra 3 ho su dung nhieu nhat\n" +
                "3.In ra cac ho co ten Truong\n" +
                "4.Sap xep ten cac ho theo bang chu cai..\n" +
                "XIN MOI CHON TU 1 den 4:....");

        Scanner sc = new Scanner(System.in);

        int loop = 1;

        do{
            int key=sc.nextInt();
            switch (key) {
                case 1:
                    function1(infor, kwh);//in ra ten va so kwh su dung
                    break;
                case 2:
                    function2(infor, kwh);//3 ho su dung nhieu nhat
                    break;
                case 3:
                    function3(infor, kwh);//cac ho ten Truong
                    break;
                case 4:
                    function4(infor);// sap xep theo ten
                    break;

            }
        }
        while (loop==1);


    }
}