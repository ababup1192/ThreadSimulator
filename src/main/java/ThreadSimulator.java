public class ThreadSimulator {

    public ThreadSimulator() {
        for (int i = 0; i < 100; i++) {
            new Thread(new CalcThread(new Data(i + 1, "CalcThread" + (i + 1)))).start();
        }
    }

    public static void main(String args[]) {
        new ThreadSimulator();
    }
}
