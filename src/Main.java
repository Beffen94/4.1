public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 5_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("Количество начисленных бонусных миль " + miles);
    }
}
