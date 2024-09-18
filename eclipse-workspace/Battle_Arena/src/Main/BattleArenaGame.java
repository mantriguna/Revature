package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entity.Player;
import Entity.Character;
import Entity.Weapon;
import Service.Rules;

public class BattleArenaGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 Name: ");
        String p1name = sc.nextLine();
        System.out.print("Enter Player 2 Name: ");
        String p2name = sc.nextLine();
        List<Player> players = new ArrayList<>();
        String[] playerNames = {p1name, p2name};
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello, " + playerNames[i]);
            System.out.print("Enter your character name: ");
            String cname = sc.nextLine();
            System.out.print("Enter your character defense power: ");
            double defense_power = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter your Weapon name: ");
            String wname = sc.nextLine();
            System.out.print("Enter your Weapon attack power: ");
            double wpower = sc.nextDouble();
            sc.nextLine();
            Weapon weapon = new Weapon(wname, wpower);
            Character character = new Character(cname, defense_power, weapon);
            Player player = new Player(playerNames[i], character);
            players.add(player);
        }
        System.out.println("Players have been created successfully....");
        System.out.println("Welcome, TO the Battle Arena Game ");
        System.out.println("Player 1: "+playerNames[0]);
        System.out.println("Player 2: "+playerNames[1]);
        System.out.print("Enter Who attacks Firsts ("+playerNames[0]+" as 1 or"+playerNames[1]+" as 2):");
        int choice=sc.nextInt();
        Rules rule=new Rules();
        System.out.println("-------FIGHT----");
        switch(choice) {
        case 1:
        	while(players.get(0).getCharacter().getHealth()>0 && players.get(1).getCharacter().getHealth()>0) {

                System.out.println(players.get(0).getName()+" have attacked to "+players.get(1).getName()+" attacked by "+players.get(0).getCharacter().getName()+" with "+players.get(0).getCharacter().getWeapon().getWeaponname());
                rule.attack(players.get(0),players.get(1));
                System.out.println(players.get(0).getName()+" Health remaining : "+players.get(0).getCharacter().getHealth());
                System.out.println(players.get(1).getName()+" Health remaining : "+players.get(1).getCharacter().getHealth());
                System.out.println("---------------------------------------");
                if(players.get(0).getCharacter().getHealth()>0 && players.get(1).getCharacter().getHealth()>0) {
                	System.out.println(players.get(1).getName()+" have attacked to "+players.get(0).getName()+" attacked by "+players.get(1).getCharacter().getName()+" with "+players.get(1).getCharacter().getWeapon().getWeaponname());
                    rule.attack(players.get(1),players.get(0));
                    System.out.println(players.get(0).getName()+" Health remaining : "+players.get(0).getCharacter().getHealth());
                    System.out.println(players.get(1).getName()+" Health remaining : "+players.get(1).getCharacter().getHealth());
                }else {
                	break;
                }
                
            }
        	break;
        case 2:
        	while(players.get(0).getCharacter().getHealth()>0 && players.get(1).getCharacter().getHealth()>0) {

                System.out.println(players.get(1).getName()+" have attacked to "+players.get(0).getName()+" attacked by "+players.get(1).getCharacter().getName()+" with "+players.get(1).getCharacter().getWeapon().getWeaponname());
                rule.attack(players.get(1),players.get(0));
                System.out.println(players.get(0).getName()+" Health remaining : "+players.get(0).getCharacter().getHealth());
                System.out.println(players.get(1).getName()+" Health remaining : "+players.get(1).getCharacter().getHealth());
                System.out.println("---------------------------------------");
                if(players.get(0).getCharacter().getHealth()>0 && players.get(1).getCharacter().getHealth()>0) {
                	System.out.println(players.get(0).getName()+" have attacked to "+players.get(1).getName()+" attacked by "+players.get(0).getCharacter().getName()+" with "+players.get(0).getCharacter().getWeapon().getWeaponname());
                    rule.attack(players.get(0),players.get(1));
                    System.out.println(players.get(0).getName()+" Health remaining : "+players.get(0).getCharacter().getHealth());
                    System.out.println(players.get(1).getName()+" Health remaining : "+players.get(1).getCharacter().getHealth());
                    
                }else {
                	break;
                }
                
            }
        	break;
        default:
        	System.out.println("enter a valid value:");
        	choice=sc.nextInt();
        }
        if(players.get(0).getCharacter().getHealth()<0) {
        	System.out.println(players.get(1).getName()+" Won the match by "+players.get(1).getCharacter().getName()+" remaining health :"+players.get(1).getCharacter().getHealth());
        }else {
        	System.out.println(players.get(0).getName()+" Won the match by "+players.get(0).getCharacter().getName()+" remaining health "+players.get(0).getCharacter().getHealth());
        }
        System.out.println("visit Again");
        sc.close();
    }
}
