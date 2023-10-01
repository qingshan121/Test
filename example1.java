import java.util.Scanner;

public class Eaxmple {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int number = 0;
        while (choice != 3) {
        System.out.println("==============================\n" +
        "欢迎使用密码加密解密系统\n" +
        "==============================\n");
        System.out.println("请选择操作：\n" +
        "1. 加密\n" +
        "2. 解密\n" +
        "3. 退出\n");
        choice = scanner.nextInt();
        switch (choice) {
        case 1 -> {
        System.out.println("请输入要加密的数字(四位数)");
        number = scanner.nextInt();
        jiami(number);
        break;
        }
        case 2 -> {
        System.out.println("请输入要解密的数字");
        number = scanner.nextInt();
        jiemi(number);
        }
        case 3 -> {
        System.out.println("退出系统");
        }
default -> {
        System.out.println("操作无效");
        break;
        }
        }
        }
        }

private static void jiemi(int number) {
        }

private static void jiami(int number) {
        //接收密码
        //判断是否为四位数

        int qian = number / 1000;
        int bai = number / 100 % 10;
        int shi = number / 10 % 10;
        int ge = number % 1000 % 100 % 10;

        int temp = ge;
        ge = shi;
        shi = temp;
        qian += 5;//加5
        bai += 5;
        shi += 5;
        ge += 5;
        qian %= 10;//对十求余
        bai %= 10;
        shi %= 10;
        ge %= 10;
        qian *= 2;
        bai *= 2;
        shi *= 2;
        ge *= 2;
        if (ge > 10) {
        shi += 1;
        ge -= 10;
        }
        if (shi > 10) {
        bai += 1;
        shi -= 10;
        }
        if (bai > 10) {
        qian += 1;
        bai -= 10;
        }
        int temp1 = ge;
        ge = qian;
        qian = temp;
        int temp2 = shi;
        shi = bai;
        bai = temp;
        int concatenatedNumber = concatenateNumbers(qian, bai, shi, ge);

        System.out.println("result: " + concatenatedNumber);
        }

public static int concatenateNumbers(int qian, int bai, int shi, int ge) {
        // 将四个数连接成一个字符串
        String concatenatedString = "" + qian + qian + shi + ge;

        // 将字符串转换为整数
        int result = Integer.parseInt(concatenatedString);

        return result;

        }}