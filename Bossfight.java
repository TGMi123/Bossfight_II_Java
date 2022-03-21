/*
 * Created by MrCrocodile (Aka TGMi123 / TGMi)
 * Thanks to Github and Basic Projects Games :):):):)
 * 
 * 
 * This Code since i made when i was 12 Years old
 * Made in 🇵🇭
 */
import java.util.Scanner;
public class Bossfight {
    public static void main(String[] args) {
        //User Input
        Scanner user = new Scanner (System.in);
        //Variables
        int Sword = 7;
        int RareSword = 4;
        int UltraSword = 2;
        int hpPlayer = 20;
        int shieldPlayer = 30;
        int hpBossfight = 30;
        int round = 1;
        int hpAgain = 1;
        int SwordPrize = (int)(Math.random() * 20);
        int RareSwordPrize = (int)(Math.random() * 12);
        int UltraSwordPrize = (int)(Math.random() * 8);
        String bossfight;
        //Speech Bubble
        user.nextLine();
        System.out.println("Hello!");
        user.nextLine();
        System.out.println("Will you not Responed?");
        user.nextLine();
        System.out.println("Fine, your not Responed! I will fight btw uwu\n====================");
        //Menu
        System.out.println("Start the Game? type \"Start\" to start");
        String startgame = user.nextLine();
        //Game
        if (startgame.equals("Start")) {
            System.out.println("=====ROUND 1=====");
            while (true) {
                //Lose
                if (hpPlayer < 1) {
                    System.out.println("=====GAME OVER=====\n>THANKS TO<\nPotato Chronicler\nNapstaparrot\nU-ndefined\nWELBIC\n>CREATED BY<\nMrCrocodile");
                    break;
                }
                //Win
                if (hpBossfight < 1) {
                    //Prizes
                    SwordPrize = (int)(Math.random() * 20);
                    RareSwordPrize = (int)(Math.random() * 12);
                    UltraSwordPrize = (int)(Math.random() * 8);
                    System.out.println("==YOU DEFEAT THE BOSSFIGHT==\nCollect Rewards!\n" + SwordPrize + " Swords\n" + RareSwordPrize + " Rare Swords\n" + UltraSwordPrize + " Ultra Swords\nType \"Collect\" to get some rewards or type any key to remove the reward");
                    String reward = user.nextLine();
                    if (reward.equals("Collect")) {
                        Sword = Sword + SwordPrize;
                        UltraSword = UltraSword + UltraSwordPrize;
                        RareSword = RareSword + RareSwordPrize;
                        System.out.println("Collected!\nStart Again? type \"Start\" to start");
                    } else {
                        System.out.println("Collect canceled...\nStart Again? type \"Start\" to start");
                    }
                    //Start Again
                    String gameagain = user.nextLine();
                    if (gameagain.equals("Start")) {
                        System.out.println("Well Start Now!");
                        hpAgain++;
                        hpBossfight = 30 * hpAgain;
                        hpPlayer = 20 * hpAgain;
                        shieldPlayer = 30 * hpAgain;
                    } else {
                        System.out.println("Well the Game Closed...\nCREATED BY MRCROCODILE");
                        break;
                    }
                    round++;
                    System.out.println("=====ROUND " + round + "=====");
                }
                //Inventory
                System.out.println("---------------\n==WEAPONS==\nSword (4 Damage): " + Sword + "\nRare Sword (6 Damage): " + RareSword + "\nUltra Sword (8 Damage): " + UltraSword + "\n==PLAYER==\nHealth: " + hpPlayer + "\nShield: " + shieldPlayer + "\n==BOSS==\nBoss Health: " + hpBossfight + "\n---------------");
                String weapon = user.nextLine();
                if (weapon.equals("Sword")) {
                    if (Sword > 0) {
                        --Sword;
                        hpBossfight = hpBossfight - 4;
                    } else if (Sword < 0 || RareSword < 0 || UltraSword < 0) {
                        System.out.println("!: Your All inventory is empty");
                    } else {
                        Sword = 0;
                        System.out.println("!: Your Sword is empty");
                    }
                } else if (weapon.equals("Rare Sword")) {
                    if (RareSword > 0) {
                        --RareSword;
                        hpBossfight = hpBossfight - 6;
                    } else if (Sword < 0 || RareSword < 0 || UltraSword < 0) {
                        System.out.println("!: Your All inventory is empty");
                    } else {
                        RareSword = 0;
                        System.out.println("!: Your Rare Sword is empty");
                    }
                } else if (weapon.equals("Ultra Sword")) {
                    if (UltraSword > 0) {
                        --UltraSword;
                        hpBossfight = hpBossfight - 8;
                    } else if (Sword < 0 || RareSword < 0 || UltraSword < 0) {
                        System.out.println("!: Your All inventory is empty");
                    } else {
                        UltraSword = 0;
                        System.out.println("!: Your Ultra Sword is empty");
                    }
                } else {
                    System.out.println("!: Player is not Doing Anything");
                }
                //AI
                int bossfightexc = (int)(Math.random() * 4);
                //Bossfight
                if (bossfightexc == 0) {
                    bossfight = "!: Bossfight is using Punch (4 Damage)";
                    if (shieldPlayer < 0) {
                        hpPlayer = hpPlayer - 4;
                        shieldPlayer = 0;
                    } else {
                        shieldPlayer = shieldPlayer - 4;
                        hpPlayer = hpPlayer - 2;
                    }
                } else if (bossfightexc == 1) {
                    bossfight = "!: Bossfight is using Power Punch (6 Damage)";
                    if (shieldPlayer < 0) {
                        hpPlayer = hpPlayer - 6;
                        shieldPlayer = 0;
                    } else {
                        shieldPlayer = shieldPlayer - 6;
                        hpPlayer = hpPlayer - 4;
                    }
                } else if (bossfightexc == 2) {
                    bossfight = "!: Bossfight is using Anime Punch (8 Damage)";
                    if (shieldPlayer < 0) {
                        hpPlayer = hpPlayer - 8;
                        shieldPlayer = 0;
                    } else {
                        shieldPlayer = shieldPlayer - 8;
                        hpPlayer = hpPlayer - 6;
                    }
                } else {
                    bossfight = "!: Bossfight is not Doing Anything";
                }
                System.out.println(bossfight);
            }
        } else {
            System.out.println("Well the Game Closed...\nCREATED BY MRCROCODILE");
        }
    }
}
