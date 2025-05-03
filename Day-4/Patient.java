public class Patient {
  public static void main(String[] args) {
    Patient p=new Patient();
    p.printDetails("City Care Hospital","John Doe",45);
    p.printDetails("City Care Hospital","Emma Watson",30);
  }
  public void printDetails(String hospitalName, String patientName, int age){
    System.out.println("Hospital Name: " + hospitalName);
    System.out.println("Patient Name: " + patientName);
    System.out.println("Patient Age: " + age);
  }
}
