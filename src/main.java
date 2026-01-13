public class main {
    public static void main(String[] args) {
        int adding = 1100; // сумма попаолнения
        int current = 100; // текущий баланс
        int bonus; // начисленные бонусы
        int summary; // итоговая сумма

        if (adding > 1000){
            bonus = adding/100;
        }
        else {
            bonus = 0;
        }

        summary = adding + current + bonus;

        System.out.println("Итоговая сумма: " + summary);
        System.out.println("Итоговый бонус: " + bonus);
    }
}
