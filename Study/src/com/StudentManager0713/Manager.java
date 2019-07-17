package com.StudentManager0713;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        //创建存储
        ArrayList<Student> arrayList = new ArrayList<Student>();
        //用户界面
        while (true){
            System.out.println("=============== 欢 迎 使 用 ===============");
            System.out.println("1.查看学生");
            System.out.println("2.添加学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.退出");
            System.out.println("===============  请  选  择 ===============");
            //功能选择
            Scanner scanner = new Scanner(System.in);
            int choiceScanner = scanner.nextInt();
            switch (choiceScanner){
                case 1:
                    //todo select
                    selectStudent(arrayList);
                    break;
                case 2:
                    addStudent(arrayList);
                    break;
                case 3:
                    editStudent(arrayList);
                    break;
                case 4:
                    deleteStudent(arrayList);
                    break;
                default:
                    System.exit(500);
                    break;
            }
        }
    }

    public static void selectStudent(ArrayList<Student> arrayList){
        System.out.println("=============== 欢 迎 使 用 ===============");
        System.out.println("学号               姓名               成绩");
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getId()+"               "+s.getName()+"               "+s.getScore());

        }
    }

    public static void addStudent(ArrayList<Student> arrayList){
       while (true){
           //录入学生的信息
           Scanner scanner = new Scanner(System.in);
           System.out.println("请输入新学生的学号");
           int id = scanner.nextInt();
           //todo 如果想精致甚至可以在这里添加id的唯一验证
           for (int i = 0; i < arrayList.size(); i++) {
               Student s = arrayList.get(i);
               int tid = s.getId();
               if(id == tid){
                   System.out.println("学号重复了...");
                   break;
               }
           }
           //
           System.out.println("请输入新学生的名字");
           String name = scanner.next();
           System.out.println("请输入新学生的成绩");
           int score = scanner.nextInt();
           //存储
           Student student = new Student(id,name,score);
           if (arrayList.add(student)){
               System.out.println("添加成功...");
               System.out.println("是否继续添加([yes] or [no])");
               String addAgin = scanner.next();
               System.out.println(addAgin);
               if(addAgin.equals("no")) {
                   break;
               }
           }else{
               System.out.println("添加失败!");
               System.exit(500);
           }

       }
    }

    public static boolean editStudent(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学号");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if(s.getId() == id){
                System.out.println("请输入要修改的姓名");
                String name = scanner.next();
                System.out.println("请输入要修改的分数");
                int score = scanner.nextInt();
                s.setName(name);
                s.setScore(score);
                System.out.println("修改成功...");
                return true;
            }
        }

        System.out.println("没有该学生...");
        return true;
    }

    public static boolean deleteStudent(ArrayList<Student> arrayList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学号");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if(s.getId() == id){
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println("没有该学生...");
        return true;
    }
}
