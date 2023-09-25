package classes;

public class Part {
    private String materialCode;
    private int count;

    public Part(String materialCode, int count) {
        this.materialCode = materialCode;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Part{" +
                "materialCode='" + materialCode + '\'' +
                ", count=" + count +
                '}';
    }


    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public int getCount() {
        return count;
    }
}
