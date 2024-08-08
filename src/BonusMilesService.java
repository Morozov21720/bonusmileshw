public class BonusMilesService {

    public int calculate(int price) {
        int rublesPerMile = 20; // Количество рублей для одной бонусной мили
        return price / rublesPerMile; // Рассчитываем количество бонусных миль
    }
}
