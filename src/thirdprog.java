class Thirdprog{
            public static void main(String args[]){
                int a[] = new int[10];
                System.out.println("Enter the numbers : ");
                Scanner s=new Scanner(System.in);
                for(int i=0;i<a.length-1;i++){
                    a[i]=s.nextInt();
                }
                System.out.println("The numbers are : \n")
                for(int i=0;i<a.length-1;i++){
                    System.out.println(a[i]);
                }
    }
}