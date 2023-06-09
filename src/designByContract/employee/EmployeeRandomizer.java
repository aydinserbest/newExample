package designByContract.employee;

import java.util.Random;

public class EmployeeRandomizer {
    private  static final Random random = new Random();

    private static final String[] firstNames = { "Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
            "Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
            "Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "S¸leyman",
            "Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal" };

    private static final String[] departments = { "Production", "Sales", "Marketing", "Engineering" };

    public static int createId(){
        int randomInt = random.nextInt(10000);
        return randomInt;
    }
    public static String  createName(){
        int randomInt = random.nextInt(35);
        return firstNames[randomInt];
    }
    public static String createDepartment(){
        int randomInt = random.nextInt(4);
        return departments[randomInt];
    }
    public static int createYear(){
        int randomInt = random.nextInt(20);
        return randomInt;
    }
}
