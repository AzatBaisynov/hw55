public class C {
private Integer i;
private String s;

    public C(Integer i, String s) {
        this.i = i;
        this.s = s;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "C{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }
}
