class Stu
{
    int rollno;
    int arr[];

    public Stu(int rollno, int[] arr) {
        this.rollno = rollno;
        this.arr = arr;
    }
    public void display(){
        System.out.println(rollno);
        for(int res:arr){
            System.out.println(res);
        }
    }
}

public class Demo1 {
    public static void main(String[] args){
        Stu obj1=new Stu(23,new int[]{23_000,56,78,98});
        obj1.display();
    }

}
// big integer is predefined class.(important)
// bid decimal
