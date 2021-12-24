package JavaDoc;

/**
 * Created by szh on 2017/11/10.
 *
 * @author szh
 */
public class Test02 {
 
 
    /***
     * getCurrentTime 获取当前的时间
     * <p>
     *     这个是方法的详细描述<br>
     *     另起一行就行描述：啊哈哈哈<br>
     *     </p>
     * @param kk  无效参数,并没有被使用到
     * @return long类型  当前的时间
     */
    public long getCurrentTime(int kk) {
        return System.currentTimeMillis();
    }
 
 
    /**
     * show 方法的简述.
     * <p>
     *     show 方法的详细说明第一行<br>
     *     show 方法的详细说明第二行
     * @param b true 表示显示，false 表示隐藏
     */
    public void show(boolean b) {
        System.out.println("time : ");;
    }
 
    public static void main(String[] args) {
 
        long time = new Test02().getCurrentTime(22);
        System.out.println("time : " + time);
    }
 
}