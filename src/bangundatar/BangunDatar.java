package bangundatar;

public abstract class BangunDatar {
    private String name;

    public abstract double Luas();
    public abstract double Keliling();

    public void getInfo() {
        System.out.println("Bangun Datar " + name);
        System.out.println("Luas " + Luas());
        System.out.println("Keliling " + Keliling());
    }

    private void setName(String name) {
        this.name = name;
    }

    protected BangunDatar(String name) {
        this.setName(name);
    }
}