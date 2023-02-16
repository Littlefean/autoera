package com.liren.autoera;

import com.liren.autoera.model.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = Pet.getDefaultPet(100, "小狗");
        Pet mob = Pet.getDefaultPet(35, "蚂蚁");
        System.out.println("你的宠物：");
        System.out.println("姓名：" + pet.getName());
        System.out.println("血量：" + pet.getHealth());
        System.out.println("对面宠物：");
        System.out.println("姓名：" + mob.getName());
        System.out.println("血量：" + mob.getHealth());
        try(Scanner scanner = new Scanner(System.in)) {
            for (;;) {
                System.out.println("按回车键进入下一回合");
                scanner.nextLine();
                pet.attack(mob);
                mob.attack(pet);
                System.out.println("你的宠物：");
                System.out.println("姓名：" + pet.getName());
                System.out.println("血量：" + pet.getHealth());
                System.out.println("对面宠物：");
                System.out.println("姓名：" + mob.getName());
                System.out.println("血量：" + mob.getHealth());
            }
        }
    }
}
