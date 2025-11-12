import java.util.Scanner;

/**
 * A simple program that recommends a hobby
 * based on the user’s yes/no answers.
 *
 * @author Jaiah Royal L27
 * @version 2025-09-21
 *
 */

public class HobbyRecommender {

    // Questions
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
    public static final String HOBBY_ONE = "My Hobby Recommendation: Painting";
    public static final String HOBBY_TWO = "My Hobby Recommendation: Programming";
    public static final String HOBBY_THREE = "My Hobby Recommendation: Board Games";
    public static final String HOBBY_FOUR = "My Hobby Recommendation: Cooking";
    public static final String HOBBY_FIVE = "My Hobby Recommendation: Football";
    public static final String HOBBY_SIX = "My Hobby Recommendation: Cycling";
    public static final String HOBBY_SEVEN = "My Hobby Recommendation: Weightlifting";
    public static final String HOBBY_EIGHT = "My Hobby Recommendation: Jogging";
    public static final String HOBBY_NINE = "My Hobby Recommendation: Fishing";
    public static final String HOBBY_TEN = "My Hobby Recommendation: Wildlife Photography";
    public static final String HOBBY_ELEVEN = "My Hobby Recommendation: Go-karting";
    public static final String HOBBY_TWELVE = "My Hobby Recommendation: Kite Flying";
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(WELCOME_MESSAGE);
        System.out.println(INITIAL);

        String interests = scan.nextLine().toLowerCase();

        if (interests.equals("no")) {
            // not interested in hobby recommender
            System.out.println(GOODBYE_MESSAGE);
        } else if (interests.equals("yes")) {
            // is interested in hobby recommender
            System.out.println(INDOOR);
            String indoor = scan.nextLine().toLowerCase();
            
            if (indoor.equals("yes")) {
                // likes indoor hobbies
                System.out.println(ART);
                String art = scan.nextLine().toLowerCase();
                
                if (art.equals("yes")) {
                    // likes artistic hobbies
                    System.out.println(HOBBY_ONE); // suggests painting
                    System.out.println(GOODBYE_MESSAGE);
                } else if (art.equals("no")) {
                    // does not like artistic hobbies
                    System.out.println(TECHNICAL);
                    String tech = scan.nextLine().toLowerCase();

                    if (tech.equals("yes")) {
                        // likes technical hobbies
                        System.out.println(HOBBY_TWO); // suggests programming
                        System.out.println(GOODBYE_MESSAGE);
                    } else if (tech.equals("no")) {
                        // does not like technical hobbies
                        System.out.println(SOCIAL);
                        String social = scan.nextLine().toLowerCase();

                        if (social.equals("yes")) {
                            // likes social hobbies
                            System.out.println(HOBBY_THREE); // suggests board games
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (social.equals("no")) {
                            // does not like social hobbies
                            System.out.println(HOBBY_FOUR); // suggests cooking
                            System.out.println(GOODBYE_MESSAGE);
                        }
                    }
                }

            } else if (indoor.equals("no")) {
                // does not like indoor hobbies
                System.out.println(PHYSICAL);
                String physical = scan.nextLine().toLowerCase();

                if (physical.equals("no")) {
                    // does not like physical hobbies
                    System.out.println(NATURE);
                    String nature = scan.nextLine().toLowerCase();

                    if (nature.equals("yes")) {
                        // likes hobbies involving nature
                        System.out.println(WATER);
                        String water = scan.nextLine().toLowerCase();

                        if (water.equals("yes")) {
                            // likes water hobbies
                            System.out.println(HOBBY_NINE); // suggest fishing
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (water.equals("no")) {
                            // does not like water hobbies
                            System.out.println(HOBBY_TEN); // suggests wildlife photography
                            System.out.println(GOODBYE_MESSAGE);
                        }

                    } else if (nature.equals("no")) {
                        // does not like hobbies involving nature
                        System.out.println(THRILLING);
                        String thrill = scan.nextLine().toLowerCase();

                        if (thrill.equals("no")) {
                            // does not like thrilling hobbies
                            System.out.println(HOBBY_TWELVE); // suggests kite flying
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (thrill.equals("yes")) {
                            // likes thrilling hobbies
                            System.out.println(HOBBY_ELEVEN); // suggets go-karting
                            System.out.println(GOODBYE_MESSAGE);
                        }
                    }

                } else if (physical.equals("yes")) {
                    // likes physical hobbies
                    System.out.println(SPORTS);
                    String sports = scan.nextLine().toLowerCase();

                    if (sports.equals("yes")) {
                        // likes sport hobbies
                        System.out.println(HOBBY_FIVE); // suggests football
                        System.out.println(GOODBYE_MESSAGE);
                    } else if (sports.equals("no")) {
                        // does not like sport hobbies
                        System.out.println(TRAINING);
                        String training = scan.nextLine().toLowerCase();

                        if (training.equals("yes")) {
                            // likes training hobbies
                            System.out.println(HOBBY_SIX); // suggests cycling
                            System.out.println(GOODBYE_MESSAGE);
                        } else if (training.equals("no")) {
                            // does not like training hobbies
                            System.out.println(GYM);
                            String gym = scan.nextLine().toLowerCase();

                            if (gym.equals("yes")) {
                                // likes gym hobbies
                                System.out.println(HOBBY_SEVEN); // suggests weightlifing
                                System.out.println(GOODBYE_MESSAGE);
                            } else if (gym.equals("no")) {
                                // does not like gym hobbies
                                System.out.println(HOBBY_EIGHT); // suggests jogging
                                System.out.println(GOODBYE_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}
