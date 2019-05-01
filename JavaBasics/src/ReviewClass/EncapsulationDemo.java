package ReviewClass;

class EncapsulationDemo{
private long acc_no;  
private String name,email;  
private float amount;  
public void setName(String name){
  this.name = name;
}
public void setEmail(String email){
  this.email = email;
}
public void setAcc(long acc_no){
  this.acc_no = acc_no;
}
public void setAmount(float amount){
  this.amount = amount;
}
public String getName(){
  return name;
}
public String getEmail(){
  return email;
}
public float getAmount(){
  return amount;
}
public long getAcc(){
  return acc_no;
}
}
class Main {
  public static void main(String[] args) {
    EncapsulationDemo obj =new EncapsulationDemo();
    obj.setAcc(7560504000l);
    obj.setName("Sumair");
    obj.setEmail("sumair@syntaxsolutions.com ");
    obj.setAmount(500000.0f);
    	System.out.println(obj.getAcc()+ " " + obj.getName()+ " " + obj.getEmail()+ " " + obj.getAmount());
  }
}