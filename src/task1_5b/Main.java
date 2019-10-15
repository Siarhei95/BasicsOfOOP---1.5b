//Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//подарок). Составляющими целого подарка являются сладости и упаковка.

package task1_5b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Present present = new Present("Оригинальный сладкий подарок");
        Sweets sweets = new Sweets("АЛЕНКА");
        logic.addSweets(new Sweets("Шоколадки", 3));
        logic.addSweets(new Sweets("Конфеты", 10));
        logic.addSweets(new Sweets("Мороженое", 2));
        logic.addSweets(new Sweets("Торты", 5));

        System.out.println("Магазин " + sweets.getNameShop() + " предлагает:\n" + logic.getSweetsList()); //список сладостей,
                                                                                                         // из которых можно собрать подарок.

        Packaging packaging = new Packaging("cобственное производство", "АЛЕНКА");
        logic.addPackaging(new Packaging("Коробка"));
        logic.addPackaging(new Packaging("Ящик"));
        logic.addPackaging(new Packaging("Контейнер"));
        logic.addPackaging(new Packaging("Полиэтилен"));
        logic.addPackaging(new Packaging("Ланч-бокс"));

        System.out.println("\n" + packaging.getNameShop() + " имеет " + packaging.getNameProduct() + " и" + //список подарочных упаковок,
                " предлагает упаковки: \n" + logic.getPackagingList());                             //для формирования подарка


        System.out.println("\nДавайте создавать подарок!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВыберете сладость из списка и введите: ");
        String finder1 = scanner.next();
        System.out.print("\nВыберете упаковку из списка и введите: ");
        String finder2 = scanner.next();

        System.out.println("\nПоложим "+finder1+" в "+finder2);

        System.out.println("\n"+present.getPresent()+" - готов!");
        System.out.println("\nСостовляющие: \n");
        logic.getOneSweet(finder1);
        System.out.println("+");
        logic.getOnePackaging(finder2);
    }
}
