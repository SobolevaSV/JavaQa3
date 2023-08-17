public class BonusMilesService {
    public int calculate(int price) {
        int priceMile = 20; // стоимость одной бонусной мили
        int miles = price / priceMile; // количество бонусных миль за купленный билет
        return miles;
    }
}
