package classes;

public class OrderMaterial {
    private String materialCode;
    private int count;

    public OrderMaterial(String materialCode, int count) {
        this.materialCode = materialCode;
        this.count = count;
    }

    @Override
    public String toString() {
        return "OrderMaterial{" +
                "materialCode='" + materialCode + '\'' +
                ", count=" + count +
                '}';
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public int getCount() {
        return count;
    }
}
