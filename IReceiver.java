package myjava.mybignumber;

/**
 * T�c gi?: Nguyen Thanh Th?y
 * DesCription.
 * IReceiver l� interface cho ph�p in t?ng bu?c c?ng 2 s?
 * H�m send cho h�m cho ph�p ta in ra chu?i
 */
public interface IReceiver {

    /*
     * �? th?c hi?n vi?c in t?ng bu?c c?ng 2 chu?i s?
     * th� l?p n�o implements interface n�y th� ph?i hi?n th?c
     * h�m send c?a IReceiver
     * <br/>
     *
     * @since 2018
     */

    public abstract void send(String msg);
}