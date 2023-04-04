public class Main {
    public static void main(String[] args) {
        int currentBalance = 300;
        int topUpAmount = 2100;
        int bonusPer100Rub = 1;

        int bonusRubles = 0;
        int finalBalance = currentBalance + topUpAmount;

        if (topUpAmount > 1000) {
            bonusRubles = (topUpAmount / 100) * bonusPer100Rub;
            finalBalance += bonusRubles;
        }

        System.out.println("Бонусных рублей начислено: " + bonusRubles + " рублей");
        System.out.println("Итог на счёте: " + finalBalance + " рублей");
    }
}