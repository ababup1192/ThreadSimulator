public class ThreadSimulator {

    public ThreadSimulator() {
        System.out.println("Please wait about 5 seconds");
        for (int i = 0; i < 1000; i++) {
            new Thread(new CalcThread(new Data(i + 1, "CalcThread" + (i + 1)))).start();
        }
    }

    public static void main(String args[]) {
        new ThreadSimulator();
    }
}
