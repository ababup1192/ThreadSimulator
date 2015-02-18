
public class Data {
    public final int id;
    public final String name;

    public Data(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 重い計算
    public int calc() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return id * id;
    }

    @Override
    public String toString() {
        return String.format("id:%5s name:%15s", id, name);
    }
}
