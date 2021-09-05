package IPclient;

public class CompanyProject {
    private final String id;
    private final String FirstName;
    private final String LastName;
    private final int age;
    private final Client client;

    public CompanyProject(String id, String firstName, String lastName, int age, Client client) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.client = client;
    }

    public String getId() {return id;}

    public String getFirstName() {return FirstName;}

    public String getLastName() {return LastName;}

    public int getAge() {return age;}

    public Client getClient() {return client;}

    @Override
    public String toString() {
        return "CompanyProject{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", client=" + client +
                '}';
    }
}
