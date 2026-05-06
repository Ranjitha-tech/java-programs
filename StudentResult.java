class StudentResult{
    public static void main(String[]args)
    {
       int marks=89;
       if(marks>80 && marks<100)
       {
        System.out.println("Passed with Distinction");
       }
       else if(marks>60 && marks<79)
       {
        System.out.println("First Class");
       }
       else if(marks>35 && marks<59)
       {
        System.out.println("Second class");
       }
       else if(marks>0 && marks<35)
       {
        System.out.println("fail");
       }
       else
       {
        System.out.println("Not valid");
       }
    }
}