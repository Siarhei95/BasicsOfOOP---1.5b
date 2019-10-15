package task1_5b;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private ArrayList<Sweets> sweetsArrayList = new ArrayList<>();
    private ArrayList<Packaging> packagingArrayList = new ArrayList<>();

    void addSweets(Sweets sweets) {
        sweetsArrayList.add(sweets);
    }

    void addPackaging(Packaging packaging) {
        packagingArrayList.add(packaging);
    }

    public List<Sweets> getSweetsList() {
        List<Sweets> sweetsList = new ArrayList<>(sweetsArrayList);
        return sweetsList;
    }

    public List<Packaging> getPackagingList() {
        List<Packaging> packagingList = new ArrayList<>(packagingArrayList);
        return packagingList;
    }

    public List<Sweets> getOneSweet(String finder1) {
        List<Sweets> sweetsList = new ArrayList<>(sweetsArrayList);
        for (Sweets c : sweetsArrayList) {
            if (c.getSweet().equals(finder1)) {
                sweetsList.add(c);
                System.out.println(c.getSweet());
            }
        }
        return sweetsList;
    }

    public List<Packaging> getOnePackaging(String finder2) {
        List<Packaging> packagingList = new ArrayList<>(packagingArrayList);
        for (Packaging c : packagingArrayList) {
            if (c.getPackaging().equals(finder2)) {
                packagingList.add(c);
                System.out.println(c.getPackaging());
            }
        }
        return packagingList;
    }

}