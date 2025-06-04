// To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        String world="lol";
        boolean isplain=true;
        for (int i = 0; i <world.length()/2; i++) {
             if(world.charAt(i)!=world.charAt(world.length()-1-i)){
                isplain=false;
                break;
             }
        }
        if(!isplain){
             System.out.println("Not plaindorme");
        }else{
            System.out.println("Plaindorme");
        }
        
    }
}
