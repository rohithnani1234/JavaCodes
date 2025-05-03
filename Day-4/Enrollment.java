public class Enrollment {
  public static void main(String[] args) {
    Enrollment enrollment = new Enrollment();
    String enrollmentInfo1 = enrollment.getEnrollmentInfo("Udemy", "Java Programming", "Alice"); 
    String enrollmentInfo2 = enrollment.getEnrollmentInfo("Udemy", "Web Development", "Bob");
    System.out.println(enrollmentInfo1);
    System.out.println("------------------");
    System.out.println(enrollmentInfo2);
    System.out.println("------------------");
  }
  public String getEnrollmentInfo(String platform, String course, String student){
    return "Platform: " + platform + "\n" +
           "Course: " + course + "\n" +
           "Student: " + student;
  }
}
