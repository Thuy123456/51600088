package myjava.mybignumber;

/**
 * T�c gi?:  Nguy?n Thanh Th?y
 * DesCription.
 * Class MyBigNumber l� l?p d? C?ng 2 s? l?n b?ng 2 chu?i.
 * H�m sum trong Class MyBigNumber l� h�m d? th?c hi?n ph�p c?ng 2 chu?i s?
 */

public class MyBigNumber {

    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**
     * �? th?c hi?n ph�p c?ng, ta c?n 2 chu?i l�m tham s? cho h�m sum trong d�:
     * 2 chu?i n�y d?u ch? ch?a c�c k� s? t? '0' d?n '9'.
     * <br/>
     *
     * @param s1 chu?i s? th? nh?t.
     * @param s2 chu?i s? th? hai.
     * @return chu?i c� gi� tr? l� t?ng c?a hai s? s1 v� s2.
     */
    public String sum(final String s1, final String s2) {
        // Buoc 1: lay do dai 2 chuoi
        // Phan khai bao

        String result = "";
        String msg = "";// Chuoi msg se lam tham so cho ham send cua interface IReceiver
        int length1 = s1.length();// do dai chuoi thu 1
        int length2 = s2.length();// do dai chuoi thu 2
        int max = (length1 > length2) ? length1 : length2;// lay do dau lon nhat giua a va b
        int nho = 0;// Kh?i t?o s? nh? = 0 d? khi c?ng s? c� v�i tru?ng h?p l?n hon 9
        int pos1 = 0;// V? tr� chu?i s1
        int pos2 = 0;// V? tr� chu?i s2
        char c1;// k� t? c1 d�ng d? l?y k� t? cu?i c�ng c?a chu?i s1
        char c2;// k� t? c2 d�ng d? l?y k� t? cu?i c�ng c?a chu?i s2
        int tong = 0;// Kh?i t?o bi?n t?ng = 0 d? c?ng 2 k� t? cu?i c�ng l?i v?i nhau

        // L?p t? 0 d?n max l?n
        for (int i = 0; i < max; i++) {
            pos1 = length1 - i - 1;// c?p nh?t l?i v? tr� chu?i s1
            pos2 = length2 - i - 1;// c?p nh?t l?i v? tr� chu?i s2

            // X�t v? tr� c?a 2 chu?i xem c� >= 0 hay kh�ng
            if (pos1 >= 0) {
                c1 = s1.charAt(length1 - i - 1);// L?y k� t? ? v? tr� cu?i c�ng c?a chu?i

            } else {
                c1 = '0';
            }

            if (pos2 >= 0) {
                c2 = s2.charAt(length2 - i - 1);// L?y k� t? ? v? tr� cu?i c�ng c?a chu?i
            } else {
                c2 = '0';
            }

            tong = (c1 - '0') + (c2 - '0') + nho;// chuy?n k� t? th�nh s? xong c?ng cho s? nh?
            result = (tong % 10) + result;// L?y k?t qu? t?ng ? tr�n chia l?y du cho 10 v� gh�p v�o chu?i k?t qu?
            nho = tong / 10;// C?p nh?t l?i s? nh?

            msg = "Step " + (i + 1) + ": " + c1 + " + " + c2 + " = "
                    + (tong - nho) + " + " + nho + " = " + tong + " . Write " + (tong % 10) + " remember " + nho;
            this.ireceiver.send(msg);
        }

        if (nho >= 1) {
            result = 1 + result;// N?u s? nh? c�n du th� gh�p v�o chu?i k?t qu?
        }

        return result;// Tr? v? k?t qu? thu du?c
    }
}