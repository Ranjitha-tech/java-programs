class GameScore{
    public static void main(String[]args)
    {
        int score=60;
        if(score<50)
        {
            System.out.println("You need to improve");
        }
        else if(score>50 && score<70)
        {
            System.out.println("Good job");
        }
        else if(score>70)
        {
            System.out.println("Excellent Performance");
        }
    }
}