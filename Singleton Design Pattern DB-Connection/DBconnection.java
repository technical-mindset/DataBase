public class Main {
    public static void main(String[] args) {
          DBConnection obj1 = DBConnection.getMethod();
        DBConnection obj2 = DBConnection.getMethod();
        DBConnection obj3 = DBConnection.getMethod();
        DBConnection obj4 = DBConnection.getMethod();
        System.out.println(obj1); // displaying some address
        System.out.println(obj2); // obj2, obj3 & obj4 printing same address as obj 1 
        System.out.println(obj3);
        System.out.println(obj4)
    }
}

//Singleton Design Pattern for one time DB Connection
class DBConnection{
    private static DBConnection dbInstance = null;
    private DBConnection(){}

   //By using this technique not new intance created for a connection so it will reduce the some load
    public static DBConnection getMethod() {
        if (dbInstance == null) {
            dbInstance = new DBConnection();
        }
        return dbInstance;
    }
}
