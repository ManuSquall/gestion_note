import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ControlSaisie {


    public static int SaisieEntier(){
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            n=Integer.parseInt(br.readLine());
        }catch(Exception e){
            return -1;
        }
        return n;
    }

    public static String SaisieChaine(){
        String chaine;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            chaine = br.readLine();
        }catch(Exception e){
            chaine= "error";
        }
        return chaine;
    }

}
