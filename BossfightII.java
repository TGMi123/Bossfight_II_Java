//Heya! MrCrocodile Dev Speaking
//this is a long project so i just to make sure its not cringe game ._.
import java.util.Scanner;
public class BossfightII {
    public static void main(String[] args) throws InterruptedException {
        //User Input
        Scanner user = new Scanner(System.in);
        //Variables//
        //Menu
        int clickMe = 5;
        int i = 0;
        boolean folder;
        //Game
        boolean game;
        int mv = 0;
        boolean levelI = true;
        boolean levelII = false;
        boolean levelIII = false;
        boolean levelIV = false;
        boolean levelV = false;
        String LvlI;
        String LvlII;
        String LvlIII;
        String LvlIV;
        String LvlV;
        String xLvlI;
        String xLvlII;
        String xLvlIII;
        String xLvlIV;
        String xLvlV;
        //Intro
        System.out.println("MrCrocodile Presents :)");
        Thread.sleep(2000);
        System.out.println("Oops Somethinds Wrong....");
        Thread.sleep(1000);
        while (i < 5) {
            System.out.println("Just enter " + clickMe + " times");
            user.nextLine();
            --clickMe;
            ++i;
            }
        System.out.println("===WELCOME TO BOSSFIGHT II===\nType \"Start\", \"Guides\" & \"Folder\"\nCreated by MrCrocodile :D");
        //CMD
        while (true) {
            String commandINP = user.nextLine();
            if (commandINP.equals("Start")) {
                //Start
                System.out.println("Wanna Start the Game?\nType \"Yes\" to play a Bossfight II");
                String showstart = user.nextLine();
                if (showstart.equals("Yes")) {
                    //Game
                    game = true;
                    if (game) {
                        //If Level Locked
                        if (levelI) {
                            LvlI = "Unlocked";
                            xLvlI = "1";
                        } else {
                            LvlI = "Locked";
                            xLvlI = "X";
                        }
                        if (levelII) {
                            LvlII = "Unlocked";
                            xLvlII = "2";
                        } else {
                            LvlII = "Locked";
                            xLvlII = "X";
                        }
                        if (levelIII) {
                            LvlIII = "Unlocked";
                            xLvlIII = "3";
                        } else {
                            LvlIII = "Locked";
                            xLvlIII = "X";
                        }
                        if (levelIV) {
                            LvlIV = "Unlocked";
                            xLvlIV = "4";
                        } else {
                            LvlIV = "Locked";
                            xLvlIV = "X";
                        }
                        if (levelV) {
                            LvlV = "Unlocked";
                            xLvlV = "5";
                        } else {
                            LvlV = "Locked";
                            xLvlV = "X";
                        }   
                        //Map
                        System.out.println("Welcome to\nBOSSFIGHT II\n---------------\n\n/||||||||\\\n               /||||||\\\n               ||||||||");
                        System.out.println("(uwu)\n |       o     O    o\n |          o           /|||||||||||||||\\\n |\n | Slimes\n[" + xLvlI + "]————————["+ xLvlII + "]");
                        while (mv < 4) {
                            mv++;
                            System.out.println("            |");
                            if (mv == 4) {
                                System.out.println("[" + xLvlIV + "]————————[" + xLvlIII + "]\n |             Giant Spider\n | \n |\n |\n[" + xLvlV + "]\n   Bossfight\n");
                            } else if (mv == 1) {
                                System.out.println("            |  Golems");
                            } else if (mv == 3) {
                                System.out.println(" Robot404   |");
                            }
                        }
                        //Level
                        Thread.sleep(2000);
                        System.out.println("Level 1 " + LvlI);
                        Thread.sleep(500);
                        System.out.println("Level 2 " + LvlII);
                        Thread.sleep(500);
                        System.out.println("Level 3 " + LvlIII);
                        Thread.sleep(500);
                        System.out.println("Level 4 " + LvlIV);
                        Thread.sleep(500);
                        System.out.println("Level 5 " + LvlV);
                        try {
                            while (true) {
                                int level = user.nextInt();
                                switch (level) {
                                case 1:
                                if (levelI) {
                                    System.out.println("bunch of Slimes can jump and punch you\n---------------\nRounds: 1-3\nDamages: 2-8hp\nEnemies: 3\nPress \"Start\" to start!");
                                    String levelIStart = user.nextLine();
                                    if (levelIStart.equals("Start")) {
                                        //?COMMING SOON?//
                                    } else {
                                        System.out.println("Start Canceled...");
                                    }
                                } else {
                                    System.out.println("Its Locked!");
                                }
                                break;
                                case 2:
                                if (levelII) {

                                } else {
                                    System.out.println("Its Locked!");
                                }
                                break;
                                case 3:
                                if (levelIII) {
                                        
                                } else {
                                    System.out.println("Its Locked!");
                                }
                                break;
                                case 4:
                                if (levelIV) {
                                        
                                } else {
                                    System.out.println("Its Locked!");
                                }
                                break;
                                case 5:
                                if (levelV) {
                                        
                                } else {
                                    System.out.println("Its Locked!");
                                }
                                break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Type only the number!");
                        }
                    } else {
                        System.out.println("Game Canceled...");
                    }
                } else if (commandINP.equals("Guides")) {
                    //Guides
                    System.out.println("===GUIDES in Bossfight II===\nwell please dont say cringe on me..\n----------\nSlimes can takes 2-8 Damages\nGolems can takes 4-10 Damages\nGiant Spider can takes 8-16 Damages\n404Robot can takes 10-16 Damages\nBossfight is unknowned...\n----------\n===You==\nHealth: 30\nShield: 40\n===Stats==\nRounds: 6\nAdditional Rounds: 3-6\n===Weapons===\nSwords, Rare Swords, Ultra Swords, Bows, Simple Bomb & Stength Potion");
                } else if (commandINP.equals("Folder")) {
                    //Folder
                    folder = true;
                    if (folder) {
                        System.out.println("----------\n===FOLDER===\nSelect a Folder or File in your keyboard\nType \"Cancel\" to cancel folder\n\\--18+ <DIR>\n\\--credits.txt");
                        while (true) {
                            String chooseFol = user.nextLine();
                            if (chooseFol.equals("18+")) {
                                System.out.println("\\----18Plus.txt");
                                String chooseFol2 = user.nextLine();
                                if (chooseFol2.equals("18Plus.txt")) {
                                System.out.println("Never gonna give you up\nnever gonna let you down");
                                } else {
                                    System.out.println("Folder not Exist");
                                }
                            } else if (chooseFol.equals("credits.txt")) {
                                System.out.println("===CREDITS===\nPotato Chronicler\nNapstaparrot\nU-ndefined\nWELBIC\n===CREATED BY===\nMrCrocodile");
                            } else if (chooseFol.equals("Cancel")) {
                                folder = false;
                                System.out.println("----------");
                                break;
                            } else {
                                System.out.println("Folder not Exist");
                            }
                        }
                    }
                } else {
                    //Not Exist
                    System.out.println("\n\"" + commandINP + "\"" + "\n^ ERROR, not exist...");
                }
            }
        }
    }
}
