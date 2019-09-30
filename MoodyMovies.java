//import org.jsoup.Jsoup;

import java.util.Scanner;  // Import the Scanner class

class MoodyMovies
{
//	Map<String, String> dictionary = new HashMap<String, String>();
//	dictionary.put("key", "value");
//	String value = dictionary.get("key");

    public static void main(String args[])
    {
      Scanner input = new Scanner(System.in); //scanner object
      System.out.print("What's your current mood?: ");
      String mood = input.next(); //store the input value
      input.close();
      genre(mood);
    }
    public static void imdbURL(String genre){

      String url = "http://www.imdb.com/search/title?genres=" +genre+ "&title_type=feature&sort=moviemeter";
      System.out.print(url);
    }

    public static void genre(String mood) {

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
    }

}
