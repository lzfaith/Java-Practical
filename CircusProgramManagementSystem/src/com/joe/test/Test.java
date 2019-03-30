package com.joe.test;

import com.joe.animal.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 方法改进：
 *         1. 用try..catch 进行非数字异常的反馈
 *         2. 在”是否继续观看“ 条件上，只限于“0” 和 “1”的输入， 否则将持续提示询问，
 *            直到用户下次的输入满足条件。
 */
public class Test {


    /**
     *  Display Test
     */
    public void displayMenu(){
        System.out.println("***********欢迎来到太阳马戏团*********** ");
        System.out.println("************* 请选择表演者 *************");
        System.out.println("**************** 1.棕熊 ****************");
        System.out.println("**************** 2.狮子 ****************");
        System.out.println("**************** 3.猴子 ****************");
        System.out.println("**************** 4.鹦鹉 ****************");
        System.out.println("**************** 5.小丑 ****************");

    }

    public static void main(String[] args) {
        boolean flag = true;
        Test t = new Test();
        Scanner sc = new Scanner(System.in);
        int input = 0; //users' input
        int input2 = 0; //exist option
        while(flag){
            t.displayMenu();
            try{
                input = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("** 输入的数据格式有误，不能有非数字！**");
                sc.next();
                continue;
            }

            switch (input){
                case 1:
                    Bear b = new Bear("Bill", 1);
                    b.act();
                    break;
                case 2:
                    Lion l = new Lion("Lain", 2, "灰色", "公狮");
                    l.act();
                    break;
                case 3:
                    Monkey m = new Monkey("Tom", 1, "金丝猴");
                    m.act();
                    break;
                case 4:
                    Parrot p = new Parrot("Rose", 1, "牡丹鹦鹉");
                    p.act();
                    break;
                case 5:
                    Clown c = new Clown("Kahle", 5);
                    c.act();
                    break;

                default:
                    System.out.println("** 输入信息不正确，请重新输入！** \n");
                    continue;
            }

            //exist or continue
            System.out.println("************ 是否继续观看(1/0) ************");
            try{
                input2 = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("******* 输入格式有误!1 **********");
                sc.next();
                continue;
            }
            switch (input2){
                case 0:
                    flag = false;
                    System.out.println("************ 欢迎下次光临！*************");
                    break;
                case 1:
                    break;

                default:
                    boolean flag2 = true;
                    /**
                     * if input is other number, it will get while loop
                     * it will out of loop until user's input is 0  or 1
                     */
                    while(flag2){
                        System.out.println("** 输入信息不正确， 请重新输入 **");
                        System.out.println("************ 是否继续观看(1/0) ************");
                        String a = sc.next();
                        if(a.equals("1")){
                            flag2 = false;
                        }else if(a.equals("0")){
                            flag2 = false;
                            flag = false;
                            System.out.println("************ 欢迎下次光临！*************");
                        }
                    }
                    break;
            }



        }

    }

}
