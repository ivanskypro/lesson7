package ru.pro.sky;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        String firstName = "Ivan" + " ";
        String middleName = "Ivanovich";
        String secondName = "Ivanov" + " ";
        String fullName = secondName + firstName + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задание №2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();

        System.out.println("Задание №3");
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела " + fullName);
        System.out.println();

        System.out.println("Задание №4");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println();

        System.out.println("Задание №4.С использованием сплит и контейнс");
        fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        //System.out.print(Arrays.toString(words));
        for (int i = 0; i <= words.length; i++) {
            if (words[0].contains("ё") || words[1].contains("ё") || words[2].contains("ё")) {
                words[0] = words[0].replace("ё", "е");
                words[1] = words[1].replace("ё", "е");
                words[2] = words[2].replace("ё", "е");
                System.out.println(words[0] + " " + words[1] + " " + words[2]);
                break;
            }
            else if (words[0].contains("") || words[1].contains("") || words[2].contains("")) {
                System.out.println(words[0] + " " + words[1] + " " + words[2]);
                break;
            }

        }
    }
}





