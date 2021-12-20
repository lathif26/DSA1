
public class Mentee
{
    // Instance Variable
    private int uid;
    private String name;
    private int age;
    private String email;

    // Instance Methods => getters setters
    // Getter => which is used to get the value of a private instance variable
    public int getUid()
    {
        return uid;
    }
    // Setter => which is used to set the value of a private instane variable
    public void setUid(int u)
    {
        uid = u;
    }
  //public int getAge()
  //{
   // return age;
   //}
  //public void setAge(int a)
    //{
    //age = a;
    //}
    //public static string getName()
    //{
    // return name;
    //}
    //public static void string setName(string s)








}

 class MyClass {
    public static void main(String args[]) {
        Mentee m1 = new Mentee();
        // m1.uid = 10; // Error   Set the value of uid to 10
        m1.setUid(10);



        System.out.println(m1.getUid());
    }
}
