package pl.javastart.task;

public class Product {
    public static final String CATEGORY_DAIRY = "Nabiał";
    public static final String CATEGORY_MEAT = "Mięso";
    public static final String CATEGORY_KIDS_ART = "Artykuły dziecięce";
    private String name;
    private String description;
    private double netPrice;
    private String category;

    Product(String name, String description, double netPrice, String category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public double getNetPrice() {
        return netPrice;
    }

    void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }
}

