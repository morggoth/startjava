public class VariablesTheme {
  public static void main(String[] args) {
    
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


    System.out.printf("\n2. Расчет стоимости товара со скидкой\n");

    int goodX = 100;
    int goodY = 200;
    float totalDiscount = 0.11f;

    System.out.println((goodX + goodY) * totalDiscount);
    System.out.println((goodX + goodY) * (1 - totalDiscount));

    System.out.printf("\n3. Вывод на консоль слова JAVA\n");

    String banner = """
         J    a  v     v  a
         J   a a  v   v  a a
      J  J  aaaaa  V V  aaaaa
       JJ  a     a  V  a     a
      """;

    System.out.println(banner);

    System.out.printf("\n4. Отображение min и max значений числовых типов данных\n");

    byte myByte = 127;
    short myShort = 32_767;
    int myInt = 2_147_483_647;
    long myLong = 9_223_372_036_854_775_807L;

    System.out.println("Original value: " + myByte + "; incremented value: " + ++myByte + "; decremented value: " + --myByte);
    System.out.println("Original value: " + myShort + "; incremented value: " + ++myShort + "; decremented value: " + --myShort);
    System.out.println("Original value: " + myInt + "; incremented value: " + ++myInt + "; decremented value: " + --myInt);
    System.out.println("Original value: " + myLong + "; incremented value: " + ++myLong + "; decremented value: " + --myLong);

    System.out.printf("\n5. Перестановка значений переменных\n");

    System.out.printf("\n6. Вывод символов и их кодов\n");

    System.out.printf("\n7. Произведение и сумма цифр числа\n");

    short myNumber = 345;
    short firstDigit = (short) (myNumber / 100);
    short secondDigit = (short) (myNumber / 10 % 10);
    short thirdNumber = (short) (myNumber % 10);
    
    System.out.println("сумма цифр числа N = " + (firstDigit + secondDigit + thirdNumber));
    System.out.println("произведение цифр числа N =  " + (firstDigit * secondDigit * thirdNumber));

    System.out.printf("\n9. Отображение количества сотен, десятков и единиц числа\n");

    myNumber = 123;
    firstDigit = (short) (myNumber / 100);
    secondDigit = (short) (myNumber / 10 % 10);
    thirdNumber = (short) (myNumber % 10);

    System.out.println("Число N содержит:" +
	"\n  " + firstDigit + " сотню" +
	"\n  " + secondDigit + " десятка" +
	"\n  " + thirdNumber + " единицы");
  }
}
