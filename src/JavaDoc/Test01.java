package JavaDoc;
/**
* @author C����������
* @version jdk1.8.0
*/
public class Test01{
    /**
     * ����������������Χ���������ĺ�
     * @param n ���յĵ�һ����������Χ���
     * @param m ���յĵڶ�����������Χ�յ�
     * @return ����������Χ���������ĺ�
     */
    public int add(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum = sum + i;
        }
        return sum;
    }
} 