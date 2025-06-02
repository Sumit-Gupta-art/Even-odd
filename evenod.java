import java.util.Scanner;
class evenod
{
    public static void main(String[] args)
    {
        System.out.println("Enter anumber: ");
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        String[] str={"Even","odd"};
        System.out.println(str[n%2]);
        
    }
}
