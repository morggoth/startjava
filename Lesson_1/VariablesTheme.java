public class VariablesTheme {
  public static void main(String[] args) {
    
    // Task 1
    System.out.printf("1. Создание переменных и вывод их значений на консоль\n");

    byte numberOfCPU = 8;
    short numTasks = 2048; 
    int osVersion = 199506;
    long memorySize = 8_589_934_592L;
    float osRealse = 20.6f;
    double iosSupportVersion = 14.7; 
    char cpuNamePrefix = 'M';
    boolean isIpForwardingEnabled = false;

    System.out.println(numberOfCPU);
    System.out.println(numTasks);
    System.out.println(osVersion);
    System.out.println(memorySize);
    System.out.println(osRealse);
    System.out.println(iosSupportVersion);
    System.out.println(cpuNamePrefix);
    System.out.println(isIpForwardingEnabled);

    // Task 2
    System.out.printf("\n2. Расчет стоимости товара со скидкой\n");

    int goodX = 100;
    int goodY = 200;
    float totalDiscount = 0.11f;

    System.out.println((goodX + goodY) * totalDiscount);
    System.out.println((goodX + goodY) * (1 - totalDiscount));

    // Task 3
    System.out.printf("\n3. Вывод на консоль слова JAVA\n");

    String banner = """
         J    a  v     v  a
         J   a a  v   v  a a
      J  J  aaaaa  V V  aaaaa
       JJ  a     a  V  a     a
      """;

    System.out.println(banner);

    // Task 4
    System.out.printf("\n4. Отображение min и max значений числовых типов данных\n");

    byte myByte = Byte.MAX_VALUE;
    short myShort = Short.MAX_VALUE;
    int myInt = Integer.MAX_VALUE;
    long myLong = Long.MAX_VALUE;

    System.out.println("Original value: " + myByte + "; incremented value: " + ++myByte + "; decremented value: " + --myByte);
    System.out.println("Original value: " + myShort + "; incremented value: " + ++myShort + "; decremented value: " + --myShort);
    System.out.println("Original value: " + myInt + "; incremented value: " + ++myInt + "; decremented value: " + --myInt);
    System.out.println("Original value: " + myLong + "; incremented value: " + ++myLong + "; decremented value: " + --myLong);

    // Task 5
    System.out.printf("\n5. Перестановка значений переменных\n");

    double doubleVar1 = 1.1;
    double doubleVar2 = 2.2;
    double doubleVar3;

    doubleVar3 = doubleVar1;
    doubleVar1 = doubleVar2;
    doubleVar2 = doubleVar3;
    System.out.println("var1 = " + doubleVar1 + " var2 = " + doubleVar2);

    // Task 6
    System.out.printf("\n6. Вывод символов и их кодов\n");

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
    System.out.printf("\n7. Произведение и сумма цифр числа\n");

    short myNumber = 345;
    short firstDigit = (short) (myNumber / 100);
    short secondDigit = (short) (myNumber / 10 % 10);
    short thirdNumber = (short) (myNumber % 10);
    
    System.out.println("сумма цифр числа N = " + (firstDigit + secondDigit + thirdNumber));
    System.out.println("произведение цифр числа N =  " + (firstDigit * secondDigit * thirdNumber));

    // Task 8

    // Task 9
    System.out.printf("\n9. Отображение количества сотен, десятков и единиц числа\n");

    myNumber = 123;
    firstDigit = (short) (myNumber / 100);
    secondDigit = (short) (myNumber / 10 % 10);
    thirdNumber = (short) (myNumber % 10);

    System.out.println("Число N содержит:" +
	"\n  " + firstDigit + " сотню" +
	"\n  " + secondDigit + " десятка" +
	"\n  " + thirdNumber + " единицы");

    // Task 10
    System.out.printf("\n10. Преобразование секунд\n");

    int seconds = 86399;
    System.out.println(seconds / (60 * 60) + ":" + (seconds / 60) % 60 + ":" + seconds % 60 );
  }
}
