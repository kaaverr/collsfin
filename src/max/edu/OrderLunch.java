package max.edu;

public class OrderLunch implements IBill {

    private String saladName;
    private Integer saladPrice;
    private String firstDish;
    private Integer firstDishPrice;
    private String secondDish;
    private Integer secondDishPrice;
    private String dessert;
    private Integer dessertPrice;

    public OrderLunch() {
    }

    public OrderLunch(String saladName, Integer saladPrice, String firstDish, Integer firstDishPrice, String secondDish
            , Integer secondDishPrice, String dessert, Integer dessertPrice) {
        this.saladName = saladName;
        this.saladPrice = saladPrice;
        this.firstDish = firstDish;
        this.firstDishPrice = firstDishPrice;
        this.secondDish = secondDish;
        this.secondDishPrice = secondDishPrice;
        this.dessert = dessert;
        this.dessertPrice = dessertPrice;
    }

    public String getSaladName() {
        return saladName;
    }

    public void setSaladName(String saladName) {
        this.saladName = saladName;
    }

    public Integer getSaladPrice() {
        return saladPrice;
    }

    public void setSaladPrice(Integer saladPrice) {
        this.saladPrice = saladPrice;
    }

    public String getFirstDish() {
        return firstDish;
    }

    public void setFirstDish(String firstDish) {
        this.firstDish = firstDish;
    }

    public Integer getFirstDishPrice() {
        return firstDishPrice;
    }

    public void setFirstDishPrice(Integer firstDishPrice) {
        this.firstDishPrice = firstDishPrice;
    }

    public String getSecondDish() {
        return secondDish;
    }

    public void setSecondDish(String secondDish) {
        this.secondDish = secondDish;
    }

    public Integer getSecondDishPrice() {
        return secondDishPrice;
    }

    public void setSecondDishPrice(Integer secondDishPrice) {
        this.secondDishPrice = secondDishPrice;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public Integer getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Integer dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    @Override
    public String toString() {
        return "OrderLunch{" +
                "saladName='" + saladName + '\'' +
                ", saladPrice=" + saladPrice +
                ", firstDish='" + firstDish + '\'' +
                ", firstDishPrice=" + firstDishPrice +
                ", secondDish='" + secondDish + '\'' +
                ", secondDishPrice=" + secondDishPrice +
                ", dessert='" + dessert + '\'' +
                ", dessertPrice=" + dessertPrice +
                '}';
    }

    @Override
    public Integer getBill() {
        return this.getDessertPrice()
                + this.getSecondDishPrice()
                + this.getFirstDishPrice()
                + this.getSaladPrice()
                + 20;
    }
}
