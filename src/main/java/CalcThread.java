public class CalcThread implements Runnable {
    private Data data;

    public CalcThread(Data data) {
        this.data = data;
    }

    // 重い計算をする。
    @Override
    public void run() {
        int result = data.calc();
        System.out.println(String.format("%s result: %7d", data.toString(), result));
    }
}
