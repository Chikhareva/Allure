package ru.netology.test;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));


    public static String getCity(){
        String[] city = { "Москва", "Петрозаводск", "Краснодар", "Санкт-Петербург", "Уфа", "Ярославль", "Екатеринбург"};
        int rnd = new Random().nextInt(city.length);
        return city[rnd];
    }
    public static String getDatePlus(int plus) {
        return LocalDate.now().plusDays(plus).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }


    public static String enterName(){
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String name = firstName + " " + lastName;
        return name;
    }

    public static String enterPhone()  {
        return  faker.numerify("+7##########");

    }

    private DataGenerator() {
    }
}



