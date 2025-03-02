import java.util.Random;
public class dice {
    public static void main(String[] args){
        Random random= new Random();
        int result=random.nextInt(6)+1;
        System.out.println("You rolled a: "+ result);

    }

}
