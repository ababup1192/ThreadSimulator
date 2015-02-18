public class CalcThread implements Runnable {
    private Data data;

    public CalcThread(Data data) {
        this.data = data;
    }

    // 重い計算をする。
    @Override
    public void run() {
        int result = data.calc();
        System.out.println(data.toString() + " result:" + result);
    }
}
