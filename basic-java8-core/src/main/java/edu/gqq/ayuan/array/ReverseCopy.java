package edu.gqq.ayuan.array;

public class ReverseCopy {
    public static void main(String[] args) {
        ReverseCopy();
    }

    //
//
    public static void ReverseCopy() {
        String original[] = new String[]{"a", "b", "c", "d", "e", "f"};
        String copy[] = new String[original.length];
//        int index=original.length;
        int index = 0;
        for (int i = original.length - 1; i >= 0; i--) {//下标最多就是长度减一
            copy[index] = original[i];
//        for(int i = 0;i < original.length;i++){
//            copy[index]=original[i];
//            index--;
            index++;
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "  ");//下标要写i，不能写index!!!
        }

    }
}

