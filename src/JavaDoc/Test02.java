package JavaDoc;

/**
 * Created by szh on 2017/11/10.
 *
 * @author szh
 */
public class Test02 {
 
 
    /***
     * getCurrentTime ��ȡ��ǰ��ʱ��
     * <p>
     *     ����Ƿ�������ϸ����<br>
     *     ����һ�о�����������������<br>
     *     </p>
     * @param kk  ��Ч����,��û�б�ʹ�õ�
     * @return long����  ��ǰ��ʱ��
     */
    public long getCurrentTime(int kk) {
        return System.currentTimeMillis();
    }
 
 
    /**
     * show �����ļ���.
     * <p>
     *     show ��������ϸ˵����һ��<br>
     *     show ��������ϸ˵���ڶ���
     * @param b true ��ʾ��ʾ��false ��ʾ����
     */
    public void show(boolean b) {
        System.out.println("time : ");;
    }
 
    public static void main(String[] args) {
 
        long time = new Test02().getCurrentTime(22);
        System.out.println("time : " + time);
    }
 
}