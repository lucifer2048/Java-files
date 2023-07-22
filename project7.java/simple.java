

public class simple {
    public static void main(String[] args) {
        a obj = new a();
        // System.out.println(obj.data);
        obj.display_data();
    }
}

class a {
    public int data = 40;
    void display_data()
    {
        System.out.println("data value "+data);
    }
}
