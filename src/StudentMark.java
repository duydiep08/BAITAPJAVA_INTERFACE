public class StudentMark implements IStudentMark {
  String FullName;
  int ID;
  String Class1;
  int Semester;
  float AverageMark;

  public StudentMark(){
      FullName = "Diep";
      ID = 123;
      Class1 = "ABC";
      Semester = 1;
      AverageMark = 0.0f;
  }

  public  StudentMark(String FullName,int ID, String Class1, int Semester, float AverageMark, int[] SubjectMarkList){
      this.FullName = FullName;
      this.ID= ID;
      this.Class1 = Class1;
      this.Semester = Semester;
      this.AverageMark = AverageMark;
      SubjectMarkList = SubjectMarkList;
  }

  //GETTER
    public String getFullName(){
      return FullName;
    }
    public  int getID(){
      return ID;
    }
    public String getClass1(){
      return Class1;
    }
    public int getSemester(){
      return Semester;
    }
    public float getAverageMark(){
      return AverageMark;
    }

    //SETTER
    public void setFullName(String FullName){
      this.FullName =FullName;
    }
    public void setID(int ID){
      this.ID = ID;
    }
    public void setClass1(String Class1){
      this.Class1 = Class1;
    }
    public void setSemester(int Semester){
      this.Semester = Semester;
    }

    @Override
    public void Display() {
        System.out.println("FullName: " +FullName);
        System.out.println("ID: " +ID);
        System.out.println("Class: " +Class1);
        System.out.println("Semester: "+Semester);
        System.out.println("Average Mark: "+AverageMark);
    }

    int[] SubjectList = new int[3];

  void AveCal(){
      AverageMark = (float)(SubjectList[0]+SubjectList[1]+SubjectList[2])/SubjectList.length;
  }
}

