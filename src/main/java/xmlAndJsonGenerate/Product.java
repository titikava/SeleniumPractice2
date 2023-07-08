package xmlAndJsonGenerate;

public class Product {
    private int id;
    private String name;
    private int price;
    private String desc;
    private String img;

    public Product(int id, String name, int price, String desc, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
