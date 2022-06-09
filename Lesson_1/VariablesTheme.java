public class VariablesTheme {
    public static void main(String[] args) {
        // Task 1
        System.out.printf("1. Создание переменных и вывод их значений на консоль");
  
        byte numCpu = 8;
        short numTasks = 2048; 
        int osVersion = 199506;
        long memSize = 8_589_934_592L;
        float osRealse = 20.6f;
        double iosVersion = 14.7; 
        char cpuNamePrefix = 'M';
        boolean isIpForwardingEnabled = false;
  
        System.out.println(numCpu);
        System.out.println(numTasks);
        System.out.println(osVersion);
        System.out.println(memSize);
        System.out.println(osRealse);
        System.out.println(iosVersion);
        System.out.println(cpuNamePrefix);
        System.out.println(isIpForwardingEnabled);
  
        // Task 2
        System.out.println("\n2. Расчет стоимости товара со скидкой");
  
        int priceGoodX = 100;
        int priceGoodY = 200;
        float discount = 0.11f;
  
        System.out.println((priceGoodX + priceGoodY) * discount);
        System.out.println((priceGoodX + priceGoodY) * (1 - discount));
  
        // Task 3
        System.out.println("\n3. Вывод на консоль слова JAVA");
  
        String banner = """
             J    a  v     v  a
             J   a a  v   v  a a
          J  J  aaaaa  V V  aaaaa
           JJ  a     a  V  a     a
          """;
  
        System.out.println(banner);
  
        // Task 4
        System.out.println("4. Отображение min и max значений числовых типов данных");
  
        byte myByte = Byte.MAX_VALUE;
        short myShort = Short.MAX_VALUE;
        int myInt = Integer.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
  
        System.out.println("Original value: " + myByte + "; incremented value: " + ++myByte + "; decremented value: " + --myByte);
        System.out.println("Original value: " + myShort + "; incremented value: " + ++myShort + "; decremented value: " + --myShort);
        System.out.println("Original value: " + myInt + "; incremented value: " + ++myInt + "; decremented value: " + --myInt);
        System.out.println("Original value: " + myLong + "; incremented value: " + ++myLong + "; decremented value: " + --myLong);
  
        // Task 5
        System.out.println("\n5. Перестановка значений переменных");
  
        double defaultA = 1.1;
        double defaultB = 2.2;
  
        // Temp variable approche
        double a = defaultA;
        double b = defaultB;
        double c;
        System.out.println("Перестановка при помощи третьей переменной:");
        System.out.println("\tОригинальные значения: var1 = " + a + " var2 = " + b);
  
        c = a;
        a = b;
        b = c;
        System.out.println("\tОбноыленные значения: var1 = " + a + " var2 = " + b);
  
        // Math approche
        System.out.println("Математическая перестановка:");
        System.out.println("\tОригинальные значения: var1 = " + a + " var2 = " + b);
  
        a = defaultA;
        b = defaultB;
  
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\tОбноыленные значения: var1 = " + a + " var2 = " + b);
  
        // Bit shift approche
  
        /*
         * Побитовые операции в Java применимы только к целочисленным типам данных.
         * Сам алгоритм схож с арифметической перестановкой:
         *
         * int a = 1;
         * int b = 2;
         *
         * a = a ^ b;  // a == 3
         * b = b ^ a;  // b == 1 
         * a = a ^ b;  // a == 2
         *
         */
  
        // Task 6
        System.out.println("\n6. Вывод символов и их кодов");
  
        byte var1 = 35;
        byte var2 = 38;
        byte var3 = 64;
        byte var4 = 94;
        byte var5 = 95;
  
        System.out.println(var1 + " = " + (char) var1);
        System.out.println(var2 + " = " + (char) var2);
        System.out.println(var3 + " = " + (char) var3);
        System.out.println(var4 + " = " + (char) var4);
        System.out.println(var5 + " = " + (char) var5);
  
        // Task 7
        System.out.println("\n7. Произведение и сумма цифр числа");
  
        short myNumber = 345;
        short firstDigit = (short) (myNumber / 100);
        short secondDigit = (short) (myNumber / 10 % 10);
        short thirdNumber = (short) (myNumber % 10);
        
        System.out.println("сумма цифр числа N = " + (firstDigit + secondDigit + thirdNumber));
        System.out.println("произведение цифр числа N =  " + (firstDigit * secondDigit * thirdNumber));
  
        // Task 8
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        // a piece of hodgie code bellow
  
        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char openingBracket = '(';
        char closeingBracket = ')';
        char underscore = '_';
  
        char[] line1 = {space, space, space, space, slash, backSlash};
        char[] line2 = {space, space, space, slash, space, space, backSlash};
        char[] line3 = {space, space, slash, underscore, openingBracket, space, closeingBracket, backSlash};
        char[] line4 = {space, slash, space, space, space, space, space, space, backSlash};
        char[] line5 = {slash, underscore, underscore, underscore, underscore, slash, backSlash, underscore, underscore, backSlash};
  
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
  
        // Task 9
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
  
        myNumber = 123;
        firstDigit = (short) (myNumber / 100);
        secondDigit = (short) (myNumber / 10 % 10);
        thirdNumber = (short) (myNumber % 10);
  
        System.out.println("Число N содержит:" +
          "\n  " + firstDigit + " сотню" +
          "\n  " + secondDigit + " десятка" +
          "\n  " + thirdNumber + " единицы");
  
        // Task 10
        System.out.println("\n10. Преобразование секунд");
  
        int seconds = 86399;
        System.out.println(seconds / (60 * 60) + ":" + (seconds / 60) % 60 + ":" + seconds % 60 );
    }
}
