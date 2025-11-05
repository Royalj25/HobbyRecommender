import java.util.Scanner;

/**
 * A simple program that recommends a hobby
 * based on the user’s yes/no answers.
 *
 * @author Jaiah Royal L27
 * @version 2025-09-21
 *
 * 
 *
 * 
 */

public class HobbyRecommender {

    public static final String WELCOME_MESSAGE = "Welcome to the Hobby Recommender!";
    public static final String INITIAL = "Are you interested in finding a new hobby?";
    public static final String INDOOR = "Do you prefer indoor hobbies?";
    public static final String ART = "Do you enjoy artistic activities?";
    public static final String TECHNICAL = "Do you like technical hobbies?";
    public static final String SOCIAL = "Do you prefer social activities?";
    public static final String PHYSICAL = "Do you like physical exercise?";
    public static final String NATURE = "Do you enjoy being close to nature?";
    public static final String THRILLING = "Do you enjoy thrilling activities?";
    public static final String SPORTS = "Do you enjoy team sports?";
    public static final String TRAINING = "Do you like strength training?";
    public static final String GYM = "Do you enjoy the gym environment?";
    public static final String WATER = "Do you enjoy water based activities?";
    public static final String GOODBYE_MESSAGE = "Thank you for using" + 
        " the Hobby Recommender!";

    // Hobby recommendations
    public static final String HOBBY_ONE = "Painting";
    public static final String HOBBY_TWO = "Programming";
    public static final String HOBBY_THREE = "Board Games";
    public static final String HOBBY_FOUR = "Cooking";
    public static final String HOBBY_FIVE = "Football";
    public static final String HOBBY_SIX = "Cycling";
    public static final String HOBBY_SEVEN = "Weightlifting";
    public static final String HOBBY_EIGHT = "Jogging";
    public static final String HOBBY_NINE = "Fishing";
    public static final String HOBBY_TEN = "Wildlife Photography";
    public static final String HOBBY_ELEVEN = "Go-karting";
    public static final String HOBBY_TWELVE = "Kite Flying";
    
    // ------------------------- DO NOT MODIFY ABOVE -------------------------
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(WELCOME_MESSAGE);
        System.out.println(INITIAL);

        String interests = scan.nextLine().toLowerCase();

        if (interests.equals("no")) {
            System.out.println(GOODBYE_MESSAGE);
        } else if (interests.equals("yes")) {

            System.out.println(INDOOR);
            String indoor = scan.nextLine().toLowerCase();

            if (indoor.equals("yes")) {
                System.out.println(ART);
                String art = scan.nextLine().toLowerCase();

                if (art.equals("yes")) {
                    System.out.println(HOBBY_ONE);
                    System.out.println(GOODBYE_MESSAGE);
                } else if (art.equals("no")) {
                    System.out.println(TECHNICAL);
                    String tech = scan.nextLine().toLowerCase();

                    if (tech.equals("yes")) {
                        System.out.println(HOBBY_TWO);
                        System.out.println(GOODBYE_MESSAGE);
                    } else if (tech.equals("no")) {
                        System.out.println(SOCIAL);
                        String social = scan.nextLine().toLowerCase();

                        if (social.equals("yes")) {
                            System.out.println(HOBBY_THREE);
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (social.equals("no")) {
                            System.out.println(HOBBY_FOUR);
                            System.out.println(GOODBYE_MESSAGE);
                        }
                    }
                }

            } else if (indoor.equals("no")) {

                System.out.println(PHYSICAL);
                String physical = scan.nextLine().toLowerCase();

                if (physical.equals("no")) {

                    System.out.println(NATURE);
                    String nature = scan.nextLine().toLowerCase();

                    if (nature.equals("yes")) {
                        System.out.println(WATER);
                        String water = scan.nextLine().toLowerCase();

                        if (water.equals("yes")) {
                            System.out.println(HOBBY_NINE);
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (water.equals("no")) {
                            System.out.println(HOBBY_TEN);
                            System.out.println(GOODBYE_MESSAGE);
                        }

                    } else if (nature.equals("no")) {
                        System.out.println(THRILLING);
                        String thrill = scan.nextLine().toLowerCase();

                        if (thrill.equals("no")) {
                            System.out.println(HOBBY_TWELVE);
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (thrill.equals("yes")) {
                            System.out.println(HOBBY_ELEVEN);
                            System.out.println(GOODBYE_MESSAGE);
                        }
                    }

                } else if (physical.equals("yes")) {

                    System.out.println(SPORTS);
                    String sports = scan.nextLine().toLowerCase();

                    if (sports.equals("yes")) {
                        System.out.println(HOBBY_FIVE);
                        System.out.println(GOODBYE_MESSAGE);
                    } else if (sports.equals("no")) {
                        System.out.println(TRAINING);
                        String training = scan.nextLine().toLowerCase();

                        if (training.equals("yes")) {
                            System.out.println(HOBBY_SIX);
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (training.equals("no")) {
                            System.out.println(GYM);
                            String gym = scan.nextLine().toLowerCase();

                            if (gym.equals("yes")) {
                                System.out.println(HOBBY_SEVEN);
                                System.out.println(GOODBYE_MESSAGE);
                            } else if (gym.equals("no")) {
                                System.out.println(HOBBY_EIGHT);
                                System.out.println(GOODBYE_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}
