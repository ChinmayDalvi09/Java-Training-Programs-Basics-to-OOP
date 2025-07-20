public class Introduction {
    public static void intro(){
        String name="Chinmay Dalvi";
        String edu="Bachelor of Engineering in Computer Science";
        String hobbies="Drawing, Coding, traveling";
        String dreamJob = "Software Engineer at Google";

        System.out.println("Hello! My name is " + name + ".");
        System.out.println("My education: " + edu + ".");
        System.out.println("My hobbies are: " + hobbies + ".");
        System.out.println("My dream job is: " + dreamJob + ".");
    }

    //main method
    public static void main(String[] args) {
        intro();  //calling static method
    }
}
