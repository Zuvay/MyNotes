import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Inputvetarih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir şeyler yaz");
        String stringType = input.nextLine();
        System.out.println(stringType);

        // nextBoolean()	Reads a boolean value from the user
        // nextByte()	Reads a byte value from the user
        // nextDouble()	Reads a double value from the user
        // nextFloat()	Reads a float value from the user
        // nextInt()	Reads a int value from the user
        // nextLine()	Reads a String value from the user
        // nextLong()	Reads a long value from the user
        // nextShort()	Reads a short value from the user

        // Tarih ve Saatler

        // LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
        // LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
        // LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
        // DateTimeFormatter	Formatter for displaying and parsing date-time objects

        LocalDate bugun = LocalDate.now(); 
        System.out.println("Bugünün tarihi "+ bugun); 

        LocalTime saat = LocalTime.now();
        System.out.println("Şu an Saat " + saat);

        LocalDateTime ikisi = LocalDateTime.now();
        System.out.println("Tarih ve saat " + ikisi); //Burada çok karışık geldiği için bunu formatlayabiliriz.

        DateTimeFormatter formatAtıyoruz = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatlıhali = ikisi.format(formatAtıyoruz);
        System.out.println("Formatlı hali -->" +formatlıhali);

        // ofPattern için kullanabileceğimiz format türleri:
        // yyyy-MM-dd     -->	"1988-09-29"	
        // dd/MM/yyyy     -->	"29/09/1988"	
        // dd-MMM-yyyy    -->	"29-Sep-1988"	
        // E, MMM dd yyyy -->	"Thu, Sep 29 1988"
    }

}
