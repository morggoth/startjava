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
  
        String javaMsg = """
                   J    a  v     v  a
                   J   a a  v   v  a a
                J  J  aaaaa  V V  aaaaa
                 JJ  a     a  V  a     a
                """;
  
        System.out.println(javaMsg);
  
        // Task 4
        System.out.println("4. Отображение min и max значений числовых типов данных");
  
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
  
        System.out.println("Original value: " + maxByte + "; incremented value: " + ++maxByte + "; decremented value: " + --maxByte);
        System.out.println("Original value: " + maxShort + "; incremented value: " + ++maxShort + "; decremented value: " + --maxShort);
        System.out.println("Original value: " + maxInt + "; incremented value: " + ++maxInt + "; decremented value: " + --maxInt);
        System.out.println("Original value: " + maxLong + "; incremented value: " + ++maxLong + "; decremented value: " + --maxLong);
  
        // Task 5
        System.out.println("\n5. Перестановка значений переменных");
  
        double num1 = 1.1;
        double num2 = 2.2;
        double tmp;
  
        // Temp variable approche
        System.out.println("Перестановка при помощи третьей переменной:");
        System.out.println("\tОригинальные значения: var1 = " + num1 + " var2 = " + num2);
  
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("\tОбноыленные значения: var1 = " + num1 + " var2 = " + num2);
  
        // Math approche
        System.out.println("Математическая перестановка:");
        System.out.println("\tОригинальные значения: var1 = " + num1 + " var2 = " + num2);
  
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
        System.out.println("\tОбноыленные значения: var1 = " + num1 + " var2 = " + num2);
  
        // XOR approche
        System.out.println("Перестановка XOR`ом");
        System.out.println("\tОригинальные значения: var1 = " + num1 + " var2 = " + num2);

        num1 = (double) (((int) (num1 * 10)) ^ ((int) (num2 * 10))) / 10; 
        num2 = (double) (((int) (num2 * 10)) ^ ((int) (num1 * 10))) / 10; 
        num1 = (double) (((int) (num1 * 10)) ^ ((int) (num2 * 10))) / 10; 

        System.out.println("\tОбноыленные значения: var1 = " + num1 + " var2 = " + num2);
  
        // Task 6
        System.out.println("\n6. Вывод символов и их кодов");
  
        byte code35 = 35;
        byte code38 = 38;
        byte code64 = 64;
        byte code94 = 94;
        byte code95 = 95;
  
        System.out.println(code35 + " = " + (char) code35);
        System.out.println(code38 + " = " + (char) code38);
        System.out.println(code64 + " = " + (char) code64);
        System.out.println(code94 + " = " + (char) code94);
        System.out.println(code95 + " = " + (char) code95);
  
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
