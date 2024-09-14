package loopsLesson;


public class whileLesson {

    public static void main(String[] args) throws InterruptedException {

        int i = 0 ;

        while (i != 100) {
            Thread.sleep(75);
            i++;
            if(i>75){
                System.out.println(i+ " getting close");
            }
            else System.out.println(i);
                  }
    }
}
