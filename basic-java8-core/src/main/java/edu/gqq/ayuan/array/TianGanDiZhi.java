package edu.gqq.ayuan.array;

public class TianGanDiZhi {
//    public static void main(String[] args) {
//        String[] tianGan = new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
//        String[] diZhi = new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//        //都是int的，可以用逗号隔开
//         int i = 0;
//         int j =0;
////        for (;true; i++,j++) {或者这么写
//        int cnt = 1;
//        while (cnt <=60){//计数和
//            int idxI = i % tianGan.length;
//            int idxJ = j % diZhi.length;
////            if (idxI == 0 && idxJ == 0 && i != 0 && j != 0){
////                break;
////            }
//            System.out.print(tianGan[idxI] + diZhi[idxJ] + " ");
//            if (cnt%10==0) {
//                System.out.println();
//            }
//            i++;
//            j++;
//            cnt++;
//        }
//
//    }
//
//}

//public class TianGanDiZhi {
//
//    public static void main(String[] args) {
//        String[] tianGans = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
//        String[] diZhis = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
//        //限制条件可以写boolean的返回值（调用函数），boolean表达式；boolean值
//        for (int i = 0, j = 0; true; i++, j++) {
//            int idxI = i % tianGans.length;
//            int idxJ = j % diZhis.length;
//            if (idxI == 0 && idxJ == 0 && i != 0 && j != 0) {
//                break;
//            }
//            System.out.print(tianGans[idxI] + diZhis[idxJ] + " ");
//            if (idxI == 9) {
//                System.out.println();
//            }
//        }


    public static void main(String[] args) {
        String[] tianGan = new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
        String[] diZhi = new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        int k = 1;
        int t = 0;
        int d = 0;
        while (k <= 60) {
            int tianIdx = t % tianGan.length;
            int diIdx = d % diZhi.length;


            System.out.print(tianGan[tianIdx] + diZhi[diIdx] + " ");//别忘加空格
            if (k % 10 == 0) {
                System.out.println(" ");
            }
            k++;
            t++;
            d++;
        }
    }
}