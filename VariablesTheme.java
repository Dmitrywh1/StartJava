public class VariablesTheme {
    public static void main(String[] args) {
        /* Задание 1. Вывод характеристик компьютера
        Объявление переменных типов данных и присвоение им значений хр-к ПК
        */
        byte numberOfCores = 4;
        short processorSpeed = 3200;
        int ramSize = 8192;
        long storageHDD = 500;
        float screenDiagonal = 18.4f;
        double batteryCapacity = 45.5d;
        char operatingSystem = 's';
        boolean isLaptop = true;

        System.out.println("Задание 1. Вывод характеристик ПК на консоль");
        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Частота процессора: " + processorSpeed + " МГц");
        System.out.println("Объем оперативной памяти: " + ramSize + " МБ");
        System.out.println("Объем HD: " + storageHDD + " ГБ");
        System.out.println("Диагональ экрана: " + screenDiagonal + " дюймов");
        System.out.println("Емкость батареи: " + batteryCapacity + " Вт-ч");
        System.out.println("Операционная система: Window" + operatingSystem);
        System.out.println("Это ноутбук? " + isLaptop + "\n");
        /*
        Задание 2. Расчет стоимости товара со скидкой
        ку
        */
        int penPrice = 100;
        int bookPrice = 200;
        int fullPrice = penPrice + bookPrice;
        float discountPercent = 0.11f;
        int discountAmount = (int) (fullPrice * discountPercent);
        int priceWithDiscount = fullPrice - discountAmount;

        System.out.println("Задание 2. Расчет стоимости товара со скидкой");
        System.out.println("Общая стоимость товаров: " + fullPrice + " руб");
        System.out.println("Сумма скидки: " + discountAmount + " руб");
        System.out.println("Общая стоимость товаров со скидкой: " + priceWithDiscount + " руб");
        System.out.println();

        // Задание 3. Вывод слова JAVA
        System.out.println("Задание 3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a\n");

        //Задание 4. Вывод min и max значений целых числовых типов
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("Задание 4. Вывод min и max значений целых числовых типов");
        System.out.println("Значения переменной типа byte:");
        System.out.println("Первоначальное значение: " + byteMax);
        System.out.println("Значение после инкремента на единицу: " + ++byteMax);
        System.out.println("Значение после декремента на единицу: " + --byteMax);
        System.out.println("Значения переменной типа short:");
        System.out.println("Первоначальное значение: " + shortMax);
        System.out.println("Значение после инкремента на единицу: " + ++shortMax);
        System.out.println("Значение после декремента на единицу: " + --shortMax);
        System.out.println("Значения переменной типа int:");
        System.out.println("Первоначальное значение: " + intMax);
        System.out.println("Значение после инкремента на единицу: " + ++intMax);
        System.out.println("Значение после декремента на единицу: " + --intMax);
        System.out.println("Значения переменной типа long:");
        System.out.println("Первоначальное значение: " + longMax);
        System.out.println("Значение после инкремента на единицу: " + ++longMax);
        System.out.println("Значение после декремента на единицу: " + --longMax + "\n");

        //Задание 5.Перестановка значений переменных
        System.out.println("Задание 5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;

        System.out.println("- С помощью третьей переменной:");
        System.out.println("Исходные значения: a = " + num1 + ", b = " + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Переменные после перестановки с помощью третьей переменной: a = " 
                + num1 + ", b = " + num2);

        num3 = num2;
        num2 = num1;
        num1 = num3;

        System.out.println("- C помощью арифметических операций:");
        System.out.println("Исходные значения: a = " + num1 + ", b = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println("Переменные после арифметических операций: a = "+ num1
                + ", b = " + num2);

        num2 += num1;
        num1 = num2 - num1;
        num2 -= num1;

        System.out.println("- С помощью побитовой операции:");
        System.out.println("Исходные значения: a = " + num1 + ", b = " + num2);

        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^=num2;

        System.out.println("Переменные после побитовой операции: a = "+ num1+ ", b = " + num2);
        System.out.println();

        // Задание 6 Вывод символов и их кодов
        char char1 = '#';
        char char2 = '&';
        char char3 = '@';
        char char4 = '^';
        char char5 = '_';
        System.out.println("Задание 6. Вывод символов и их кодов");
        System.out.println(char1 + "|" + (int)char1);
        System.out.println(char2 + "|" + (int)char2);
        System.out.println(char3 + "|" + (int)char3);
        System.out.println(char4 + "|" + (int)char4);
        System.out.println(char5 + "|" + (int)char5 + "\n");

        // Задание 7. Вывод в консоль ASCII-арт Дюка
        char backslash = '/';
        char forwardslash = '\\';
        char underscore = '_';
        char leftbracket = '(';
        char rightbracket = ')';

        System.out.println("Задание 7. Вывод в консоль ASCII-арт Дюка \n");
        System.out.println("    " + backslash + "" + forwardslash);
        System.out.println("   " + backslash + "  " + forwardslash);
        System.out.println("  " + backslash + "" + underscore + "" + leftbracket + "" + " " + 
                rightbracket + "" + forwardslash);
        System.out.println(" " + backslash + "      " + forwardslash);
        System.out.println(backslash + "" + underscore + "" + underscore + "" + underscore + "" + 
                underscore + "" + backslash + "" + forwardslash + "" + underscore + "" 
                        + underscore + "" + forwardslash + "\n");

        // Задание 8. Вывод количества сотен, десятков и единиц числа
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 100;
        int ones = number / 1;
        int sumOfNumbers = hundreds + tens + ones;
        int productOfNumbers = hundreds * tens * ones;

        System.out.println("Задание 8. Вывод количества сотен, десятков и единиц числа ");
        System.out.println("Число " + number + " содержит:");
        System.out.println("      " + hundreds + " сотен");
        System.out.println("      " + tens + " десятков");
        System.out.println("      " + ones + " единиц");
        System.out.println("Сумма его цифр = " + sumOfNumbers);
        System.out.println("Произведение = " + productOfNumbers + "\n");

        //Задание 9. Вывод времени
        int seconds = 86399;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println("Задание 9. Вывод времени");
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
    }
}
