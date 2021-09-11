import java.util.Scanner;

public class StoryPaths {

        Scanner input = new Scanner(System.in);

        public void mainMenu() {
            System.out.println("It's time for an adventure! How does it end, you ask?\n" +
                    "Well, that, my friend, is up to you! As your journey begins, you \n" +
                    "will be offered options. The choices you make will determine the\n" +
                    "outcome. Displeased with the ending? Try again! There's so much\n" +
                    "fun to be had, when you CHOOSE YOUR OWN ADVENTURE!");

            boolean run = true;
            while (run) {
                System.out.println("\nYour first choice begins now:\n" +
                        "(1) Let the adventure begin!\n" +
                        "(2) I'm not up for an adventure today.\n");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        letTheAdventureBegin();
                    } else if (userChoiceInt == 2) {
                        System.out.println("\nAdventure is Waiting! Come Back Again Soon!");
                        System.exit(0);
                    } else {
                        System.out.println("Sorry, that was an invalid response.");
                    }

                } catch (Exception ex) {
                    System.out.println("Sorry, that was an invalid response.");
                }
            }


        }

        public void letTheAdventureBegin() {
            System.out.println("\nSnuggled and sleeping soundly under your covers late one night, you awaken to the sound of whispers.\n" +
                    "'Who's there?' you question the darkness, and although there is no reply, you cannot help but sense someone is with you.\n" +
                    "Silently, your fists clench the blankets more tightly as you consider what to do.");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Stay in bed");
                System.out.println("(2) Get up to investigate");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        stayInBed();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        investigateTheSound();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }

        public void stayInBed() {
            System.out.println("\nYou close your eyes, and hold completely still. Your breath catches with each creak and groan that echoes through the walls.\n" +
                    "Was that the wind? The stirring of someone familiar? Or something else? You don't know for how long you remain awake, although it feels like \n" +
                    "an eternity. At some point, your heartbeat slows, your eyelids grow heavy, and you begin to drift back to sleep. Just as the dreamworld welcomes \n" +
                    "your return, you feel a soft tug on the tip of your toe. There is no question about it now, someone is in your room.");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Jump up and check under the bed");
                System.out.println("(2) Run out of the room to get help");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        checkUnderTheBed();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        runForHelp();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }

        public void runForHelp() {
            System.out.println("\nYou throw back the covers and leap out of bed, making sure to land out of the grasp of whatever might be lurking underneath.\n" +
                    "Sprinting down the hall in complete darkness, your hands outstretched to prevent a collision with obstacles known and unknown, you round the \n" +
                    "corner to your parents' room. Throwing the door open it crashes into the wall behind, sending your sleeping parents stumbling \n" +
                    "out of bed in confusion. 'Something's in my room!' you alert them breathlessly. Grabbing a candle from their bedside, they accompany you back to \n" +
                    "your room to investigate. Your mother comforts you as your father checks each nook and cranny for the toe-pinching culprit.  When the search \n" +
                    "concludes, no intruder has been found. You assure them this was not a case of imagination run wild, but there's nothing else to be done.  They tuck \n" +
                    "you into bed once again and gently close the door. You feel both silly and certain at the same time. It must have been a dream, you tell yourself, and yet \n" +
                    "you can still feel the tingling of the pinch upon your toe. Your mind races with confusion until the call of sleep becomes too great to resist. \n" +
                    "When next you open your eyes, the sun is shining and a new day has begun. You climb out of bed to start another day. Before leaving the room, you fall to your knees \n" +
                    "and peer under the bed. You reach for what looks like a small piece of paper. In the light of day, you see it is just that; a handwritten note, folded and placed \n" +
                    "there for you to find. You open it and read:\n" +
                    "\nI came last night to offer you adventure worth the taking \n" +
                    "Instead you ran and brought adults, your hands and legs were shaking \n" +
                    "Now adventure's gone, you missed your chance, your fear has left you frozen \n" +
                    "For adventure's sake, next time don't make this selection you have chosen.\n");
            System.out.println("------------------------------------------------------\n" +
                    "----------The Adventure is Over...For Now!------------\n" +
                    "------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void checkUnderTheBed() {
            System.out.println("\nYou stare at the ceiling, willing the courage necessary, then toss your covers aside and fall to the ground, peering beneath the bed. Your cheek \n" +
                    "rests against the cold stone floor as your eyes scan the darkness. The soft glow of the candlelight in the room causes a glimmer in the two eyes staring back \n" +
                    "at you. You stumble backwards, scooting away from the bed as the figure underneath squirms and scurries out. Your eyes grow wide as the being stands upright and \n" +
                    "you see that it is an elf, a house elf, commonly known to roam the halls of ancient castles such as yours. His eyes meet yours as he shuffles back and forth on his \n" +
                    "tiny, slippered feet. 'What do you want? Who are you?' you ask.  The elf replies that he has sought you out because he has seen your helpful and kindhearted nature \n" +
                    "in your daily actions about the castle. He informs you that his name is Felix, and he needs help reclaiming something important that was taken from him. An evil \n" +
                    "goblin, living beneath the castle, has stolen Felix's family flag, and Felix has been chosen to retrieve it. He knows such a difficult task, against so formidable an \n" +
                    "opponent, will lead to certain capture without assistance from someone else...someone like you.");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Refuse to help Felix");
                System.out.println("(2) Offer to help Felix");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        refuseToHelpFelix();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        offerToHelpFelix();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }

        public void refuseToHelpFelix() {
            System.out.println("\nYou ponder the possibilities for a moment. An evil goblin, a pathetic looking elf, a family flag. This sounds like drama \n" +
                    "you're not interested in getting involved with. You could get in trouble! You could get hurt! You could get killed! You tell Felix, that, \n" +
                    "while you do feel for his circumstances, you are neither prepared for nor comfortable embarking on a mission into a dangerous lair on this night. \n" +
                    "Felix's chest drops, his eyes lower, as hope drains from him. 'Okay,' he mumbles halfheartedly as he turns and disappears into the shadows of the \n" +
                    "room. You can't help but feel a little guilty after he exits. The heaviness of his obvious disappointment seems to linger. You crawl back \n" +
                    "into bed and pull the covers up to your chin, as if shielding yourself from the scrutiny of a choice most selfish. You remain awake,lost in your thoughts, \n" +
                    "slightly ashamed; after all, hadn't Felix said your helpfulness and kindhearted actions were what led him to you? How wrong you've proven him. It's too much \n" +
                    "to bear. You slide out of bed and out the door. An evil goblin beneath the castle he said...then that is where you will go. \n" +
                    "You follow the winding staircase into the depths of the underground. In the distance you hear a deep rumbling voice. As you near what must be \n" +
                    "the goblin's quarters, you peer around the corner and witness a horrible sight. The goblin has Felix in his clutches, dangling by his toes over a fire, no \n" +
                    "doubt about to become a late night snack for this cruel and merciless creature. You have to help Felix, but what is the best approach?");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Attack the goblin");
                System.out.println("(2) Bargain with the goblin");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        attackTheGoblin();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        bargainWithTheGoblin();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }

        }

        public void offerToHelpFelix() {
            System.out.println("\nYou are caught off-guard by such a request, but find yourself oddly flattered at the same time. Considering your options \n" +
                    "and the risk involved, you determine that, while helping Felix might not be the wisest thing to do, helping Felix is the right thing to do.\n" +
                    "Felix's eyes light up upon hearing the news. 'I knew you were the one! I knew I chose wisely!' Felix celebrates. You're glad he feels so \n" +
                    "confident, since you can't say the same for yourself. Together, you tiptoe through the castle and down the winding staircase into the depths \n" +
                    "of the goblin's lair. A rhythmic rumbling echoes throughout the cavernous surroundings. You peer around the corner to find a monstrous \n" +
                    "creature sleeping soundly on a mound of animal hides and bones. Frozen in horror, you feel a tug on the leg of your pajamas. Looking down, Felix \n" +
                    "stares up at you, his eyes wide. He points toward the slumbering beast and as you follow his finger you notice, tucked under the goblins chin, coated \n" +
                    "in oozing drool, what you can only assume is the family flag of your hopeful companion. Looking around the room, your mind races with options until \n" +
                    "you settle on two options.");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Sneak in ");
                System.out.println("(2) Create a distraction ");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        sneakIn();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        createADistraction();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }

        public void attackTheGoblin() {
            System.out.println("\nFelix's whimpers coupled with the raucous laughter of the goblin create enough noise to conceal the sounds of your next move. You spring\n" +
                    "from the shadows and race toward the goblin. Distracted by the promise of a tasty morsel, the goblin is completely unaware of your presence until you leap\n" +
                    "onto his back, at which point he lurches forward and groans in confusion. Spinning wildly the goblin gropes for you, all while still holding Felix by \n" +
                    "the feet. To an outsider watching, it might look like some sort of game, but you know the stakes could not be higher. You cling to the goblin's back, desperately\n" +
                    "avoiding each swipe it makes. You realize overpowering a tremendous beast might not have been the wisest course of action. In a fit of rage, the goblin continues\n" +
                    "to thrash about. You're considering jumping down and making a run for it when the goblin pauses. You stay frozen on its back, awaiting its next move. \n" +
                    "Suddenly, the goblin begins running backwards, toward what, you aren't sure. Is it going to run you into a wall, you wonder with horror. You could jump down, but \n" +
                    "you'd just be trampled by the goblin's pounding feet. You crane your neck for a glimpse, but it comes too late. The goblin runs until his back hits an open \n" +
                    "cage resting against the wall. The force of the collision knocks you off the goblin and you land with a thud on the floor of the cage. Just as the reality of your\n" +
                    "situation becomes clear, the door to the cage slams shut and the goblin, chuckling to himself, returns to the fireside. You lock eyes with Felix who's still dangling\n" +
                    "helplessly from the goblin's grip. 'I'm sorry,' you whisper.");
            //System.out.println("\n[enter] to Main Menu");
            // input.nextLine(); //make the user hit enter before continuing
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "----You Have Been Captured. You Will Soon Be the Goblin's Dinner----\n" +
                    "----------------------The Adventure is Over!------------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void bargainWithTheGoblin() {
            System.out.println("\nLooking around the space, you see stacks of twinkling jewels, glittery trinkets, and shiny coins. Obviously, this goblin has a taste for house elves and valuable goods.\n" +
                    "This gives you an idea. Taking a deep breath, you clear your throat and step into the room. Startled, the goblin turns and stares. It licks its lips and sniffs the air as though\n" +
                    "mentally preparing for a second meal that has foolishly entered its den. 'I've come to strike a deal with you,' you announce confidently The goblin raises his eyebrow in question. Slowly, \n" +
                    "you slide your ring off your finger and hold it out to the goblin. 'This ring,' you say, 'is very valuable.' You turn it around in your hand; the light reflects of the jewels casting\n" +
                    "tiny shimmers about the lair. 'I'll give you this ring, in exchange for the house elf you hold and his family flag.' The goblin sits, unmoving. 'You can always find another meal, \n" +
                    "but you won't stumble upon the opportunity to acquire a ring like this again.' The goblin lowers its hand slightly, bringing Felix closer to the fire. 'No, don't...!' you start, but\n" +
                    "the goblin shifts and tosses Felix to the side. Frantic, Felix scrambles to his feet and races to the table to grab his flag. He looks at you smiling and you smile in return. Your \n" +
                    "relief doesn't last long as you look up to see the goblin lumbering toward you, no doubt eager to collect his prize. You take a step back and hold the ring out as far as your arm \n" +
                    "will reach. The goblin swipes it from your fingers with his thick rough hand and carries it over to his collection. You don't wait to see what he does next. Locking eyes with Felix, you motion\n" +
                    "for a hasty exit, and the two of you quietly slip out of the room and up the stairs. In the safety of the main castle halls, Felix looks at you with deep gratitude. It seems silly for \n" +
                    "something as simple as a flag to garner so much emotion, but then again the intricacies of house elves' culture escapes you. 'Well, goodbye, Felix,' you say, softly. 'Your family is \n" +
                    "lucky to have you, such a clever and brave elf.' Felix smiles and nods. He stands for a moment, as though unsure of what to do, then runs to your side and wraps his small arms around you. The\n" +
                    "frailty and delicacy of his tiny frame were misleading, as he squeezes you with a fierceness you could not have anticipated. 'Thank you,' he whispers softly before slowly releasing his hold\n" +
                    "on you. And with that he turns and disappears around the corner. You follow quietly behind to see where he is headed, but when you round the corner, no trace of him remains. You decide to return\n" +
                    "to the comforts of your bed, although after the adventure you've just had, sleep seems unlikely.");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "--------------------Nice work! You saved the day!-------------------\n" +
                    "------------------The Adventure is Over...For Now!------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void sneakIn() {
            System.out.println("\nYou turn to Felix and motion for him to stay put. Ever so carefully, you begin creeping toward the sleeping beast. Watching it with laser focus, you round the side of the heap.\n" +
                    "You're inching closer when your foot hits one of the many bone fragments scattered about the room. It slides across the floor, clattering and colliding with other bits of rubbish. You freeze\n" +
                    "as your jaw drops and your eyes grow wide in horror. First, you look to the goblin, who gently stirs and grunts in its sleep. Then your eyes travel to Felix, who is still standing by the stairs,\n" +
                    "clutching the stone wall in terror. Both of you catch your breath as you realize the commotion did not disturb the deep slumber of the monster. Resuming the quest, you inch forward, careful to\n" +
                    "mind the remnants of the goblins prior meals. At last, you are within reach of the prize for which you have risked your life this very night, the treasured flag of Felix's family, resting now\n" +
                    "beneath the gargantuan goblin's head. Slowly, you reach out until your fingertips grip the tattered edge and give a gentle tug. It will not budge. You scoot forward a bit more to get a better grip.\n" +
                    "Goblin slobber covers the majority of the flag, making a good grasp on the fabric difficult to maintain. Leaning back for more leverage, you pull a bit harder and notice slight movement as the flag\n" +
                    "begins to slide out from under the goblin's resting head. Smiling, you look up to signal to Felix the progress, albeit small, when you are stopped dead in your tracks by what you see. Another\n" +
                    "goblin, slightly smaller than the first, has Felix in its arms, covering his mouth so he cannot warn you about the ambush. Horrified, you glance down at the sleeping goblin only to find it is sleeping\n" +
                    "no more. Was it ever really sleeping, you're not sure, but now it is awake...awake and smiling, his broken jagged teeth spread wide in satisfaction. Before you can even think of what to do, the goblin\n" +
                    "reaches out and grabs you. You struggle to break free, but your efforts are futile. You are no match for what has turned out to be a pair of very clever goblins.");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "----You Have Been Captured. You Will Soon Be the Goblin's Dinner----\n" +
                    "----------------------The Adventure is Over!------------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void createADistraction() {
            System.out.println("\nYou stand with Felix in the shadows listening carefully for movement. Only the continued sounds of slumber can be heard. Even from a distance,\n" +
                    "the sheer size of the goblin is intimidating. You realize you and Felix are no match for the beast when it comes to strength. Speed, on the other hand, might be\n" +
                    "a different story. Glancing around, you spot a goblet on the ground. Carefully, you reach out and grab it, pulling it swiftly back into the safety of the shadows. \n" +
                    "Felix looks at you curiously, so you lean forward and whisper your plan. He stares at you wide-eyed and uncertain, but nods in agreement. You nod to confirm, then turn\n" +
                    "and take a deep breath. This is it. You hurl the goblet with all your might across the room. Quickly, you duck back into the darkness as the crash echoes throughout\n" +
                    "the den. You listen nervously as the goblin awakens. Though you can't see, you can imagine him stumbling out of bed, lumbering about for the source of the commotion.\n" +
                    "Cautiously, you lean your head around the corner and wait for the perfect moment. Now! Ducking, you race across the floor to the back end of the heap of bones. You\n" +
                    "pause, catching your breath as Felix scrambles to your side. Peering around the corner, you see the goblin rummaging through his piles of rubbish and jewels. You wait a moment\n" +
                    "before tossing a large bone scrap farther into the corner of the lair. The goblin races toward the sound. Without hesitating, you reach above your head and feel around for the \n" +
                    "flag. Your fingers touch a large piece of cloth and you quickly yank it down. Felix's eyes light up. He lunges forward and grabs the flag, hugging it closely to his chest. You\n" +
                    "peek around the edge of the heap and hear the goblin's roars of displeasure in the distance. Yanking Felix by the arm, you scurry across the floor and up the winding stairs.\n" +
                    "Walking through the castle halls, Felix is practically skipping with joy, and you can't help but feel a bit proud of yourself. Obviously, you won't be able to share this story\n" +
                    "with others. You'd be in terrible trouble if anyone found out you'd been exploring beneath the castle, but you know that you will remember this moment forever nonetheless.");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "--------------------Nice work! You saved the day!-------------------\n" +
                    "------------------The Adventure is Over...For Now!------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void investigateTheSound() {
            System.out.println("\nEver so quietly, you peel back the covers. Slowly, holding your breath, you lower your feet to the floor and stand, wincing\n" +
                    "as the mattress squeaks in protest of your departure. Grabbing the candle by your bed and creeping across the cold stone floor you pause \n" +
                    "with your ear to the door, listening for...what exactly, you're not quite sure. Turning the doorknob gently, you brace yourself for the groan \n" +
                    "of the heavy wooden door as it opens. The flickering light of your candle casts dancing shadows along the stone hallway walls as stand in the doorway. \n" +
                    "You glance cautiously to the left and right, noticing a soft flicker of light coming from beneath a library door at the end of the hall. You're tiptoeing\n" +
                    "to the door when you pause to consider what might be behind it. Is this really something you should be looking into? Suddenly you hear  the soft padding of\n" +
                    "footsteps behind you. You spin around just in time to see a figure round the corner at the opposite end of the hall and disappear. Who was that, and what\n" +
                    "are the doing running about at this time of night? You turn back to the closed door in front of you. You glance back at the end of the hall where the \n" +
                    "mysterious figure vanished. You're curious about both, but can only pursue one mystery.");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Open the door to investigate the room");
                System.out.println("(2) Follow the mysterious figure down the hall");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        openTheDoor();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        followTheFigure();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }


        public void openTheDoor() {
            System.out.println("\nYou press your ear to the door, listening for some clue as to what might be behind it. Hearing nothing, you ease the door open slowly. Poking\n" +
                    "your head around it, you glance about the room. The light comes from a lantern left resting on a bookshelf. Aside from that evidence, it appears the room\n" +
                    "is empty. You creep inside and look around. Nothing under the table. Nothing behind the curtains. You move to the bookshelf when you notice the flame of \n" +
                    "your candle flicker slightly. It would appear a draft is coming from somewhere. You look to the windows, but find them completely shut. You stare at the bookshelf\n" +
                    "suspiciously. The next thing you know, you're pulling on book spines, looking for access to what you believe must be a secret passageway. You've read about this\n" +
                    "before and know the book trigger trick well! For a long time, nothing happens, until, at last, you hear a soft click, and the bookshelf swings outward, revealing a\n" +
                    "stone staircase. You look up the stony stairs and wonder what might rest at the top of them. Treasure? Danger? There's only one way to find out. Carefully, you climb\n" +
                    "until you reach the landing. You hear a soft voice coming from the room in front of you. Inching forward, you crane your neck to see the source of the sound. Gasping,\n" +
                    "you cover your mouth to stifle your scream. In the middle of the room, with her back to you, stands a witch, bending over a steaming cauldron, murmuring an incantation\n" +
                    "of some sort. You can't make out everything, but you catch bits and pieces. 'Suffering', 'pain', 'death to the kingdom'. None of this seems promising. You have to stop her!\n ");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Knock over the cauldron");
                System.out.println("(2) Grab something heavy to knock the witch out");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        knockTheCauldron();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        grabSomethingHeavy();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }


        public void followTheFigure() {
            System.out.println("\nTaking one last look at the glowing light beneath the door, you spin on your heels and race down the hallway after the mysterious figure. They've got a head start, but\n" +
                    "you're confident you can catch them. You rush down the main staircase, leaping from the last few stairs and land in the main foyer. You stand and listen. A clink from the kitchen!\n" +
                    "Dashing to the right, you round the corner into the kitchen only to find your friend, Sam, sitting at the table, enjoying a large slice of watermelon. 'What on earth are you doing\n" +
                    "in the kitchen at this time of night? You startled me!' you scold. Sam smiles as watermelon juice drips onto the table. 'I woke up starving, and I remembered we had lots of fresh\n" +
                    "watermelon from the garden, so I came down for a bite. No one will know...unless you tell them,' Sam replies. You attempt to look threatening, but can't keep it up. You laugh softly and\n" +
                    "sit at the table. Sam passes you a piece of watermelon. You take it, and as you sink your teeth into the crunchy sweetness, you're satisfied with your choice. ");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "-----------------------------The End--------------------------------\n" +
                    "---------------Have a Taste for Adventure? Try Again!---------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void knockTheCauldron() {
            System.out.println("\nStanding in the doorway, you watch the witch carefully looking for the perfect opportunity to foil her sinister plans. She continues to add ingredients to the bubbling\n" +
                    "pot. You see her toss what looks to be a small creature into the pot and hear the concoction hiss with satisfaction. The witch chuckles softly as she shuffles around the cauldron. You stand\n" +
                    "a bit straighter as you see she is heading for a wobbly cabinet in the corner. Holding your breath you watch as she bends, with some difficulty, down to retrieve an item from the bottom \n" +
                    "shelf. This is your chance! You spring from your hiding spot and dash to the pot. It's only when you're standing exposed in the center of the room that you realize the error in your plan.\n" +
                    "The pot is scalding hot. You look for some sort of barrier to protect your hands, keeping an eye on the witch, still bent over, oblivious to your presence. Finding no tool sufficient, you pull the\n" +
                    "fabric of your pajamas out and grab the edge of the pot. With all of your might you push, hoping to spill the contents across the floor and put a stop to the witch's evil plans. Instead,\n" +
                    "you end up running in place as the cauldron will not budge. You pull. You push. The cauldron remains, the potion gurgling and simmering within. 'Well, well, well,' comes a gravely voice from\n" +
                    "across the room. 'Such a wonderful surprise.' The witch smiles and looks at you with interest. You open your mouth, but no words come. All you can think to do is run. You head for the stairs,\n" +
                    "but a door you hadn't noticed slams shut in front of you, blocking your escape. You hear a chuckle and turn slowly to see the witch approaching. Though she appeared to hobble and struggle before,\n" +
                    "now she glides across the room. 'I knew you would come. A little noise, a little light, the children always get curious,' she whispers. She leans in close, so close you can feel her breath. With\n" +
                    "her bony, spotted hands she reaches out and grabs a strand of your hair, sniffing and grinning in satisfaction. 'Perfect!' she announces to the room. 'What's perfect?' you manage to ask. 'Why, you'\n" +
                    "are, my dear. The last ingredient!' she cackles. You gulp, frozen in terror.");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "----------------You Have Been Captured By the Witch!----------------\n" +
                    "----------------------The Adventure is Over!------------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing

            mainMenu();

        }

        public void grabSomethingHeavy() {
            System.out.println("\nWhile the witch is preoccupied with her spell, you glance around for a weapon of some sort. If you can push pause on her plans, you can determine how best to end this madness. Your eyes fall\n" +
                    "on a broom. Too flimsy. You spot a glass jar filled with what appear to be eyeballs. Too small. Finally you spot something suitable, a large black kettle. After ensuring the witch is still busy with her spell,\n" +
                    "you creep to the table, bracing yourself for disaster as you lift the kettle off the hook from which it hangs. You glance nervously back at the witch, certain she must have heard the scrape of the metal slipping\n" +
                    "off the rack, but her preoccupation with her concoction continues. Turning to face her, you move across the room. Each step closer heightens the possibility of detection. As you draw nearer, you are startled\n" +
                    "as a cat emerges from the shadows, hissing its displeasure at your presence. You stare, frozen in place. The witch spins to see the source of the commotion. Her eyes widen upon seeing you standing just in front of\n" +
                    "her. She opens her mouth to speak, what she intends to say, you do not wait to discover. Swinging the kettle with all of your might, you strike her on the side of her head. She topples to the floor with a thud.\n" +
                    "You are in shock. The bubbling and popping from the cauldron reawakens your senses. The spell! You have to do something! ");
            boolean run = true;
            while (run) {
                System.out.println("\nDO YOU...");
                System.out.println("(1) Look for a way to stop the spell");
                System.out.println("(2) Go and find help");
                System.out.print("Please choose an option>>>>>> ");
                try {
                    String userChoice = input.nextLine();
                    int userChoiceInt = Integer.parseInt(userChoice);
                    if (userChoiceInt == 1) {
                        stopTheSpell();
                        run = false;
                    } else if (userChoiceInt == 2) {
                        goFindHelp();
                        run = false;
                    } else {
                        System.out.println("Sorry, that was an invalid response.\n");
                    }

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, that was an invalid response.\n");
                }
            }
        }

        public void stopTheSpell() {
            System.out.println("\nStepping over the crumpled body of the witch, you race to the edge of the cauldron. Inside the pot, a black liquid swirls and simmers like an ominous cloud. It begins to rise and pour\n" +
                    "over the edge of the pot. It snakes across the floor and out a small window in the corner of the room. The kingdom! The spell will destroy the kingdom! You have to stop it. Frantically, you scan the\n" +
                    "room until you spot it: the witch's spellbook sitting on a pedestal near the fire. Looking down at its tattered yellow pages, you wonder how many lives have been ruined by this collection of chaos. \n" +
                    "The book is open to a page with a spell titled 'Dram of Death'. You look to the cat, sitting quietly by the cauldron, flicking its tail, watching you thoughtfully. 'Dram of Death, huh?' you say and \n" +
                    "though you tell yourself you imagine it, the cat appears to smile. Skimming the page, you search for a way to stop the spell. You consider spilling the contents of the cauldron, but worry that will \n" +
                    "only hasten the black cloud's attack on the kingdom. Finally, you spot it! A small note with the incantation to halt the spell's progression. With all the confidence you can muster you read:\n" +
                    "'The Dram of Death that has begun\n" +
                    "Must now be stopped, what's done, undone\n" +
                    "Return to rest, do as I say\n " +
                    "Until you're called another day.'\n" +
                    "You watch eagerly for some change, and breathe a sigh of relief as the black cloud begins to swirl and return to the cauldron. Like a river flowing in reverse, the substance travels back through the \n" +
                    "window until it, once settles into the cauldron, now a harmless liquid. You smile with pride. You did it!   ");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "--------------------Nice work! You saved the day!-------------------\n" +
                    "------------------The Adventure is Over...For Now!------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }

        public void goFindHelp() {
            System.out.println("\nYou have to stop this! You have to find help! You turn and quietly rush back down the stairs, through the library, and into the hall. Racing to your parents' room, you throw the door open\n" +
                    "and holler for them to get up. They spring from the bed, as you turn around and race back to the tower. You hear them stumbling behind you as you race back to the tower. Up the stairs you rush, two at a\n" +
                    "time. 'This way!' you call down the stairs, your father's face just appearing at the bottom of the secret passageway. He sprints up the stairs to you, placing his hand on your shoulder as he steps past\n" +
                    "you and into the room. You follow a few steps behind, looking for the crumpled figure of the witch on the ground. She is not there. 'The witch! Where is she?' you gasp. Your mother joins the two of you\n" +
                    "as you look around for any trace of the witch. It soon becomes clear she has awakened and vanished. How foolish of you to have left her unmonitored, but you needed help to prevent the spell...the spell!\n" +
                    "Rushing to the cauldron, you peer inside to see a swirling black mist, like staring into the center of a tornado. It's almost entrancing, the circling black cloud. It's only when you feel the presence of\n" +
                    "your mother behind you that you notice the smoke is beginning to pour out over the edge of the pot. You step back, bumping into your parents as you do so. The smoke snakes forward, wrapping around your\n" +
                    "and ankles, climbing up your legs. You look down in horror as it continues to climb, seeming to swallow you whole. You turn to your parents, only to discover the same thing is happening to them. You reach\n" +
                    "for their hands, but before your fingertips touch, the darkness consumes you. ");
            System.out.println("\n--------------------------------------------------------------------\n" +
                    "-------------The Spell Has Been Cast! You Have Perished-------------\n" +
                    "-----------------------The Adventure is Over!-----------------------\n" +
                    "--------------------------------------------------------------------\n");
            System.out.println("\n[enter] to Main Menu");
            input.nextLine(); //make the user hit enter before continuing
            mainMenu();
        }
    }










