import java.util.Scanner;

public class Test_Single_List {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        single_linked_list <String> list =new single_linked_list<>();
        int choice =-1;

        while (choice!=0){
            System.out.println("1 add first\n2 add last\n 3 remove first \n 0 exit");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name ");
                    list.addfirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addlast(in.next());
                    break;
                case 3:
                    System.out.println("remove "+ list.removeFirst());
                    break;
                default:
                    System.exit(0);
            }
            System.out.println();
            System.out.println("first :"+list.first()+"\n "+"last :"+ list.last()+ "\n"+"size :"+list.size());
        }


    }
}
