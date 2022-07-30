package chapterThree;

import java.util.Scanner;

public class TechnoPhone {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("""
                
                Techno Mobile
                *** Welcome ***
                1 -> Phone Book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call Divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> SIM Services
        Enter  number of your preferred function
                """);
        int keypad = input.nextInt();

        switch (keypad){
            case 1:
                System.out.print("PhoneBook");
                System.out.println("""
                        Enter:
                        
                        1. Search
                        2. Search Nos
                        3. Add NAme
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Option
                        9. Speed dial
                        10. Voice tag
                        """);
                keypad = input.nextInt();
                switch (keypad) {
                    case 1:
                        System.out.println("make a research");
                        break;
                    case 2:
                        System.out.println("Nos");
                        break;
                    case 3:
                        System.out.println("Your name is Asa");
                        break;
                    case 4:
                        System.out.println("Erase errors");
                        break;
                    case 5:
                        System.out.println("Edit contacts");
                        break;
                    case 6:
                        System.out.println("what is your tone");
                        break;
                    case 7:
                        System.out.println("send a business card");
                        break;
                    case 8:
                        System.out.println("""
                                1. Types of view
                                2. Memory status
                                """);
                        keypad = input.nextInt();
                        switch (keypad) {

                            case 1:
                                System.out.println("Landscape");
                                break;
                            case 2:
                                System.out.println("memory is 500kb");
                                break;
                        }
                        break;

                    case 9:
                        System.out.println("your dialing speed is high");
                        break;
                    case 10:
                        System.out.println("click to select voice tag");
                        break;
                }

        case 2:
           System.out.println("Messages");
                System.out.println("""
                        
                        1. Write Messages
                        2. Inbox
                        3. Outbox
                        4. Picture Messages
                        5. Templates
                        6.Smileys   
                        7. Message Settings            
                        """);
                keypad = input.nextInt();
                switch (keypad) {
                    case 1:
                        System.out.println("Compose a message");
                        break;
                    case 2:
                        System.out.println("Open your Messages");
                        break;
                    case 3:
                        System.out.println("Check Out Going Messages");
                        break;
                    case 4:
                        System.out.println("Send a Picture Message");
                        break;
                    case 5:
                        System.out.println("Choose a Template");
                        break;
                    case 6:
                        System.out.println("Add a Smiley");
                        break;
                    case 7:
                        System.out.println("""
                                1. Set1
                                2. Common
                                """);
                        keypad = input.nextInt();
                        switch(keypad){
                        case 1:
                            System.out.println("Set Message center number");
                            break;
                        case 2:
                            System.out.println("SMS or MMS");
                            break;
                        case 3:
                            System.out.println("Message Validity Status");
                            break;
                        }
                    keypad = input.nextInt();
                        switch (keypad) {
                            case 1:
                                System.out.println("Message Delivered");
                                break;
                            case 2:
                                System.out.println("Reply via same message center");
                                break;
                            case 3:
                                System.out.println("Character Support area");
                                break;
                        }
           }
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("""
                        1. Missed Calls
                        2. Received Calls
                        3. Dialled Number
                        4. Erase Recent Calls
                        5. Show Call Duration
                        6. Show Call Cost
                        7. Call Cost Settings
                        8. Prepaid Settings
                        """);
                    keypad = input.nextInt();
                    switch (keypad){
                        case 1:
                            System.out.println("Show Missed Calls");
                            break;
                        case 2:
                            System.out.println("Show all Receive calls");
                            break;
                        case 3:
                            System.out.println("List of all Dialled Number");
                            break;
                        case 4:
                            System.out.println("Erase all call logs");
                            break;
                        case 5:
                            System.out.println("""
                                    1. Last Call Durations
                                    2. All Calls Duration
                                    3. Received Calls Duration
                                    4. Dialled Calls Duration
                                    5. Clear Timer
                                    """);
                            keypad = input.nextInt();
                            switch (keypad){
                                case 1:
                                    System.out.println("Last Call Durations");
                                    break;
                                case 2:
                                    System.out.println("All Call Durations");
                                    break;
                                case 3:
                                    System.out.println("Received call Durations");
                                    break;
                                case 4:
                                    System.out.println("Dialled Calls Durations");
                                    break;
                                case 5:
                                    System.out.println("Clear Call Timer");
                                    break;
                            }
                        case 6:
                            System.out.println("""
                                    1. Last Call Cost
                                    2. All Call Cost
                                    3. Clear Counters
                                    """);
                            keypad = input.nextInt();
                            switch (keypad){
                                case 1:
                                    System.out.println("Last Call Cost");
                                    break;
                                case 2:
                                    System.out.println("All Call Cost");
                                    break;
                                case 3:
                                    System.out.println("Clear Call Counters");
                                    break;
                            }
                        case 7:
                            System.out.println("""
                                    1. Call Cost Limit
                                    2. Show Call Cost in
                                    """);
                            keypad = input.nextInt();
                            switch (keypad){
                                case 1:
                                    System.out.println("Call Cost Limit");
                                    break;
                                case 2:
                                    System.out.println("Show Call Cost");
                                    break;
                            }
                        case 8:
                            System.out.println("Prepaid Credit");
                            break;

                    }
            case 5:
                System.out.println("""
                        1. Ringing Tone
                        2. Ringing Volume
                        3. Incoming Call Alert
                        4. Composer
                        5. Message Alert Tone
                        6. Keypad Tones
                        7. Warning and Game Tones
                        8. Vibrating Alert
                        9. Screen Saver                       
                        """);
                        keypad = input.nextInt();
                        switch (keypad){
                            case 1:
                                System.out.println("Set Ringing Tone");
                                break;
                            case 2:
                                System.out.println("Set Ringing Volume");
                                break;
                            case 3:
                                System.out.println("Incoming Call Alert");
                                break;
                            case 4:
                                System.out.println("Composer");
                                break;
                            case 5:
                                System.out.println("Message Alert Tone");
                            case 6:
                                System.out.println("Keypad Tones");
                                break;
                            case 7:
                                System.out.println("Warning and Game Tones");
                                break;
                            case 8:
                                System.out.println("Vibrating Alert");
                                break;
                            case 9:
                                System.out.println("Screen Saver");
                                break;
                        }
            case 6:
                            System.out.println("""
                              1. Call Settings
                              2. Phone Settings
                              3. Security Settings
                              4. Restore Factory Settings
                                       """);
                            keypad = input.nextInt();
                            switch (keypad){
                            case 1:
                                System.out.println("""
                                        1. Automatic Redial
                                        2. Speed Dialing
                                        3. Call Waiting options
                                        4. Own Number Sending 
                                        5. Phone Line In Use
                                        6.Automatic Answer
                                        """);
                                keypad = input.nextInt();
                                switch (keypad){
                                    case 1:
                                        System.out.println("Automatic Redial");
                                        break;
                                    case 2:
                                        System.out.println("Speed Dialing");
                                        break;
                                    case 3:
                                        System.out.println("Call Waiting Option");
                                        break;
                                    case 4:
                                        System.out.println("Own Number Sending");
                                        break;
                                    case 5:
                                        System.out.println("Phone Line in use");
                                        break;
                                    case 6:
                                        System.out.println("Automatic answer");
                                        break;

                                }
                                case 2:
                                    System.out.println("""
                                        1. Language
                                        2. Cell info display
                                        3. Welcome note
                                        4. Network selection
                                        5. Lights2
                                        6. Confirm SIM service actions
                                        """);
                                     keypad = input.nextInt();
                                    switch (keypad) {
                                    case 1:
                                         System.out.println("Choose your preferred language");
                                         break;
                                    case 2:
                                      System.out.println("Display Cell Info.");
                                      break;
                                    case 3:
                                        System.out.println("Welcome Note");
                                        break;
                                        case 4:
                                        System.out.println("Select Preferred Network");
                                        break;
                                    case 5:
                                        System.out.println("Lights");
                                        break;
                                    case 6:
                                        System.out.println("Confirm SIM Services Action");
                                        break;
                                 }
                                case 3:
                                    System.out.println("""
                                            1. PIN code request
                                            2. Call barring service
                                            3. Fixed dialling
                                            4. Closed user group
                                            5. Phone security
                                            6. Change access codes
                                            """);
                                    keypad = input.nextInt();
                                    switch (keypad) {
                                        case 1:
                                            System.out.println("PIN Code Request");
                                            break;
                                        case 2:
                                            System.out.println("Call barring services");
                                            break;
                                        case 3:
                                            System.out.println("Fixed Dialling");
                                            break;
                                        case 4:
                                            System.out.println("Closed User Group");
                                            break;
                                        case 5:
                                            System.out.println("Phone Security");
                                            break;
                                        case 6:
                                            System.out.println("Change Access Codes");
                                            break;
                                    }
                                case 4:
                                    System.out.println("Restore Factory Settings");

                    }
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminder");
                break;
            case 11:
                System.out.println("""
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """);
                keypad = input.nextInt();
                switch (keypad) {
                    case 1:
                        System.out.println("Set Alarm");
                        break;
                    case 2:
                        System.out.println("Cloth settings");
                        break;
                    case 3:
                        System.out.println("Set Date");
                        break;
                    case 4:
                        System.out.println("Stop Watch");
                    case 5:
                        System.out.println("CountDown Timer");
                        break;
                    case 6:
                        System.out.println("Auto Update Time & Date");
                        break;
                }
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM Services");
                break;
        }
    }
}
