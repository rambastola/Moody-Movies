
import java.util.Scanner;  // Import the Scanner class

class MoodyMovies
{

    public static void main(String args[])
    {
      Scanner input = new Scanner(System.in); //scanner object
      System.out.print("What's your current mood?: ");
      String mood = input.next(); //store the input value
      genre(mood);
    }
    public static void imdbURL(String genre){

      String url = "http://www.imdb.com/search/title?genres=" +genre+ "&title_type=feature&sort=moviemeter";
      System.out.print(url);
    }

    public static void genre(String mood) {
      /* Mood to Genre:
      Sad – Drama
      Disgust – Musical
      Anger – Family
      Anticipation – Thriller
      Fear – Sport
      Enjoyment – Thriller
      Trust – Western
      Surprise – Film-Noir
      */
      switch (mood){

        case "Sad":
        mood = "Drama";
        break;

        case "Disgust":
        mood = "Musical";
        break;

        case "Anger":
        mood = "Family";
        break;

        case "Anticipation": case "Enjoyment":
        mood = "Thriller";
        break;

        case "Fear":
        mood = "Sport";
        break;

        case "Trust":
        mood = "Western";
        break;

        case "Surpirse":
        mood = "Film-Noir";
        break;

        default:

        System.out.println("Please ensure your mood is one of the following: \n Sad, Disgust, Anger, Anticipation, Fear, Enjoyment, Trust, Surpirse");
        break;
      }
      imdbURL(mood);
      System.out.println(mood);

    }

}
