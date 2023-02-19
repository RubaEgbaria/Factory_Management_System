package hw1_java;

public class Factory {
  private String Number;
  private String name;
  private Manager ceo;
  private Department[] depts;

  public Factory(String Number, Manager ceo, String name,  Department[] depts) {
    this.Number = Number;
    this.ceo = ceo;
    this.name = name;
    this.depts = depts;
  }
  public void setCeo(Manager ceo) {
	    this.ceo = ceo;
	  }

  public void setDepts(Department[] depts) {
	    this.depts = depts;
	  }
	  
  public String getNumber() {
    return Number;
  }

  public String getName() {
    return name;
  }

  public Manager getCEO() {
    return ceo;
  }

  public Department[] getDepts() {
    return depts;
  }


}