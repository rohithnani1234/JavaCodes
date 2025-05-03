public class Faculty {
  public static void main(String[] args) {
    Faculty f=new Faculty();
    f.showFacultyDetails("Stanford University","Dr. Robert Brown","Computer Science");
    f.showFacultyDetails("Stanford University","Dr. Lisa Green","Physics");
  }
  public void showFacultyDetails(String universityName, String facultyName, String department){
    System.out.println("University Name: " + universityName);
    System.out.println("Faculty Name: " + facultyName);
    System.out.println("Department: " + department);
  }
}
