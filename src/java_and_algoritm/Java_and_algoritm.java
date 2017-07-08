//This is the main file. Run any class from here.
package java_and_algoritm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_and_algoritm {

    HttpURLConnection connection = null;
    URL u = null;

    public String check_website(String url,String status) throws MalformedURLException, IOException {

        try {

            //status = "offline";
            u = new URL("cvasu.ac.bd");
            connection = (HttpURLConnection) u.openConnection();
            connection.setRequestMethod("HEAD");

            try {
                int code = connection.getResponseCode();
                if (code == 200) {
                    return status = "Online";
                }
            } catch (Exception e) {
                return status = "Offline";
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
            return status;
        }
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Java_and_algoritm test = new Java_and_algoritm();
        String website = "cvasu.ac.bd";
        System.out.println(test.check_website(null, null));
        
    }

//    public static void main(String[] args) throws IOException {
//
//        try {
//
//            u = new URL("http://cvasu.ac.bd/");
//            connection = (HttpURLConnection) u.openConnection();
//            connection.setRequestMethod("HEAD");
//
//            try {
//                int code = connection.getResponseCode();
//                if (code == 200) {
//                    System.out.println("Website is Online");
//                }
//            } catch (Exception e) {
//                System.out.println("Website offline");
//            }
//
//        } finally {
//            if (connection != null) {
//                connection.disconnect();
//            }
//        }
//
//    }

}
