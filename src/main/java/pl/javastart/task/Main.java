package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product prod1 = new Product("Mleko", "Mleko bez laktozy", 2.31, "Nabiał");
        Product prod2 = new Product("Wołowina", "Wołowina długodojrzewająca", 55.51, "Mięso");
        Product prod3 = new Product("Pieluchy", "Pampers", 70.30, "Artykuły dziecięce");
        Product prod4 = new Product("Miska", "Misa grilowa", 17.00, "Inne");

        System.out.println(grossPrice(prod1));
        System.out.println(grossPrice(prod2));
        System.out.println(grossPrice(prod3));
        System.out.println(grossPrice(prod4));

    }

    static double grossPrice(Product prod) {
        double grossPrice = switch (prod.getCategory()) {
            case "Nabiał" -> prod.getNetPrice() * 1.12;
            case "Mięso" -> prod.getNetPrice() * 1.21;
            case "Artykuły dziecięce" -> prod.getNetPrice() * 1.08;
            default -> prod.getNetPrice() * 1.23;
        };
        return grossPrice;
    }
}
