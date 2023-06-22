package pl.javastart.task;

public class Main {

    public static final double VAT_DAIRY = 12;
    public static final double VAT_MEAT = 21;
    public static final double VAT_KIDS_ART = 8;

    public static void main(String[] args) {

        Product prod1 = new Product("Mleko", "Mleko bez laktozy", 2.31, Product.CATEGORY_DAIRY);
        Product prod2 = new Product("Wołowina", "Wołowina długodojrzewająca", 55.51, Product.CATEGORY_MEAT);
        Product prod3 = new Product("Pieluchy", "Pampers", 70.30, Product.CATEGORY_KIDS_ART);
        Product prod4 = new Product("Miska", "Misa grilowa", 17.00, "Inne");

        System.out.println(grossPrice(prod1));
        System.out.println(grossPrice(prod2));
        System.out.println(grossPrice(prod3));
        System.out.println(grossPrice(prod4));

    }

    static double grossPrice(Product prod) {
        double grossPrice = switch (prod.getCategory()) {
            case "Nabiał" -> prod.getNetPrice() * VAT_DAIRY / 100 + prod.getNetPrice();
            case "Mięso" -> prod.getNetPrice() * VAT_MEAT / 100 + prod.getNetPrice();
            case "Artykuły dziecięce" -> prod.getNetPrice() * VAT_KIDS_ART / 100 + prod.getNetPrice();
            default -> prod.getNetPrice() * 1.23;
        };
        return grossPrice;
    }
}
