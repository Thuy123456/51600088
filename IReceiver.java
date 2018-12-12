package myjava.mybignumber;

/**
 * Tác gi?: Nguyen Thanh Th?y
 * DesCription.
 * IReceiver là interface cho phép in t?ng bu?c c?ng 2 s?
 * Hàm send cho hàm cho phép ta in ra chu?i
 */
public interface IReceiver {

    /*
     * Ð? th?c hi?n vi?c in t?ng bu?c c?ng 2 chu?i s?
     * thì l?p nào implements interface này thì ph?i hi?n th?c
     * hàm send c?a IReceiver
     * <br/>
     *
     * @since 2018
     */

    public abstract void send(String msg);
}